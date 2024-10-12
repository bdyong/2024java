package sec01.exam06;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int time = (int) (Math.random() * 4) +8;
	
	switch (time) {
	case 8:
		System.out.println("출근합니다.");
		break;

	case 9:
		System.out.println("회의를 합니다.");
		break;
		
	case 10:
		System.out.println("업무를 봅니다.");
		break;
		
	default:
		System.out.println("외근을 나갑니다.");
		break;
	}
	}

}
