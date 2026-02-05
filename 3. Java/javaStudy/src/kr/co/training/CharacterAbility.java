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
	
	// 힘(str)
	public void setstr(int str) {
		this.str = str;
	}
	
	public int getstr() {
		return str;
	}
	
	// 민첩(dex)
	public void setdex(int dex) {
		this.dex = dex;
	}
	
	public int getdex() {
		return dex;
	}
	
	// 지력(knowledge)
	public void setknowledge(int knowledge) {
		this.knowledge = knowledge;
	}
	
	public int getknowledge() {
		return knowledge;
	}
	
	// 레벨(level)
	public void setlevel(int level) {
		this.level = level;
	}
	
	public int getlevel() {
		return level;
	}
	
	// 경험치(experience)
	public void setexperience(int experience) {
		this.experience = experience;
	}
	
	public int getexperience() {
		return experience;
	}
	
	// 체력(hp)
	public void sethp(int hp) {
		this.hp = hp;
	}
	
	public int gethp() {
		return hp;
	}
	
	// 마력(mp)
	public void setmp(int mp) {
		this.mp = mp;
	}
	
	public int getmp() {
		return mp;
	}
	
	// 잔여 스텟(unusedStatus)
	public void setunusedStatus(int unusedStatus) {
		this.unusedStatus = unusedStatus;
	}
	
	public int getunusedStatus() {
		return unusedStatus;
	}
	
	// 소지중인 체력 포션(hpPortionCount)
	public void sethpPortionCount(int hpPortionCount) {
		this.hpPortionCount = hpPortionCount;
	}
	
	public int gethpPortionCount() {
		return hpPortionCount;
	}
	
	// 마력 포션(hpPortionCount)
	public void setmpPortionCount(int mpPortionCount) {
		this.mpPortionCount = mpPortionCount;
	}
	
	public int getmpPortionCount() {
		return mpPortionCount;
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
