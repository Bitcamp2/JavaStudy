package chap99_Homework.homework04;

public class Temporary extends Employee {
	public int hireYear;
	
	@Override
	public double getMonthPay() {
		double monthlypay = this.pay/12;
		return monthlypay;
	}

	@Override
	public void showEmployeeInfo() {
		// TODO Auto-generated method stub
		System.out.println("Temporary [hireYear=" + hireYear + ", eno=" + eno + ", name=" + name + ", pay=" + pay + ", type=" + type
				+ "]");
	}
}
