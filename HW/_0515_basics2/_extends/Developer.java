package _0515_basics2._extends;

public class Developer implements Worker{

    public void goWork() {
        System.out.println("개발자가 출근합니다.");
    }

    public void leaveWork() {
        System.out.println("개발자가 퇴근합니다.");
    }

    public void work() {
        System.out.println("개발자가 코딩을 합니다.");
    }

}
