package hw11.thread;

import java.util.Scanner;

public class NumThread01 extends Thread{

    private NumberPrinter np;
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    public NumberPrinter getNp() {
        return np;
    }

    public void setNp(NumberPrinter np) {
        this.np = np;
    }

    @Override
    public void run() {
        np.numPrint1(num);
    }
}
