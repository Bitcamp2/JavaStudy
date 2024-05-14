package _240502_.advance;

public class Part extends Worker2 {

    int hireYear;

    @Override
    public void getMonthPay() {
        System.out.println("월급: " + pay/12);
    }

    public void showEmployeeInfo() {
        super.showEmployeeInfo();
        System.out.println(hireYear);
    }
}
