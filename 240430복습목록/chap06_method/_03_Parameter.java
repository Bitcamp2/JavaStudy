package chap06_method;

import chap06_method.calc.ParameterCalculator;

public class _03_Parameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterCalculator pc = new ParameterCalculator();
		
//		메소드의 사용은 항상 선언된 형태와 동일하게 호출해서 사용한다.
		pc.add(10, 20L); // (int a, long b) 였음.
		
		
//		다른 형태로 호출하면 에러가 발생하게 됌.
//		pc.add(10, 20.0); // long형 자리에 double형을 넣었다.

//		매개변수 값 전달은 변수로도 가능하다.
//		이 경우, 변수에 저장된 값이 메소드로 저장 된다.
		int num1 = 100;
		long num2 = 200L;
		
		pc.add(num1, num2);
		
//		호출할 때 매개변수의 타입, 개수, 순서를 동일하게 호출 한다. 
		double result = pc.div(20.0, 10); // 타입 순서에 맞춰야 에러가 발생하지 않음.
		System.out.println(result);
		
		System.out.println(pc.concat("bit", "camp"));
		
		
		
	}

}
