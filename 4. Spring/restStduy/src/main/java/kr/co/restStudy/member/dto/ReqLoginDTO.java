package kr.co.restStudy.member.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Schema(description="로그인 요청DTO")
public class ReqLoginDTO {
	@Schema(description="유저 아이디", example="asd")
	private String userId;
	@Schema(description="유저 비밀번호", example="zxcv456")
	private String password;
}
