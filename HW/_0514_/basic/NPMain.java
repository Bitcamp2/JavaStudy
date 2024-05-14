package _0514_.basic;

public class NPMain extends Thread{
    public static void main(String[] args) {

        NumberPrinter np =  new NumberPrinter();

        NumberPrinter01 thread1 = new NumberPrinter01();
        NumberPrinter02 thread2 = new NumberPrinter02();

        thread1.setPrinter(np);
        thread2.setPrinter(np);

        thread1.start();
        thread2.start();

    }
}
