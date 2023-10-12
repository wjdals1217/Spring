package kr.co.sboard.dto;


import kr.co.sboard.entity.FileEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FileDTO {
    private int fno;
    private int ano;
    private String oriName;
    private String newName;
    private int download;
    private LocalDateTime rdate;

    public FileEntity toEntity(){
        return FileEntity.builder()
              .fno(fno)
              .ano(ano)
              .oriName(oriName)
              .newName(newName)
              .download(download)
              .rdate(rdate)
              .build();
    }
}
