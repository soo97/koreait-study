package kr.co.training;

public class Ex21_3_Sorceress extends Ex21_3_Character {
	// Character 클래스를 상속 받습니다.
	Ex21_3_CharaterAbility ca;
	int exp;
	int hp;
	int knowledge;
	int mp;
	// 소서리스 객체 생성 시 힘10, 민첩7, 지력35로 생성됩니다.
	
	
	public Ex21_3_Sorceress(Ex21_3_CharaterAbility ca) {
		this.ca = ca;
		ca.setstr(10);
		ca.setdex(7);
		ca.setknowledge(35);
	}

	public Ex21_3_Sorceress() {
		super();
	}

	public void attack() {
		if(super.gethp()<10) {
			System.out.println("체력이 부족합니다.");
		}else {
			this.exp = super.getexp()+25;
			this.hp = super.gethp()-10;
			System.out.println("지팡이를 휘두릅니다.");
		}
	}
	// attack 메서드 (오버라이딩)
	// - "지팡이를 휘두릅니다." 출력
	// - 경험치 25 증가, 체력 10 감소
	// - 체력이 10 미만일 경우 "체력이 부족합니다." 출력
	public void skill() {
		if(super.getmp()<23) {
			System.out.println("마력이 부족합니다.");
		}else{
			this.exp = super.getexp() + 37;
			this.hp = super.getmp()-23;
			System.out.println("아이스 애로우를 사용합니다.");
		}
	}
	// skill 메서드 (오버라이딩)
	// - "아이스 애로우를 사용합니다." 출력
	// - 경험치 37 증가, 마력23감소
	// - 마력이 23 미만일 경우 "마력이 부족합니다." 출력
	public void levelUp() {
		this.knowledge = super.getknowledge() + 5; 
		System.out.println("레벨업을 하여 지력이 5 증가합니다.");
	}
	// levelUp 메서드
	// - "레벨업을 하여 지력이 5 증가합니다." 출력
	// - 지력 5 증가
}
