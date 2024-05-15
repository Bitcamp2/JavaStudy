package _0515_basics2._extends;

public class Officer implements Worker{

    @Override
    public void goWork() {
        System.out.println("공무원이 출근합니다.");
    }

    @Override
    public void leaveWork() {
        System.out.println("공무원이 퇴근합니다.");
    }

    @Override
    public void work() {
        System.out.println("공무원이 업무를 처리합니다.");
    }
}
