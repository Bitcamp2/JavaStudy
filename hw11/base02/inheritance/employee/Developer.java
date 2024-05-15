package hw11.base02.inheritance.employee;

public class Developer implements Employee{
    @Override
    public void goWork() {
        System.out.println("개발 하러 출근합니다.");
    }

    @Override
    public void leaveWork() {
        System.out.println("개발 끝내고 퇴근합니다.");
    }

    @Override
    public void working() {
        System.out.println("프로그램 개발중입니다.");
    }
}
