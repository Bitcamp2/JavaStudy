package hw11.base02.clss;

public class Money {

    // 6. 잔액을 속성으로 가지고 입금, 출금, 잔액 조회를 메소드로 갖는 계좌 클래스를 생성하세요.

    private int money;

    public Money(int money) {
        this.money = money;
    }

    public int depositMoney(int money) {
        return this.money += money;
    }

    public int withdrawMoney(int money) {
        return this.money -= money;
    }

    public void printMoneyInfo() {
        System.out.println("현재 남은 금액은 " + money + "원 입니다.");
    }

}
