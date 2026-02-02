package kr.co.training;

public class Ex20_3_Memberinfo {
	private String name;
	private int age;
	private String addr;
	private boolean isStudent;
	

	public void setname(String name) {
		this.name = name;
	}
	public void setage(int age) {
		this.age = age;
	}
	public void setaddr(String addr) {
		this.addr = addr;		
	}
	public void setisStudent(boolean isStudent) {
		this.isStudent = isStudent;		
	}
	
	public String getname() {
		return name;		
	}
	public int getage() {
		return age;		
	}
	public String getaddr() {
		return addr;		
	}
	public boolean getisStudent() {
		return isStudent;
	}
}
