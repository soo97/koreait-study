package kr.co.training;

public class Ex24_1_Main {

	public static void main(String[] args) {
//		- main 메서드에서 SportsCar와 RegularCar의 객체를 생성하고 메서드를 모두 실행하세요.
		Ex24_1_SportsCar sc = new Ex24_1_SportsCar();
		sc.start();
		sc.accelerate();
		sc.brake();
		
		Ex24_1_RegularCar rc = new Ex24_1_RegularCar();
		rc.start();
		rc.accelerate();
		rc.brake();
//		- 자동차 인터페이스(Ex24_1_Car)를 생성하세요. 
//		   -> 자동차 인터페이스는 start(), accelerate(), brake() 추상 메서드를 갖습니다.
		
	}


}
