package sec02.exam01;

public class Car {
	Tire frontLeftTire = new HankookTire();   // 인터페이스 타입 필드 선언과 초기 구현 객체 타입
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	void run() {
		frontLeftTire.roll();		// 인터페이스에서 설명된 roll() 메소드 호출
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
