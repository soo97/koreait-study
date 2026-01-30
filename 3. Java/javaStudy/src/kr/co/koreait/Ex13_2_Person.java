package kr.co.koreait;


public class Ex13_2_Person {
	
	// 이름, 나이 입력받고 "안녕하세요. 제이름은 ㅇㅇㅇ, 나이는 ㅇㅇ살 입니다." 출력
	public void introduce(String name, int age) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("이름 :");
//		String name = sc.nextLine();
//		System.out.println("나이 :");
//		String age = sc.nextLine();
//		Ex13_1_Calc calc = new Ex13_1_Calc();
//		String na = calc.person("임수현", "29");
		System.out.println("안녕하세요. 제 이름은 "+name+", 나이는" +age+"살 입니다.");
	}
	
	// sayAge() 메서드 생성
	// - 매개변수로 나이를 받은 후
	// - 나이를 반환
	//		-"ㅇㅇㅇ의 나이는 ㅇㅇ살 입니다."
	public String sayAge(int age) {
		return age+"살 입니다.";
	}
	
}
