package kr.co.training;

public class Ex21_1_Order {
	// number, amount, status 필드를 가집니다.
	// - 접근제어자 : private
	// - number, status는 문자열, amount는 실수형
	private String number;
	private String status;
	private double amount;
	
	
	// 필드 3개에 대한 getter/setter
	// - amount 필드의 setter에서 주문 금액이 100.0 미만일 경우
	// "유효하지 않은 금액입니다." 출력
	// - 동일하게 amount 필드의 setter에서 주문 금액이 100.0 이상일 경우
	// "주문 번호 : ㅇㅇㅇ, 주문금액 : ㅇㅇㅇ, 주문 상태: ㅇㅇㅇ"
	public void setnumber(String number) {
		this.number = number;
	}
	public void setstatus(String status) {
		this.status = status;
	}
	public void setamount(double amount) {
		if(amount < 100.0) {
			System.out.print("유효하지 않은 금액입니다.");
			this.amount = 0;
		}else if(amount >= 100.0){
			System.out.print(number+","+amount+","+status);
			this.amount = amount;
		}
	}
	
	public String getnumber() {
		return number;
	}
	public String getstatus() {
		return status;
	}
	public double getamount() {
		return amount;
	}
	
	// 주문 번호(number), 주문금액(amount), 주문 상태(status)
	// ex)"ORDER3, 120.5, "결제완료"
}
