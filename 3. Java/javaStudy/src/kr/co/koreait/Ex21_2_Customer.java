package kr.co.koreait;

public class Ex21_2_Customer extends Ex21_2_Person {
	int memberId;
	// super.name = name; -> 부모필드에 값을 넣겠다.
	Ex21_2_Customer(String name, int age, int memberId){
		super(name, age);
		this.memberId = memberId;
	}
	
	void enter() {
		// super.hello(); -> 부모에 있는 헬로 메서드 불러오겠다,
		System.out.printf("회원번호 : %d, %s(%d세)님이 입장하셨습니다.", memberId, name, age);
	}
}
