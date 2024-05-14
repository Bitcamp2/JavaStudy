package hw11.thread;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class NumThread02 extends Thread{
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
        np.numPrint2(num);
    }
}
