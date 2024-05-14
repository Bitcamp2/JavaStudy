package hw11.thread;

public class WaitNotifyMain {
    public static void main(String[] args) {

        // 동기화할 데이터
        NumberWaitNotifyPrinter nwnp = new NumberWaitNotifyPrinter();

        // 동기화 데이터 스레드 1,2
        NumWaitNotifyThread01 nwnt01 = new NumWaitNotifyThread01();
        NumWaitNotifyThread02 nwnt02 = new NumWaitNotifyThread02();

        nwnt01.setNwnp(nwnp);
        nwnt02.setNwnp(nwnp);

        nwnt01.start();
        nwnt02.start();
    }
}

