package kr.co.studyProject.DTO;

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
@ToString
@Data
public class ReqHomeDTO {
	private Long id;
	private String userName;
	private String userId;
	private String email;
	private String password;
	private String passwordCheck;
}
