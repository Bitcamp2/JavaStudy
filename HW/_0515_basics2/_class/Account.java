package _0515_basics2._class;

public class Account {

    private double balance;

    // 생성자
    public Account(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("잘못된 초기 잔액입니다. 초기 잔액은 0보다 작을 수 없습니다.");
        }
    }

    // 입금 메소드
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "원이 입금되었습니다.");
        } else {
            System.out.println("잘못된 입금액입니다. 입금액은 0보다 커야 합니다.");
        }
    }

    // 출금 메소드
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + "원이 출금되었습니다.");
        } else {
            System.out.println("출금할 수 없습니다. 출금액이 잔액보다 크거나 잔액이 부족합니다.");
        }
    }

    // 잔액 조회 메소드
    public void checkBalance() {
        System.out.println("현재 잔액: " + balance + "원");
    }

}
