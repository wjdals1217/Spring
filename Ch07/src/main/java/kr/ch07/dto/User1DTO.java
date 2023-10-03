package kr.ch07.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Getter
  
@Setter
  
@ToString
  
@AllArgsConstructor
  
@NoArgsConstructor
/*
 * @Data
 * @RequiredArgsConstructor가 있는데 final이나 @NonNull인 필드값만 파라미터로 받는 생성자를 만들어준다.
 */ 
@Builder
 public class User1DTO {
	private String uid;
	private String name;
	private String hp;
	private int age;
}
