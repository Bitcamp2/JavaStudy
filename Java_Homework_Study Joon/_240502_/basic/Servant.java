package _240502_.basic;

public class Servant extends Worker{

    @Override
    public void goWork() {
        System.out.println("Go work");
    }

    @Override
    public void leaveWork() {
    System.out.println("Leave work");
    }

    @Override
    public void work() {
    System.out.println("work");
    }
}
