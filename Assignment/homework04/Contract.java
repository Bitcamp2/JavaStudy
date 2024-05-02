package chap99_Homework.homework04;

public class Contract extends Employee {
	public int workDay;
	
	@Override
	public double getMonthPay() {
		double monthlypay = this.pay*workDay;
		return monthlypay;
	}

	@Override
	public void showEmployeeInfo() {
		// TODO Auto-generated method stub
		System.out.println("Contract [workDay=" + workDay + ", eno=" + eno + ", name=" + name + ", pay=" + pay + ", type=" + type
				+ "]");
	}
}
