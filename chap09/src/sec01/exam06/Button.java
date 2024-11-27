package sec01.exam06;

public class Button {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) { // 매개 변수의 다형성
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();	// 구현 객체의 onClick() 메소드 호출
	}
	
	static interface OnClickListener { // 중첩 인터페이스
		void onClick();
	}
}
