package kr.co.training;

public class Ex21_3_CharaterAbility {
	// 아래의 필드들을 가집니다.
	// - 힘(str), 민첩(dex), 지력(knowledge)
	//  레벨(level, 초기값 1)
	//  경험치(exp, 100이 될 경우 레벨이 1 증가하고 경험치는 0이 됨)
	//  체력(hp, 초기값 100, 레벨업을 해도 회복되지 않음)
	//  마력(mp, 초기값 100, 레벨업을 해도 회복되지 않음)
	private int str;
	private int dex;
	private int knowledge;
	private int level;
	private int exp;
	private int hp;
	private int mp;
	
	public Ex21_3_CharaterAbility(int str, int dex, int knowledge){
		this.str = str;
		this.dex = dex;
		this.knowledge = knowledge;
	}
	
	public Ex21_3_CharaterAbility() {
		super();
	}

	public void setstr(int str){
		this.str = str;
	}
	public void setdex(int dex){
		this.dex = dex;
	}
	public void setknowledge(int knowledge){
		this.knowledge = knowledge;
	}
	public void setlevel(int level){
		this.level = level;
	}
	public void setexp(int exp){
		if(exp == 100) {
			this.level = level+1;
			this.exp = 0;
		}
	}
	public void sethp(int hp){
		this.hp = hp;
	}
	public void setmp(int mp){
		this.mp = mp;
	}
	
	
	public int getstr() {
		return str;
	}
	public int getdex() {
		return dex;
	}
	public int getknowledge() {
		return knowledge;
	}
	public int getlevel() {
		return level;
	}
	public int getexp() {
		return exp;
	}
	public int gethp() {
		return hp;
	}
	public int getmp() {
		return mp;
	}
	
	public String toString() {
		return "힘: "+str+"민첩: "+ dex +"지력: "+ knowledge +"레벨: "+ level +"경험치: "+ exp +"hp: "+ hp +"mp: "+ mp ;
//		return String.format(null, null);
	}
	// - 모든 필드의 접근 제어자는 private
	// - 각 필드에 대한 getter/setter 작성
	// - 현재 능력치를 모두 확인할 수 있는 toString 오버라이딩 작성
	//		> toString은 문자열을 반환 합니다.
	//		> public void toString() {return "문자열"}
}
