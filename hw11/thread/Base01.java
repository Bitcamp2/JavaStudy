package hw11.thread;

public class Base01{
    //1. 메인스레드는 1~20까지 3과 4의 공배수를 출력하는 작업을 하고
    // 1~20까지의 숫자중 30의 약수를 출력하는 서브 스레드를 하나 갖는다.
    // 각각의 스레드를 실행하십시오.

    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 1; i <= 20; i++) {
                    if (30 % i == 0) {
                        System.out.println("sub: " + i);
                    }
                }
            }
        });
        thread.start();

        for (int i = 1; i <= 20; i++) {
            if (i % 12 == 0) {
                System.out.println("main: " + i);
            }
        }

    }
}
