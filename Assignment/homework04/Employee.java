package chap99_Homework.homework04;

public abstract class Employee {
	public int eno;
	public String name;
	public int pay;
	public int type;
	
	public abstract double getMonthPay();
	public abstract void showEmployeeInfo();
}
