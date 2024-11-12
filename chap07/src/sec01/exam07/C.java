package sec01.exam07;
import sec01.exam07.A;

public class C {
	public void method() {
		A a = new A();
		a.field = "value"; // 접근 불가능
		a.method();
	}
}
