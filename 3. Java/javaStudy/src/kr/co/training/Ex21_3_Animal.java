package kr.co.training;

public class Ex21_3_Animal {

		 String name;
		 int age;
		 
		 Ex21_3_Animal(String name, int age){
			 this.name = name;
			 this.age = age;
			 
		 }
		 public void eat(String name, int age) {
			 System.out.printf("%s(%d)이(가) 먹는 중입니다.", name, age);
		 }
		 
		 public void sleep(String name, int age) {
			 System.out.printf("%s(%d)이(가) 자는 중입니다.", name, age);
		 }


}
