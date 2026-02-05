package kr.co.koreait;

public class Ex27_Main {

	public static void main(String[] args) {
		Util m = new Util();
		m.printItem("aa");
		m.printItem(10);
		m.printItem(1.5);
	
		Box<String> b = new Box<>();
		b.setItem("hi");
		System.out.println(b.getItem());
		
	}
	

}

// T : Type
// E : Element
// - ArrayList<E> : 요소를 제네릭으로 받겠다.
// K : key
// V : Value
// - HashMap<K,V> : 키는 K라는 이름으로, 값은 V라는 이름으로 제네릭을 받겠다.

class Box<T>{
	private T item;
	
	public void setItem(T item) {
		this.item = item;
	}
	public T getItem() {
		return item;
	}
	
}

class Util {
	// 제네릭 메서드
	// - 클래스 안에서 특정 메서드만 제네릭을 사용할 때 하는 방법
	// - 단점: 아무거나 다 들어옴
	// <T> : 이 메서드에서 사용할 제네릭 이름은 T를 사용하겠다.
	public <T> T printItem(T item) {
		System.out.println("아이템 : " + item);
		return item;
	}
}