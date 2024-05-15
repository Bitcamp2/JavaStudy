package hw11.base02.inheritance.alba;

public class CoupangMan extends Alba {

    public CoupangMan(int workHour, int workPrice) {
        super(workHour, workPrice);
    }

    @Override
    public void working() {
        System.out.println("쿠팡맨은 " + getWorkHour() + "동안 배달해서 " + (getWorkHour() * getWorkPrice()) + "를 받습니다.");
    }
}
