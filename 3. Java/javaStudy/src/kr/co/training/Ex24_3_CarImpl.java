package kr.co.training;

public class Ex24_3_CarImpl implements Ex24_3_Car {
	boolean isRunning = false; // 운행 상태 여부
	int speed = 0;
	String status;
	
	@Override
	public void start() {
		if(!isRunning) {
			isRunning = true;
			System.out.println("자동차가 시작되었습니다.");
		}else {
			System.out.println("자동차가 이미 시작되어 있습니다.");
		}
	}
	
	@Override
	public void stop() {
		if(isRunning) {
			isRunning = false;
			this.speed = 0;
			System.out.println("자동차가 정지되었습니다.");
		}else {
			System.out.println("자동차가 이미 정지되어 있습니다.");
		}
	}
	
	@Override
	public void accelerate(int speed) {
		if(isRunning) {
			this.speed = this.speed + speed;
			System.out.println("자동차가 " + speed + "km/h로 가속 중입니다.");
		}else {
			System.out.println("자동차가 정지 상태 입니다. 먼저 시작하세요.");
		}
	}
	
	@Override
	public void brake() {
		if(isRunning == true && speed > 0) {
			this.speed = this.speed - 10;
			System.out.println("자동차가 감속 중입니다.");
		}else if(speed <= 0){
			System.out.println("자동차가 이미 정지상태 입니다.");
		}else {
			System.out.println("자동차가 정지 상태 입니다. 먼저 시작하세요.");
		}
	}
	
	@Override
	public void getInfo() {
		if(isRunning) {
			System.out.println("자동차가 " + this.speed + "km/h로 가속 중입니다.");
			status = "운행중";
		}else {
			System.out.println("자동차가 정지 상태 입니다. 먼저 시작하세요.");
			status = "정지";
		}
		System.out.println(  "상태: " + status + ", 현재 속도: " + this.speed + "km/h");
	}
}
