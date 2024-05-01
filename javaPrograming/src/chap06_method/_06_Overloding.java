package chap06_method;

import chap06_method.calc.OverlodingCalculator;

public class _06_Overloding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		double dNum1 = 40.0;
		double dNum2 = 50.0;
		
		int result;
		
		OverlodingCalculator oc = new OverlodingCalculator();
		
		result = oc.add(num1, num2, num3);
		System.out.println(result);
		
		result = oc.add(dNum1, num1);
		System.out.println(result);
		
		result = oc.add(num2, num3);
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
	}

}
