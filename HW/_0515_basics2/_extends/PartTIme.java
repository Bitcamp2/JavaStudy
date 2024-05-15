package _0515_basics2._extends;

public class PartTIme {

    protected int workingHours;  // 일한 시간
    protected int hourlyWage;    // 시간당 급여

    // 생성자
    public PartTIme(int workingHours, int hourlyWage) {
        this.workingHours = workingHours;
        this.hourlyWage = hourlyWage;
    }

    // 일하는 메소드
    public void work() {
        System.out.println("알바는 일한 시간동안 " + (workingHours * hourlyWage) + "을(를) 받는다.");

    }

}
