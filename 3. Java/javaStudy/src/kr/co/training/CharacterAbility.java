package kr.co.training;

public class CharacterAbility {
//	<CharacterAbility 클래스>
	int str = 0;
	int dex = 0;
	int knowledge = 0;
	int level = 1;
	int experience = 0;
	int hp = 100;
	int mp = 100;
	int unusedStatus = 0;
	int hpPortionCount = 10;
	int mpPortionCount = 10;
	
	public void Experienc() {
		if(this.experience >100) {
			this.level += 1;
			this.experience = 0;
		}
	}
	
	public void UnusedStatus() {
		if(this.level > level) {
			this.unusedStatus += 5;
		}
	}
//	  1. 힘(str), 민첩(dex), 지력(knowledge)
//	     - 기본값 : 0
//	  2. 레벨(level)
//	     - 기본값 : 1
//	  3. 경험치(experience)
//	     - 기본값 : 0
//	     - 특징 : 경험치가 100 이상이 될 경우 레벨이 1 증가하고 경험치는 0으로 초기화됩니다.
//	  4. 체력(hp), 마력(mp)
//	     - 기본값 : 100
//	     - 특징 : 레벨업을 해도 회복되지 않습니다.
//	                  포션을 사용해도 최대 100까지만 회복됩니다.
//	  5. 잔여 스텟(unusedStatus)
//	     - 기본값 : 0
//	     - 특징 : 레벨업을 하면 5가 추가됩니다.
//	  6. 소지중인 체력 포션(hpPortionCount), 마력 포션(hpPortionCount)
//	     - 기본값 : 10
}
