package sec01.exam03;

public interface RemoteControl {

	//상수
	public int MAX_VOULME = 10;
	public int MIN_VOULME = 0;
		
	//추상 메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
