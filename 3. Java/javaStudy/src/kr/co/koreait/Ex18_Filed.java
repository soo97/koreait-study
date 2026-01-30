package kr.co.koreait;

public class Ex18_Filed {

	public static void main(String[] args) {
//		 필드(=멤버 변수)
//		  - 클래스 레벨의 변수를 의미
		Ex18_1_Car car = new Ex18_1_Car();
		car.wheel = 5;
		
		System.out.println(car.speed);
		System.out.println(car.wheel);
		
		
		
		Ex18_1_Car sonata = new Ex18_1_Car();
		sonata.wheel = 7;
		sonata.speed = 140;
		
		System.out.println(sonata.speed);
		System.out.println(sonata.wheel);
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		Ex18_2_Person jjanggu = new Ex18_2_Person("신짱구",9,"경기도 광주","010-2222-4444");
//		jjanggu.name = "짱구";
//		jjanggu.age = 9;
//		jjanggu.addr = "경기도 광주";
//		jjanggu.phone = "010-2222-4444";
//		System.out.printf("이름 : %s \n 나이 :%d \n 주소 :%s \n 전화번호 :%s \n", jjanggu.name, jjanggu.age, jjanggu.addr, jjanggu.phone);
		
//		jjanggu.name = "짱구";
//		jjanggu.age = 9;
//		jjanggu.addr = "경기도 광주";
//		jjanggu.phone = "010-2222-4444";
		jjanggu.intorudce();
		//-----------------------------------------------------------------------------------------------
//		Ex18_2_Person minsu = new Ex18_2_Person();
//		minsu.name = "민수";
//		minsu.age = 17;
//		minsu.addr = "인천 부평";
//		minsu.phone = "010-5555-6666";
//		System.out.printf("이름 : %s \n 나이 :%d \n 주소 :%s \n 전화번호 :%s", minsu.name, minsu.age, minsu.addr, minsu.phone);
		
//		minsu.name = "민수";
//		minsu.age = 17;
//		minsu.addr = "인천 부평";
//		minsu.phone = "010-5555-6666";
//		minsu.intorudce();
//		Ex18_2_Person hello = new Ex18_2_Person();
		
		
		System.out.println(Ex18_2_Person.HOBBY); //①
//		hello.intorudce(); //ⓑ
		Ex18_2_Person test = new Ex18_2_Person("신짱구",9);
		test.intorudce();
	}

}
