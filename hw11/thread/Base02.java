package hw11.thread;

public class Base02 {

    // 2. 1번 문제에서 join()메소드를 이용해서 서브 스레드가 먼저 실행돼서
    // 끝난 후에 메인 스레드가 실행되도록 구현하세요.
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.print("1~20 까지 30의 약수: ");
                for (int i = 1; i <= 20; i++) {
                    if (30 % i == 0) {
                        System.out.print(i + " ");
                    }
                }
            }
        });
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
        }
        System.out.println();
        System.out.print("1~20까지 3과 5의 공배수: ");
        for (int i = 1; i <= 20; i++) {
            if (i % 12 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
