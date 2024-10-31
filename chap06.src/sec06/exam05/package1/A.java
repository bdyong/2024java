package sec06.exam05.package1;

import java.lang.reflect.Method;

public class A {
	// 필드
	public int field1; 
	int field2;
	private int field3;
	
	// 생성자
	public A() {
		field1 = 1;
		field2 = 1;
		field3 = 1; // private 메소드 접근 불가
		
		method1();
		method2();
		method3(); // private 필드 접근 불가
	}

	// 메소드
	public void method1() {}
	void method2() {}
	private void method3() {}
 
}
