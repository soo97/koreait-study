package kr.co.training;

import java.util.Scanner;

public class Game {
	static Scanner sc = new Scanner(System.in);
	static CharacterAbility ca = new CharacterAbility();
	static MonsterAbility ma = new MonsterAbility();
	static Warlord worlod = new Warlord(ca);

	public static void main(String[] args) {
		startGame(); // 게임 시작
	}
	
	public static void startGame() {
		
		do { // 게임 시작
			if(ca.getexperience() > 100) {
				ca.level = ca.getlevel() + 1;
				ca.experience = 0;
				ca.unusedStatus = ca.getunusedStatus() + 5;
			}
			System.out.println("게임 메뉴를 선택해주세요.");
			System.out.println("1. 사냥 시작");
			System.out.println("2. 인벤토리-포션");
			System.out.println("3. 스텟");
			System.out.println("4. 케릭터 정보 확인");
			System.out.println("0. 종료");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			System.out.println("================");
			if(menu == 1) {
				huntMenu(); // 사냥 시작
			} else if(menu == 2) {
				setPorsion(); // 인벤토리-포션
			} else if(menu == 3) {
				setStatus(); // 스텟
			} else if(menu == 4) {
				getCharInfo(); // 케릭터 정보 확인
			} else if(menu == 0) {
				System.out.println("게임을 종료합니다."); // 종료
				break;
			} else {
				System.out.println("올바른 메뉴를 선택해주세요.");
				System.out.println("================");
			}
		} while(true);
	}
	
	public static boolean huntMenu() {		
		do {
			System.out.println("공격을 선택해주세요.");
			System.out.println("1. 기본 공격");
			System.out.println("2. 힘 스킬 사용");
			System.out.println("3. 민첩 스킬 사용");
			System.out.println("4. 지력 스킬 사용");
			System.out.println("0. 처음으로 돌아가기");
			System.out.print("메뉴 선택 : ");
			int selectAttack = sc.nextInt();
			System.out.println("================");
			
			boolean monsterDied = false;

			if(selectAttack == 1) {
				monsterDied = worlod.attack(ca, ma);
			} else if(selectAttack == 2) {
				monsterDied = worlod.strSkill(ca, ma);
			} else if(selectAttack == 3) {
				monsterDied = worlod.dexSkill(ca, ma);
			} else if(selectAttack == 4) {
				monsterDied = worlod.knowledgeSkill(ca, ma);
			} else if(selectAttack == 0) {
				// 처음으로 돌아가기
				System.out.println("처음 메뉴로 돌아갑니다.");
				System.out.println("================");
				return true;
			} else {
				System.out.println("================");
				System.out.println("올바른 메뉴를 선택해주세요.");
			}
			if(monsterDied == true) {
	            System.out.println("메인 메뉴로 돌아갑니다.");
	            System.out.println("================");
	            return true;
	        }
			
			System.out.println("================");

		} while(true);
		
	}
	

	public static boolean setPorsion() {
		do {
			System.out.println("인벤토리-포션");
			System.out.println("1. 체력 포션");
			System.out.println("2. 마나 포션"); 
			System.out.println("3. 포션 목록");
			System.out.println("0. 처음으로 돌아가기");
			System.out.print("사용할 포션을 선택하세요: ");
			int selectPorsion = sc.nextInt();
			System.out.println("================");
			
			if(selectPorsion == 1) {
				if(ca.gethpPortionCount() >= 1) {
					System.out.println("체력 포션을 사용했습니다.");
					ca.hpPortionCount -= 1;
					ca.hp += 60;
					System.out.println("포션 사용 후 현재 체력 :"+ ca.gethp());
				}else {
					System.out.println("인벤토리에 체력 포션이 없습니다.");
				}

			} else if(selectPorsion == 2) {
				if(ca.mpPortionCount >= 1) {
					System.out.println("마력 포션을 사용했습니다.");
					ca.mpPortionCount -= 1;
					ca.mp += 60;
					System.out.println("포션 사용 후 현재 마력 :"+ ca.getmp());
				}else {
					System.out.println("인벤토리에 마력 포션이 없습니다.");
				}

			} else if(selectPorsion == 3) {
				System.out.println("소지중인 체력 포션은"+ ca.hpPortionCount+"입니다.");
				System.out.println("소지중인 마력 포션은"+ ca.mpPortionCount+"입니다.");

			} else if(selectPorsion == 0) {
				// 처음으로 돌아가기
				System.out.println("처음 메뉴로 돌아갑니다.");
				System.out.println("================");
				return true;
			} else {
				System.out.println("올바른 메뉴를 선택해주세요.");
			}
			System.out.println("================");
		} while(true);
	}
	
	public static boolean setStatus() {
		System.out.println("잔여 스텟 :"+ ca.getunusedStatus() +"입니다.");

		do {
			System.out.println("사용할 스텟을 입력해주세요.");
			System.out.println("1. 힘+5");
			System.out.println("2. 민첩+5");
			System.out.println("3. 지력+5");
			System.out.println("0. 처음으로 돌아가기");
			System.out.print("사용할 스텟 : ");
			int selectStatus = sc.nextInt();
			System.out.println("================");

			if(selectStatus == 1) {
				if(ca.getunusedStatus()>0) {
					System.out.println("힘이 5 증가되었습니다.");
					ca.str += 5;
					ca.unusedStatus -= 5;
					System.out.println("현재 힘 :"+ca.getstr());
				}else {
					System.out.println("사용 가능한 스텟이 없습니다.");
				}

			} else if(selectStatus == 2) {
				if(ca.getunusedStatus()>0) {
					System.out.println("민첩이 5 증가되었습니다.");
					ca.dex += 5;
					ca.unusedStatus -= 5;
					System.out.println("현재 민첩 :"+ca.getdex());
				}else {
					System.out.println("사용 가능한 스텟이 없습니다.");
				}

			} else if(selectStatus == 3) {
				if(ca.getunusedStatus()>0) {
					System.out.println("지력이 5 증가되었습니다.");
					ca.knowledge += 5;
					ca.unusedStatus -= 5;
					System.out.println("현재 지력 :"+ca.getknowledge());
				}else {
					System.out.println("사용 가능한 스텟이 없습니다.");
				}

			
			} else if(selectStatus == 0) {
				// 처음으로 돌아가기
				System.out.println("처음 메뉴로 돌아갑니다.");
				System.out.println("================");
				return true;
			} else {
				System.out.println("올바른 메뉴를 선택해주세요.");
			}
			System.out.println("================");

		} while(true);
	}
	
	public static boolean getCharInfo() {
//        - 현재 가진 정보들을 전체 출력
		System.out.println("========케릭터 정보========");
		System.out.println("체력 :"+ca.gethp());
		System.out.println("마나 :"+ca.getmp());
		System.out.println("힘 :"+ca.getstr());
		System.out.println("민첩 :"+ca.getdex());
		System.out.println("지력 :"+ca.getknowledge());
		System.out.println("레벨 :"+ca.getlevel());
		System.out.println("경험치 :"+ca.getexperience());
		System.out.println("스텟 :"+ca.getunusedStatus());

		System.out.println("================");
		return true;
	}
	
  }


