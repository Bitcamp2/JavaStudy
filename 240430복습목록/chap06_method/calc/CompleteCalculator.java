package chap06_method.calc;

public class CompleteCalculator {
//	int형 매개변수 2개를 받는 메소드 add, sub, mul, div, mod를 구현하세요.
//	접근제어자는 모두 public으로 생성하고 div와 mod의 리턴 타입은 double 나머지 메소드는 int로 지정하세요.
//	div와 mod의 두 번째 매개변수가 분모이고 분모에 0이 들어오면 0을 리턴하세요.
	
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int sub(int a, int b) {
		return a - b;
	}
	
	public int mul(int a, int b) {
		return a * b;
	}
	
//	이렇게 생각했음.
//	public double div(int a, int b) {
//			if(b == 0) {
//			return b; 
//		} else { (double)return a / b; 
//	}	
//}
	
	public double div(int a, int b) {
		if(b ==0)
			return 0;
		return (double) a / b;
	}
	
//	이렇게 생각했음
//	public double mod(int a, int b) {
//		if(b == 0) {
//			return b;
//		} else { return a % b;
//	}
//		
////}
	
	public int mod(int a, int b) {
		if(b == 0)  return 0; return a / b;
	}
	
	
	
	
	
	
}
