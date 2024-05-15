package hw11.base02.inheritance.alba;

public class Casher extends Alba{

    public Casher(int workHour, int workPrice) {
        super(workHour, workPrice);
    }

    @Override
    public void working() {
        System.out.println("캐셔는 " + getWorkHour() + "동안 계산해서 " + (getWorkHour() * getWorkPrice()) + "를 받습니다.");
    }
}
