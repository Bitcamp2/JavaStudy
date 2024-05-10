package _240502_.advance;

public class Side extends Worker2{

    int workDay;

    @Override
    public void getMonthPay() {
        System.out.println("월급: " + pay * workDay);
    }

    public void showEmployeeInfo() {
        super.showEmployeeInfo();
        System.out.println(workDay);
    }
}
