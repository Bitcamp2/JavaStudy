package chap99_Homework.homework04;

public class Permanent extends Employee {
	public int bonus;
	
	@Override
	public double getMonthPay() {
		double monthlypay = this.pay/12 + bonus/12;
		return monthlypay;
	}

	@Override
	public void showEmployeeInfo() {
		// TODO Auto-generated method stub
		System.out.println("Permanent [bonus=" + bonus + ", eno=" + eno + ", name=" + name + ", pay=" + pay + ", type=" + type
				+ "]");
	}

}
