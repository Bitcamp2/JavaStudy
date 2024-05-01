package _240501_.basic;

public class SmartPhone {
    // 1. SmartPhone 클래스를 생성하고 속성 세 개와 기능 세 개를 자유롭게 만들어보세요.

    public String company;
    public String color;
    public int ram;


    public SmartPhone() {

    }

    public SmartPhone(String company, String color, int ram) {
        this.company = company;
        this.color = color;
        this.ram = ram;
    }

    public void call() {
        System.out.println("전화를 건다.");
    }
    public void message() {
        System.out.println("메세지를 보낸다.");
    }
    public void game() {
        System.out.println("게임을 구동한다.");
    }

}
