package sec01.exam04;

import sec01.exam03.RemoteControl;

public class Televison implements RemoteControl {

	//필드
	private int volume;
		
	//turnOn() 추상 메소드의 실제 메소드
	public void turnOn() {
	System.out.println("TV를 켭니다.");
	}
		
	//turnOff() 추상 메소드의 실제 메소드
	public void turnOff() {
	System.out.println("TV를 끕니다.");
	}

	//setVolume() 추상 메소드의 실체 메소드
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOULME) {
			this.volume = RemoteControl.MAX_VOULME;
		} else if (volume <  RemoteControl.MIN_VOULME) {
			this.volume = RemoteControl.MIN_VOULME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}
}
