package kr.co.koreait;

public class Ex13_Method {

	public static void main(String[] args) {
		// 메서드
		// - 정의된 동작이나 기능을 수행
		
		// 객체 생성(=인스턴스화)
		//- 코드를 메모리에 올리는 과정
		//- 클래스명 변수명 = new 클래스명();
		Ex13_Method m = new Ex13_Method();
		String result = m.printHello("안녕하세요.");
		
		System.out.println(result);
		
		int[] numbers = {100, 200, 300, 400};
		
		Ex13_1_Calc calc = new Ex13_1_Calc();
		int result1 = calc.add(5,3);
		calc.add(10,10);
		calc.add(20,10);
		//       (인자)
		int sum = calc.sum(numbers);
		System.out.println("더한 값" + result1);
		System.out.println("배열 더한 값"+sum);
//		int result2 = calc.sub(10, 1, 3);
//		System.out.println("뺀 값" + result2);
		
		int result3 = calc.mul(10, 1, 3, 5);
		System.out.println("곱한 값" +result3);
		
		int result4 = calc.div(10, 3);
		System.out.println("나머지" +result4);
		
		Ex13_3_BankAccount bank = new Ex13_3_BankAccount();
		bank.deposit(1000);
		bank.withdraw(1000);
		String check = bank.checkBalance();
		System.out.println(check);
		
		Ex13_2_Person person = new Ex13_2_Person();
		person.introduce("임수현", 29);
	}

	
	
	// ---------------------------------------------------------------------------------------------------------------
	// 안녕하세요 출력하는 메서드
	// public 반환타입 메서드명(자료형 매개변수명){}
	// - 반환 타입의 종류 : void, int, String, int[], ArrayList<>, ...
	// - void : 반환 타입 없음(return 없음)
	public String printHello(String str) {
		System.out.println(str);
		return "잘 출력되었습니다.";
	}
	
	
}
