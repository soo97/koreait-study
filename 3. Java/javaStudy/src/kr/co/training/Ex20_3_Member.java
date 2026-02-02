package kr.co.training;

public class Ex20_3_Member {
	public void introduce(Ex20_3_Memberinfo memberinfo) {
		String strStudent;
		if(memberinfo.getisStudent()) {
			strStudent = "학생";
		}else {
			strStudent = "학생 아님";
		}
		System.out.println("이름 :"+memberinfo.getname());
		System.out.println("나이 :"+memberinfo.getage());
		System.out.println("주소 :"+memberinfo.getaddr());
		System.out.println("학생여부:"+strStudent);
	}
	public void run(Ex20_3_Memberinfo memberinfo) {
		System.out.print(memberinfo.getaddr()+"에 사는"+memberinfo.getname()+"이 달리고 있습니다.");
	}
}
