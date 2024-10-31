package sec06.exam04.package2;

public class C {
	// 필드
	A a1 = new A(true); // 접근 가능
	A a2 = new A(1); // default 생성자 접근 불가
	A a3 = new A("문자열") // private 생성자 접근 불가
}
