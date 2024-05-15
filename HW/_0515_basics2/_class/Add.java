package _0515_basics2._class;

public class Add {

    // 두 정수의 합을 구하는 메소드
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // 정수 3개의 제곱의 합을 구하는 메소드 (오버로딩)
    public int add(int num1, int num2, int num3) {
        return num1 * num1 + num2 * num2 + num3 * num3;
    }

    public static void main(String[] args) {
        Add adder = new Add();

        // 두 정수의 합 구하기
        int sum = adder.add(1, 2);
        System.out.println("두 정수의 합: " + sum);

        // 세 정수의 제곱의 합 구하기
        int sumOfSquares = adder.add(3, 6, 9);
        System.out.println("세 정수의 제곱의 합: " + sumOfSquares);
    }
}
