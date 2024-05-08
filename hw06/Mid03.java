package hw06;

public class Mid03 {
    public static void main(String[] args) {
        int money = 10000;
        int interestRate = 0;

        for (int i = 1; i <= 10; i++) {
            //money + money * 0.1;
            //money*(1+0.1)
            money *= 1.1;
        }
        System.out.println("10년 후 금액: " + money);

//        for (int i = 0; i < 10; i++) {
//            interestRate = money / 10;
//            money += interestRate;
//
//            System.out.println((i + 1) + "년차 금액: " + money);
//        }
    }
}
