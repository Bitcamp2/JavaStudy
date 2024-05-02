package _240502_.advance;

public class Worker2 {

    int eno;
    String name;
    int pay;

    int fullType;
    int partType;
    int sideType;

    public Worker2() {

    }


    public Worker2(int eno, String name, int pay, int type) {
        this.eno = eno;
        this.name = name;
        this.pay = pay;
        this.fullType = type;
        this.partType = type;
        this.sideType = type;
    }

    public void getMonthPay() {
        System.out.println("Month Pay: " + pay);
    }

    public void showEmployeeInfo() {
        System.out.println("Eno: " + eno);
        System.out.println("Emplyee: " + name);
        System.out.println("Pay: " + pay);
    }



}
