package kr.co.sboard.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
public class PageResponseDTO {
    // 페이지 번호의 정보를 가지고 있는 DTO
    private String cate;
    private List<ArticleDTO> dtoList;
    private int pg; //페이지번호
    private int size;// 10개씩
    private int total; //전체 글 개수
    private int pageStart; // 글목록 시작번호
    private int start, end; //글 시작번호, 끝번호
    private boolean prev, next; //이전, 다음 페이지

    @Builder
    public PageResponseDTO(PageRequestDTO pageRequestDTO, List<ArticleDTO> dtoList, int total){
        this.cate = pageRequestDTO.getCate();
        this.pg = pageRequestDTO.getPg();
        this.size = pageRequestDTO.getSize();
        this.total = total; // 전체 글 개수
        this.dtoList = dtoList; //10개짜리 List

        this.end = (int) (Math.ceil(this.pg / 10.0)) * 10;
        this.start = this.end - 9;
        this.pageStart = total - start;
        int last = (int) (Math.ceil(total / (double) size));

        this.end = end > last ? last : end;
        this.prev = this.start > 1;
        this.next = total > this.end * this.size;
    }

}
