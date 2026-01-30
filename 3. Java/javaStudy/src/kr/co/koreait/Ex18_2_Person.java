package kr.co.koreait;

public class Ex18_2_Person {
//	필드 선언만
//	이름(name)
//	나이(age)
//	주소(addr)
//	핸드폰 번호(phone)
	String name;
	int age;
	String addr;
	String phone;
	final static String HOBBY = "잠자기"; //① 
	
	
	// 이름하고 나이만 받는 생성자
	// - 주소랑 핸드폰 번호는 기본값을 지정해서 줌
	Ex18_2_Person(String Name, int age){ // 오버로딩
		this.name = Name;
		this.age = age;
		this.addr = "지구";
		this.phone = "아직없음";
	}
	
	Ex18_2_Person(String Name, int age, String addr, String phone){
		System.out.println("생성자가 호출되었습니다.");
		this.name = Name;
		this.age = age;
		this.addr = addr;
		this.phone = phone;
	}
	
//	intorudce 메서드
//	 - "이름 : ㅇㅇㅇ"
//	 - "나이 : ㅇㅇㅇ"
//	 - "주소 : ㅇㅇㅇ"
//	 - "폰번호 : ㅇㅇㅇ"
	public void intorudce() {
		System.out.println("ㅎㅇ"); //ⓑ
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + addr);
		System.out.println("폰번호 : " + phone);
	}
}
