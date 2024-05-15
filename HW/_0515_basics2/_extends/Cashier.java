package _0515_basics2._extends;

public class Cashier extends PartTIme{

    public Cashier(int workingHours, int hourlyWage) {
        super(workingHours, hourlyWage); // 부모 클래스의 생성자 호출
    }

    // 일하는 메소드 오버라이딩
    @Override
    public void work() {
        System.out.println("캐셔는 일한 시간동안 계산해서 " + (workingHours * hourlyWage) + "을(를) 받는다.");

    }

}


