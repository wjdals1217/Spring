package kr.co.sboard.service;

import kr.co.sboard.dto.ArticleDTO;

import kr.co.sboard.dto.FileDTO;
import kr.co.sboard.dto.PageRequestDTO;
import kr.co.sboard.dto.PageResponseDTO;
import kr.co.sboard.entity.ArticleEntity;
import kr.co.sboard.repository.ArticleRepository;
import kr.co.sboard.repository.FileRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Log4j2
@Service
@RequiredArgsConstructor
public class ArticleService {

    private final ArticleRepository articleRepository;
    private final FileRepository fileRepository;
    private final ModelMapper modelMapper; //따로 Bean 설정을 해주어야함

    // 글목록 조회
    public PageResponseDTO findByParentAndCate(PageRequestDTO pageRequestDTO){

        Pageable pageable = pageRequestDTO.getPageable("no");

         Page<ArticleEntity> result = articleRepository.findByParentAndCate(0, pageRequestDTO.getCate(), pageable);

         List<ArticleDTO> dotList = result.getContent()
                                             .stream()
                                             .map(entity ->modelMapper.map(entity,ArticleDTO.class))
                                             .toList(); //10 개의 List
         int totalElement = (int) result.getTotalElements(); //entity의 개수
         return PageResponseDTO.builder()
                 .pageRequestDTO(pageRequestDTO)
                 .dtoList(dotList)
                 .total(totalElement)
                 .build();
    }
    
    // 글등록
    public void save(ArticleDTO dto){

        ArticleEntity savedEntity = articleRepository.save(dto.toEntity());

        // 파일업로드
        FileDTO fileDTO = fileUpload(dto);
        
        // 파일 DB에 추가
        if(fileDTO!= null){
            // 파일 등록
            fileDTO.setAno(savedEntity.getNo());
            fileRepository.save(fileDTO.toEntity());

            int count = fileRepository.countByAno(savedEntity.getNo());
            savedEntity.setFile(count);
            articleRepository.save(savedEntity);
        }
    }

    @Value("${spring.servlet.multipart.location}")
    private String filePath;

    public FileDTO fileUpload(ArticleDTO dto) {
        MultipartFile mf = dto.getFname();
        if(!mf.isEmpty()){          // 파일 첨부했을 경우
            // 절대경로 찾기
            String path = new File(filePath).getAbsolutePath();

            String oName = mf.getOriginalFilename();
            String ext = oName.substring(oName.lastIndexOf("."));
            String sName = UUID.randomUUID().toString()+ext;

            try {
                mf.transferTo(new File(path, sName));
            } catch (IOException e) {
                log.error(e.getMessage());
            }

            return FileDTO.builder().oriName(oName).newName(sName).build();

        }
        return null;
    }
}
