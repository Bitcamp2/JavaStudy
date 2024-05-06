package hw04;

public class RegularEmployee extends Employee{
    public int bonus;

    public RegularEmployee(int eno, String name, int pay, int type, int bonus) {
        super(eno, name, pay, type);
        this.bonus = bonus;
    }

    @Override
    public double getMonthPay() {
        return getPay() / 12 + bonus / 12;
    }

    public void showEmployeeInfo() {
        super.showEmployeeInfo();
        System.out.println("보너스: " + bonus);
        System.out.println("월급: " + getMonthPay());
    }
}
