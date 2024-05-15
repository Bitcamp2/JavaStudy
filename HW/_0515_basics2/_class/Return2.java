package _0515_basics2._class;

public class Return2 {
    public static double multiplyWithPrecision(int integerNum, double doubleNum) {
        double product = integerNum * doubleNum;
        // 결과를 소수점 두 자리까지 반올림하여 반환
        return Math.round(product * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        int integerNum = 6;
        double doubleNum = 1.13;

        double result = multiplyWithPrecision(integerNum, doubleNum);
        System.out.println("곱의 결과: " + result);
    }

}
