package kr.co.koreait;

public class Ex20_1_Person {
	private int age;
	private String Name;
	private String addr;
	private boolean inStudent;
	
	// Setter
	// - 반환 타입은 일반적으로 void
	// - 메서드명 : set필드명
	public void setAge(int age) {
		if(age < 0) {
			return;
		}
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public void setInstudent(boolean inStudent) {
		this.inStudent = inStudent;
	}
	
	// Getter
	// - 메서드명 : get필드명
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return Name;
	}
	
	public String getAddr() {
		return addr;
	}
	
	public boolean getInstudent() {
		return inStudent;
	}

}
