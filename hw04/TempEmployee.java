package hw04;

public class TempEmployee extends Employee{

    public int hireYear;

    public TempEmployee(int eno, String name, int pay, int type, int hireYear) {
        super(eno, name, pay, type);
        this.hireYear = hireYear;
    }

    @Override
    public double getMonthPay() {
        return getPay() / 12;
    }

    @Override
    public void showEmployeeInfo() {
        super.showEmployeeInfo();
        System.out.println("근무년수: " + hireYear);
        System.out.println("월급: " + getMonthPay());
    }
}
