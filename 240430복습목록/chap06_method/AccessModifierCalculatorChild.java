package chap06_method;

import chap06_method.calc.AccessModifierCalculator;

public class AccessModifierCalculatorChild extends AccessModifierCalculator{
	public void print() {
//		상속 받은 클래스엣 상속해준 클래스를 호출할 때는 super라는 키워드를 이용 한다.
//		상속 받은 자식 클래스에서는 public, protexted 메소드 사용가능
		super.add();
		super.sub();
	}

}
