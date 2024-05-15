package hw11.base02.clss;

public class MulIntDouble {

    // 4. 정수 한 개와 실수 한 개를 전달받아 소수점 두자리까지만 가지는 곱의 결과를 리턴하는 메소드를 구현하세요.

    public double mulIntDouble(int a, double b) {
        return (double) Math.round((a * b * 100) / 100);
    }

}
