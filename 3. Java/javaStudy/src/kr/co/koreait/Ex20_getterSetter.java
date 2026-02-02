package kr.co.koreait;

public class Ex20_getterSetter {

	public static void main(String[] args) {
		Ex20_1_Person kim = new Ex20_1_Person();
		kim.setAge(10);
		System.out.println(kim.getAge());
		
		kim.setName("임수현");
		System.out.print(kim.getName());
		
		kim.setAddr("인천");
		System.out.print(kim.getAddr());
		
		kim.setInstudent(true);
		System.out.print(kim.getInstudent());
		
	}

}
