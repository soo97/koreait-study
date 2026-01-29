package kr.co.training;

import java.util.HashMap;
import java.util.Scanner;

public class Ex05_HashMap {

	public static void main(String[] args) {
		
		// "이름" : "전화번호 형태의 phoneBook이라는 HashMap을 생성
		HashMap<String, String> phoneBook = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		boolean isTrue = true;
		
		while(isTrue) {
			System.out.println("1. 전화번호 추가");
			System.out.println("2. 전화번호 검색");
			System.out.println("3. 전화번호 전체 검색");
			System.out.println("4. 전화번호 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 입력:");
			int menu = sc.nextInt();
			sc.nextLine();
			
			// 1번 입력 시
			// - 사용자로부터 이름과 전화번호를 입력받습니다.
			// - 입력받은 이름을 키로, 전화번호를 값으로 phoneBook에 저장
			// = "ㅇㅇㅇ의 전화번호를 추가했습니다."출력
			
			// 2번 입력 시
			// - 사용자로부터 검색할 이름을 입력받습니다.
			// - phoneBook에 일치하는 이름이 있다면
			//		> "ㅇㅇㅇ의 전화번호는 000-0000-0000 입니다." 출력
			// - phoneBook에 일치하는 이름이 없다면
			//		> "ㅇㅇㅇ의 전화번호를 찾을 수 없습니다." 출력
			
			// 3번 입력 시
			// - phoneBook에 존재하는 모든 목록을 출력
			//		> "이름: ㅇㅇㅇ, 전화번호: 000-0000-0000"
			
			// 4번 입력 시
			// - 사용자로부터 삭제할 이름을 입력받습니다.
			// - phoneBook에 일치하는 이름이 있다면
			//		> phoneBook에서 해당 이름을 가진 전화번호 제거 후 "ㅇㅇㅇ의 전화번호를 삭제했습니다." 출력
			// - phoneBook에 일치하는 이름이 없다면
			//		> "ㅇㅇㅇ의 전화번호를 찾을 수 없습니다." 출력
			
			// 0번 입력 시
			// - "프로그램을 종료합니다." 출력 후 프로그램 종료
			
			// 그 외
			// - "올바른 메뉴를 입력해주세요." 출력
			
			switch(menu) {
			
			case 1 : 
				System.out.println("추가할 이름과 전화번호를 입력하세요.");
				System.out.println("이름:");
				String name = sc.nextLine();
				System.out.println("전화번호:");
				String num = sc.nextLine();				
				
				phoneBook.put(name, num);
				
				System.out.println(name +"의 전화번호를 추가했습니다.");
				break;
			case 2 : 
				System.out.println("검색할 이름:");
				String name11 = sc.nextLine();
				
				if(phoneBook.containsKey(name11)) {
					System.out.println(name11+"의 전화번호는" + phoneBook.get(name11) +"입니다.");
				}else {
					System.out.println(name11 + "의 전화번호를 찾을 수 없습니다.");
				}
				
				break;
			case 3 : 
				for(String key : phoneBook.keySet()) {
					System.out.println("이름: "+ key +"전화번호: "+ phoneBook.get(key));
				}
				break;
			case 4 :
				System.out.println("삭제할 이름:");
				String name1 = sc.nextLine();
				phoneBook.remove(name1);
				System.out.println(name1 + "의 전화번호를 삭제했습니다.");
				if(phoneBook.containsKey(name1)) {
					phoneBook.remove(name1);
					System.out.println(name1 + "의 전화번호를 삭제했습니다.");
				}else {
					System.out.println(name1 + "의 전화번호를 찾을 수 없습니다.");
				}
				break;
			case 0 :
				System.out.println("프로그램을 종료합니다");
				isTrue = false;
				break;
			default :
				System.out.println("올바른 메뉴를 입력하세요.");
			}
		}
	}

}
