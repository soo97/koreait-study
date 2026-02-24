package kr.co.restStudy.member.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter 
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Schema(description="회원가입 요청DTO")
public class ReqRegisterDTO {
	@Schema(description="유저 이름", example="홍길동")
	private String userName;
	@Schema(description="유저 아이디", example="asd")
	private String userId;
	@Schema(description="유저 이메일", example="asd@naver.com")
	private String email;
	@Schema(description="비밀번호", example="zxcv456")
	private String password;
	@Schema(description="비밀번호 확인", example="zxcv456")
	private String passwordCheck;
}
