package kr.co.training;

public class Ex23_2_SuperMarket {
	// Ex23_2_SuperMarket 클래스 생성
	// - 정수형 milkCount 필드를 가짐
	//	접근 제어자 : private
	// - goSuperMarket 메서드를 가집니다.
	//	>해당 메서드는 Ex23_2_HasAvocado,Ex23_2_NoAvocado 두 객체를 매개 변수로 받습니다.(다형성을 활용하여 1개의 매개변수로 받으세요.)
	//	> 매개변수로 받은 객체의 hasAvocado 메서드를 호출하세요.
	//		>호출결과가 true라면 milkCount를 6으로 할당
	//		>호출결과가 false라면 milkCount를 1로 할당
	private int milkCount;
	
	public void goSuperMarket(Ex23_2_AvocadoCondition condition) {
		if(condition.hasAvocado()) {
			this.milkCount = 6;
		}else{
			this.milkCount = 1;
		}
	}

	public int getmilkCount() {
		return milkCount;
	}
	
	
}
