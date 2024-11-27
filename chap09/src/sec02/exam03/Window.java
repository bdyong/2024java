package sec02.exam03;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	// 필드 초기값으로 대입
	Button.OnClickListener listener = new Button.OnClickListener() {
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	
	Window() {
		button1.setOnClicklistner(listener);
		button2.setOnClicklistner(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("메세지를 보냅니다.");
			}
		});
	}
}
