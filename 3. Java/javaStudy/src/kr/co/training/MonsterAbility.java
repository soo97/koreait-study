package kr.co.training;

public class MonsterAbility {
//	<MonsterAbility 클래스>
//	  1. 데미지(damage)
//	     - 기본값 : 5
//	  2. 체력(hp)
//	     - 기본값: 100
//	  3. getter/setter 작성
	int damage = 5;
	int hp = 100;
	
	public void setdamage(int damage) {
		this.damage = damage;
	}
	public void sethp(int hp) {
		this.hp = hp;
	}
	
	public int getdamage() {
		return damage;
	}
	
	public int gethp() {
		return hp;
	}
}
