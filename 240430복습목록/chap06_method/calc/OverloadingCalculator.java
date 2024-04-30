package chap06_method.calc;

public class OverloadingCalculator {
//	기본적으로 같은 이름의 메소드는 못 만든다.
//	오버로딩을 통해 같은 이름의 메소드를 여러개 생성할 수 있다.
//	오버로딩은 메소드의 매개변수 타입(구성)을 다르게 하여 생성하는 것이다.
	public int add(int a, int b) {
		return a + b;
	}
	
//	매개변수의 타입이 다른 메소드
	public int add(double a, int b) {
		return (int)a + b;
	}
	
	public int add(int a, double b) {
		return a + (int)b;
	}
	
	public int add(int a, int b, int c) {
		return a + b + c;
	}
	
//	변수명이 달라도 타입과 갯수가 같아서 불가능.
//	public int add(int e, int f) {
//		return e + f;
//	}

}
