package kr.co.training;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04_ArrayList {

	public static void main(String[] args) {
		// 1. 6의 배수만 리스트에 추가하세요.
		// 	- 리스트 이름 : q1
		//  - 들어가는 값들의 타입은 숫자
		// 	- 1~200사이의 6의 배수만 리스트 q1에 추가
		
		ArrayList<Integer> q1 = new ArrayList<>();
		
		for(int i=1; i<201; i++) {
			if(i%6 == 0) {
				q1.add(i);
			}
		}System.out.println(q1);
		
		// 2. 학생 정보를 저장하기 위한 ArrayList를 생성하세요.
		// 	- 프로그램을 아래와 같은 메뉴를 사용자로부터 입력받습니다.
		//		> "1. 학생 추가"
		//		> "2. 학생 목록 조회"
		//		> "3. 프로그램 종료"
		// 		> "메뉴 입력 : "
		// 	- 1번 입력 시 사용자로부터 학생의 이름을 입력 받고 ArrayList에 추가
		// 	- 2번 입력 시 ArrayList에 저장된 모든 학생의 이름 출력
		// 	- 3번 입력 시 "프로그램을 종료합니다." 출력 후 종료
		// 	- 위의 프로그램은 사용자가 종료를 선택할 때 까지 반복됩니다.
		// 	- 리스트 이름 : student
		System.out.println("--------------------------------------------------------");
//		ArrayList<String> student = new ArrayList<>();
//		
//		Scanner menu = new Scanner(System.in);
//		
//		int stmenu = 0;
//		
//		for(int stmenu; stmenu!=3; stmenu++) {
//			System.out.println("1. 학생 추가");
//			System.out.println("2. 학생 목록 조회");
//			System.out.println("3. 프로그램 종료");
//			System.out.println("메뉴 입력 : ");
//			stmenu = menu.nextInt();
//			if(stmenu == 1) {
//				System.out.println("추가할 학생이름 : ");
//				Scanner name = new Scanner(System.in);
//				student.add(name.next());
//			}else if(stmenu == 2) {
//				for(String n : student) {
//					System.out.println(n);
//				}
//			}else if(stmenu == 3){
//				System.out.println("프로그램을 종료합니다.");
//			}
//		}
		ArrayList<String> student = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		boolean isTrue = true;
		
		while(isTrue) {
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 목록 조회");
			System.out.println("3. 프로그램 종료");
			System.out.println("메뉴 입력 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 :
				System.out.println("추가할 학생이름 : ");
				String addName = sc.nextLine();
				student.add(addName);
				break;
			case 2 :
				System.out.println(student);
				break;
			case 3 : 
				System.out.println("종료합니다.");
				}
			}
		}
		
	}


