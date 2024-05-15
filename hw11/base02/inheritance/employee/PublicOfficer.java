package hw11.base02.inheritance.employee;

public class PublicOfficer implements Employee {

    @Override
    public void goWork() {
        System.out.println("출근 중입니다.");
    }

    @Override
    public void leaveWork() {
        System.out.println("근무시간 마치고 퇴근중입니다.");
    }

    @Override
    public void working() {
        System.out.println("공무집행 중입니다.");
    }
}
