package hw11.thread;

public class NumThreadMain {
    public static void main(String[] args) {

        // 동기화할 데이터
        NumberPrinter np = new NumberPrinter();

        // 동기화 데이터 스레드 1,2
        NumThread01 nt01 = new NumThread01();
        NumThread02 nt02 = new NumThread02();

        nt01.setNp(np);
        nt02.setNp(np);

        nt01.start();
        nt02.start();
    }
}
