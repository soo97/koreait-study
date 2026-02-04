package kr.co.training;

public abstract class Warlord implements Character{
//	<Warlord 클래스, Character 인터페이스를 상속받음>
//	  1. 워로드는 객체 생성 시 기본 스탯을 갖습니다.
double ma;
	Warlord(CharacterAbility ca){
		ca.str = 30;
		ca.dex = 17;
		ca.knowledge = 10;
	}
	boolean ss = true;
//
//	  2. 기본 공격 attack 메서드
//	    * 참고 : 케릭터가 먼저 공격하고, 그 다음 몬스터가 공격을 합니다.
//	               즉, 서로 한 번씩 돌아가며 공격합니다.
//	    ------- 케릭터 공격 차례
//	    - 마력이 6 미만이라면 기본 공격 사용 불가 ("마력이 부족해 공격할 수 없습니다" 출력)
//	    - "몬스터가 OO의 피해를 입었습니다!" 출력    
//	    - 몬스터가 케릭터 힘*1.3 만큼의 체력이 깍입니다.
//	    - 케릭터의 마력 6 감소
//	    
//	    ------- 케릭터 공격 차례(몬스터 처치 시)
//	    - 몬스터의 체력이 0 이하라면 "몬스터 사냥을 성공하셨습니다" 출력
//	    - 케릭터의 경험치 13 증가
//
//	    ------- 몬스터 공격
//	    - "몬스터가 공격했습니다!" 출력    
//	    - "케릭터가 OO의 피해를 입었습니다!" 출력
//	    - 몬스터 데미지 만큼 케릭터의 체력이 감소합니다.
//
//	    ------- 몬스터 공격(케릭터 사망 시)
//	    > 케릭터의 체력과 마력이 70으로 회복됩니다.
//	    > 경험치가 30 감소합니다.

	
	public void attack(CharacterAbility ca, MonsterAbility ma) {
		if(ss) {
			if(ca.hp > 0 && ca.dex < 6) {
				System.out.println("마력이 부족해 공격할 수 없습니다.");
			}else if(ca.hp > 0 && ca.dex >= 6){
				System.out.printf("몬스터가 %d의 피해를 입었습니다!",ca.str*1.3);
				this.ma = ma.gethp() - ca.str*1.3;
				ca.dex -= 6;
			}else if(ma.gethp() <= 0) {
				System.out.println("몬스터 사냥을 성공하셨습니다.");
			}
			ss = false;
		}else {
			if(ca.hp > 0) {
				System.out.println("몬스터가 공격했습니다.");
				System.out.printf("캐릭터가 %d의 피해를 입었습니다!", ma.getdamage());
				ca.hp -= ma.getdamage();
				}else if(ca.hp<=0) {
					ca.hp += 70;
					ca.mp += 70;
					ca.experience -= 30;
			}
			ss = true;
		}
	}

//	  3. 힘 스킬 strSkill 메서드
//	    * 참고 : 케릭터가 먼저 공격하고, 그 다음 몬스터가 공격을 합니다.
//	               즉, 서로 한 번씩 돌아가며 공격합니다.
//
//	    ------- 케릭터 공격 차례
//	    - 마력이 15 미만이라면 스킬 사용 불가 ("마력이 부족해 스킬을 사용할 수 없습니다." 출력)
//	    - "몬스터가 힘 스킬로 인해 OO의 피해를 입었습니다!" 출력
//	    - 몬스터가 힘*1.8 만큼의 체력이 깍입니다.
//	    - 케릭터의 마력 15 감소
//
//	   ------- 케릭터 공격 차례(몬스터 처치 시)
//	    - 몬스터의 체력이 0 이하라면 "몬스터 사냥을 성공하셨습니다" 출력
//	    - 케릭터의 경험치 13 증가
//
//	    ------- 몬스터 공격
//	    - "몬스터가 공격했습니다!" 출력    
//	    - "케릭터가 OO의 피해를 입었습니다!" 출력
//	    - 몬스터 데미지 만큼 케릭터의 체력이 감소합니다.
//
//	    ------- 몬스터 공격(케릭터 사망 시)
//	    > 케릭터의 체력과 마력이 70으로 회복됩니다.
//	    > 경험치가 30 감소합니다.
	public void strSkill(CharacterAbility ca, MonsterAbility ma) {
		if(ss) {
			if(ca.hp > 0 && ca.dex < 15) {
				System.out.println("마력이 부족해 공격할 수 없습니다.");
			}else if(ca.hp > 0 && ca.dex >= 15){
				System.out.printf("몬스터가 %d의 피해를 입었습니다!",ca.str*1.3);
				this.ma = ma.gethp() - ca.str*1.3;
				ca.dex -= 6;
			}else if(ma.gethp() <= 0) {
				System.out.println("몬스터 사냥을 성공하셨습니다.");
			}
			ss = false;
		}else {
			if(ca.hp > 0) {
				System.out.println("몬스터가 공격했습니다.");
				System.out.printf("캐릭터가 %d의 피해를 입었습니다!", ma.getdamage());
				ca.hp -= ma.getdamage();
				}else if(ca.hp<=0) {
					ca.hp += 70;
					ca.mp += 70;
					ca.experience -= 30;
			}
			ss = true;
		}
	}
	
//	  4. 민첩 스킬 dexSkill 메서드
//	    * 참고 : 케릭터가 먼저 공격하고, 그 다음 몬스터가 공격을 합니다.
//	               즉, 서로 한 번씩 돌아가며 공격합니다.
//
//	    ------- 케릭터 공격 차례
//	    - 마력이 19 미만이라면 스킬 사용 불가 ("마력이 부족해 스킬을 사용할 수 없습니다." 출력)
//	    - "몬스터가 민첩 스킬로 인해 OO의 피해를 입었습니다!" 출력
//	    - 몬스터가 민첩*0.7 만큼의 체력이 깍입니다. 
//	    - "몬스터가 민첩 스킬로 인해 OO의 피해를 입었습니다!" 출력
//	    - 몬스터가 민첩*0.7 만큼의 체력이 깍입니다.
//	    - "몬스터가 민첩 스킬로 인해 OO의 피해를 입었습니다!" 출력
//	    - 몬스터가 민첩*0.7 만큼의 체력이 깍입니다. (총 3회 공격)
//	    - 케릭터의 마력 19 감소
//
//	   ------- 케릭터 공격 차례(몬스터 처치 시)
//	    - 몬스터의 체력이 0 이하라면 "몬스터 사냥을 성공하셨습니다" 출력
//	    - 케릭터의 경험치 13 증가
//
//	    ------- 몬스터 공격
//	    - "몬스터가 공격했습니다!" 출력    
//	    - "케릭터가 OO의 피해를 입었습니다!" 출력
//	    - 몬스터 데미지 만큼 케릭터의 체력이 감소합니다.
//
//	    ------- 몬스터 공격(케릭터 사망 시)
//	    > 케릭터의 체력과 마력이 70으로 회복됩니다.
//	    > 경험치가 30 감소합니다.
	public void dexSkill(CharacterAbility ca, MonsterAbility ma) {
		if(ss) {
			if(ca.hp > 0 && ca.dex < 15) {
				System.out.println("마력이 부족해 공격할 수 없습니다.");
			}else if(ca.hp > 0 && ca.dex >= 15){
				System.out.printf("몬스터가 %d의 피해를 입었습니다!",ca.str*1.3);
				this.ma = ma.gethp() - ca.str*1.3;
				ca.dex -= 6;
			}else if(ma.gethp() <= 0) {
				System.out.println("몬스터 사냥을 성공하셨습니다.");
			}
			ss = false;
		}else {
			if(ca.hp > 0) {
				System.out.println("몬스터가 공격했습니다.");
				System.out.printf("캐릭터가 %d의 피해를 입었습니다!", ma.getdamage());
				ca.hp -= ma.getdamage();
				}else if(ca.hp<=0) {
					ca.hp += 70;
					ca.mp += 70;
					ca.experience -= 30;
			}
			ss = true;
		}
	}
//	  5. 지력 스킬 knowledgeSkill 메서드
//	    * 참고 : 케릭터가 먼저 공격하고, 그 다음 몬스터가 공격을 합니다.
//	               즉, 서로 한 번씩 돌아가며 공격합니다.
//
//	    ------- 케릭터 공격 차례
//	    - 마력이 28 미만이라면 스킬 사용 불가 ("마력이 부족해 스킬을 사용할 수 없습니다." 출력)
//	    - "몬스터가 지력 스킬로 인해 OO의 피해를 입었습니다!" 출력
//	    - 몬스터가 지력*3.6 만큼의 체력이 깍입니다.
//	    - 케릭터의 마력 28 감소
//
//	   ------- 케릭터 공격 차례(몬스터 처치 시)
//	    - 몬스터의 체력이 0 이하라면 "몬스터 사냥을 성공하셨습니다" 출력
//	    - 케릭터의 경험치 13 증가
//
//	    ------- 몬스터 공격
//	    - "몬스터가 공격했습니다!" 출력    
//	    - "케릭터가 OO의 피해를 입었습니다!" 출력
//	    - 몬스터 데미지 만큼 케릭터의 체력이 감소합니다.
//
//	    ------- 몬스터 공격(케릭터 사망 시)
//	    > 케릭터의 체력과 마력이 70으로 회복됩니다.
//	    > 경험치가 30 감소합니다.
	public void knowledgeSkill(CharacterAbility ca, MonsterAbility ma) {
		if(ss) {
			if(ca.hp > 0 && ca.dex < 15) {
				System.out.println("마력이 부족해 공격할 수 없습니다.");
			}else if(ca.hp > 0 && ca.dex >= 15){
				System.out.printf("몬스터가 %d의 피해를 입었습니다!",ca.str*1.3);
				this.ma = ma.gethp() - ca.str*1.3;
				ca.dex -= 6;
			}else if(ma.gethp() <= 0) {
				System.out.println("몬스터 사냥을 성공하셨습니다.");
			}
			ss = false;
		}else {
			if(ca.hp > 0) {
				System.out.println("몬스터가 공격했습니다.");
				System.out.printf("캐릭터가 %d의 피해를 입었습니다!", ma.getdamage());
				ca.hp -= ma.getdamage();
				}else if(ca.hp<=0) {
					ca.hp += 70;
					ca.mp += 70;
					ca.experience -= 30;
			}
			ss = true;
		}
	}
}
