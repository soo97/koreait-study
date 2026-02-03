package kr.co.koreait;

import java.util.ArrayList;

public class Ex22_Main {
	public static void main(String[] args) {
		Ex22_1_Samsong ss = new Ex22_1_Samsong();
		ss.powerOn();
		ss.powerOff();
		
		Ex22_2_Dog dog = new Ex22_2_Dog();
		dog.makeSound();
		
		
		
		// 강아지들을 담을 리스트
		ArrayList<Ex22_2_Dog> list = new ArrayList<>();
		list.add(dog);
		list.add(new Ex22_2_Dog());
		
		
		
		System.out.println(list.get(0));
		
		list.get(0).makeSound();
		list.get(1).makeSound();
		
	}
}
