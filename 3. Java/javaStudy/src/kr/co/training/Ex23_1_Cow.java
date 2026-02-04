package kr.co.training;

public class Ex23_1_Cow extends Ex23_1_Animal{
	// Animal 클래스를 상속 받음
	
	public void cry(String soundString) {
		System.out.printf("소가 %s하고 소리를 냅니다.", soundString);
	}
	// cry 메서드를 오버라이딩
	// - 매개변수 동일
	// - "소가 ㅇㅇㅇ하고 소리를 냅니다." 출력
}
