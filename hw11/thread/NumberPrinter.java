package hw11.thread;

public class NumberPrinter {
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public synchronized void numPrint1(int num) {
        this.setNum(num);

        for (int i = num; i <= 50; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException ie) {
                    System.out.println(ie.getMessage());
                }
            }
        }
    }

    // 위아래가 똑같은 방식
    public void numPrint2(int num) {
        synchronized (this) {
            setNum(num);
        }
        for (int i = num; i <= 100; i++) {
            if (i % 35 == 0) {
                System.out.print(i + " ");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException ie) {
                    System.out.println(ie.getMessage());
                }
            }
        }
    }
}
