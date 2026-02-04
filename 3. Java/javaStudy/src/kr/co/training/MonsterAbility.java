package kr.co.training;

public class MonsterAbility {
//	<MonsterAbility 클래스>
//	  1. 데미지(damage)
//	     - 기본값 : 5
//	  2. 체력(hp)
//	     - 기본값: 100
//	  3. getter/setter 작성
	int damage;
	int hp;
	
	public void setdamage() {
		this.damage = 5;
	}
	public void sethp() {
		this.hp = 100;
	}
	
	public int getdamage() {
		return damage;
	}
	
	public int gethp() {
		return hp;
	}
}
