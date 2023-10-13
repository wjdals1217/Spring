package kr.co.sboard.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PageRequestDTO {
    //DTO member initialize
    @Builder.Default
    private int pg = 1;

    @Builder.Default
    private int size=10;

    @Builder.Default
    private String cate="notice";

    public Pageable getPageable(String sort){ // sort 값에는 no가 들어감
        return PageRequest.of(this.pg-1, this.size, Sort.by(sort).descending());
    }
}
