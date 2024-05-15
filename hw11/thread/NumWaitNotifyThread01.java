package hw11.thread;

import java.util.Scanner;

public class NumWaitNotifyThread01 extends Thread{

    private NumberWaitNotifyPrinter nwnp;
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    public NumberWaitNotifyPrinter getNwnp() {
        return nwnp;
    }

    public void setNwnp(NumberWaitNotifyPrinter nwnp) {
        this.nwnp = nwnp;
    }

    @Override
    public void run() {
        nwnp.numPrint1(num);
    }
}
