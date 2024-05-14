package _0514_.basic;

public class NumberPrinter {
    private int num;

    public void setNum(int num){
        this.num = num;
    }

    public synchronized void numPrint1(int num) {
        for (int i = num; i <= 50; i++) {
            if (i % 3 == 0) {
                System.out.println("3의 배수: " + i);
            }

            notify();

            try {
                wait();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }

    public synchronized void numPrint2(int num) {
        for(int i = 1; i <= 100; i++) {
            if(i % 5 ==0 && i % 7 ==0){
                System.out.println("5와 7의 공배수: " + i);
            }

            notify();

            try {
                wait();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}
