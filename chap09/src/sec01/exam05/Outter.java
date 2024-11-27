package sec01.exam05;

public class Outter {
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested {
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		void print() {
			System.out.println(this.field); // 중첩 객체 참조
			this.method();
			System.out.println(Outter.this.field); // 바깥 객체 참조
			Outter.this.method();
		}
	}
}
