package hw04;

public class ContractEmployee extends Employee {

    public int workDay;

    public ContractEmployee(int eno, String name, int pay, int type, int workDay) {
        super(eno, name, pay, type);
        this.workDay = workDay;
    }

    @Override
    public double getMonthPay() {
        return getPay() * workDay;
    }

    @Override
    public void showEmployeeInfo() {
        super.showEmployeeInfo();
        System.out.println("근무일수: " + workDay);
        System.out.println("월급: " + getMonthPay());
    }
}
