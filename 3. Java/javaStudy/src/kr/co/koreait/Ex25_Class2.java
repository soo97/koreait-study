package kr.co.koreait;

public class Ex25_Class2 {

	public static void main(String[] args) {
		/*<정적 중첩 클래스 생성 방법>*/
//		OuterClass.InnerClass inner = new OuterClass.InnerClass();   @ inner 클래스에 static을 붙였을 경우
//		inner.print();												 @ inner 클래스에 static을 붙였을 경우
		
		/*<비정적 중첩 클래스 생성 방법>*/
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.print();
		
		/*Ex25_1_Calculator*/
		Ex25_1_Calculator cll = new Ex25_1_Calculator(5, 6);
		Ex25_1_Calculator.Calc calc = cll.new Calc();
		System.out.println(calc.add());
		
		/*<익명 내부 클래스>*/
		Animal animal = new Animal() {
			@Override
			public void sound() {
				System.out.println(" 소리를 냅니다.");
			}
		};
		
		// 람다식
		Animal animal2 = () -> System.out.println("멍멍");
		
	}

}

interface Animal{
	void sound();
}


class OuterClass{
	private static int staticNum = 10; // 클래스 변수 / static으로 outerclass 안에 있는 객체 사용 가능
	private int instanceNum = 20; // 인스턴스 변수
	
//	static class InnerClass{  - 정적 중첩 클래스 @
	class InnerClass{ // 비정적 중첩 클래스
		public void print() {
			System.out.println(instanceNum);
			System.out.println(staticNum);
		}
	}
}