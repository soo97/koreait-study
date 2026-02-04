package kr.co.training;

public class Ex24_2_Login implements Ex24_2_LoginInterface{
	String memberId = "id";
	String memberPwd = "qwer1234";
	
	@Override
	public void login(String id, String pw) {
		if(this.memberId.equals(id) && this.memberPwd.equals(pw)) {
			System.out.println("로그인 되었습니다.");
		}else if(this.memberId != id) {
			System.out.println("아이디가 틀렸습니다.");
		}else if(this.memberPwd != pw) {
			System.out.println("비밀번호가 틀렸습니다.");
		}
		
	}


}
