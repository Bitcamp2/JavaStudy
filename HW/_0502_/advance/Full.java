package _240502_.advance;

public class Full extends Worker2{

    int bonus;

    @Override
    public void getMonthPay() {
        System.out.println("월급: " + pay/12 +bonus/12);
    }

    public void showEmployeeInfo() {
        super.showEmployeeInfo();
        System.out.println(bonus);
    }
}
