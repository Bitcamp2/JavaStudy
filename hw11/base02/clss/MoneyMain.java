package hw11.base02.clss;

public class MoneyMain {
    public static void main(String[] args) {

        Money money = new Money(5000);

        money.depositMoney(3000);
        money.withdrawMoney(2000);
        money.printMoneyInfo();
    }
}
