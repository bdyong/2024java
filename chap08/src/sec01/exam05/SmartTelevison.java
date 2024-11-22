package sec01.exam05;

import sec01.exam03.RemoteControl;

public class SmartTelevison implements RemoteControl, Searchable {
	private int volume;
	
	public void turnOn() {
		System.out.println("TV 를 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("TV 를 끕니다.");
	}
	
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
	
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
}
