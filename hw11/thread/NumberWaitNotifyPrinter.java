package hw11.thread;

public class NumberWaitNotifyPrinter {
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public synchronized void numPrint1(int num) {
        this.setNum(num);

        for (int i = this.num; i <= 50; i++) {
            if (i % 3 == 0) {
                System.out.println("스레드 1 - " + i);
                notify();

                try {
                    wait();
                } catch (InterruptedException ie) {
                    System.out.println(ie.getMessage());
                }
            }
        }
    }

    public synchronized void numPrint2(int num) {
        this.setNum(num);

        for (int i = this.num; i <= 100; i++) {
            if (i % 35 == 0) {
                System.out.println("스레드 2 - " + i);
                notify();

                try {
                    wait();
                } catch (InterruptedException ie) {
                    System.out.println(ie.getMessage());
                }
            }
        }
    }
}
