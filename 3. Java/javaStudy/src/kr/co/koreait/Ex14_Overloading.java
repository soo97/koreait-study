package kr.co.koreait;

public class Ex14_Overloading {

	public static void main(String[] args) {
		// 오버로딩 (Overloading) - ★★★★★
		// - 같은 메서드 이름을 사용하지만 매개변수의 타입(자료형)과 위치가 다른 방식 + 갯수
		
		Ex14_Overloading ol = new Ex14_Overloading();
		ol.introduce("임수현");
		ol.introduce("임수현", 29);
		
		
		
		Ex14_1_Calc calc = new Ex14_1_Calc();
		int sum2 = calc.add(2, 3);
		int sum3 = calc.add(2, 3, 4);
		
		System.out.println("2개를 더한 값 :" +sum2);
		System.out.println("3개를 더한 값 :" +sum3);
	}
	
	public void introduce(String name) {
		System.out.println("안녕하세요. 제 이름은 "+ name +"입니다.");
	}
	
	// 오버로딩
	public void introduce(String name, int age) {
		System.out.println("이름:"+ name +", 나이:"+age);
	}

}
