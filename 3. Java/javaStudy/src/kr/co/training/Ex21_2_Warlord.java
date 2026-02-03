package kr.co.training;

public class Ex21_2_Warlord extends Ex21_2_Character{
	// Character 클래스를 상속받는다.
	
	
	// 객체 생성 시 힘50, 민첩10, 지력10, 레벨1로 생성
	// - 부모 생성자를 호출하세요.
//	Ex21_2_Warlord(int str, int dex, int knowledge, int level){ // 값이 바뀔때는 해당 코드, 첫 고정값일 경우 아래 코드
	Ex21_2_Warlord(){
		super(50,10,10,1);
	}
	
	
	//attack 메서드 생성
	// - "둔기를 휘두릅니다." 출력
	public void attack() {
		System.out.println("둔기를 휘두릅니다.");
	}
	
	// levelUp() 메서드 생성
	// - "레벨업을 하여 힘이 5 증가합니다." 출력
	// - "현재 레벨 : ㅇㅇ, 힘 : ㅇㅇ" 출력
	// - 현재 레벨을 1 증가시키고, 힘을 5증가 시킵니다.
	public void levelUp() {
//		int currentstr = super.getstr();
		
		super.setstr(super.getstr() +5);
		super.setlevel(super.getlevel()+1);
		System.out.println("레벨업을 하여 힘이 5 증가합니다.");
		System.out.printf("현재 레벨: %d, 힘:%d",super.getlevel(), super.getstr());
	}
}
