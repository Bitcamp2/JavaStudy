package _0515_basics1.operator;

import java.util.Scanner;

public class Operator7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter double: ");
        double dNum1 = sc.nextDouble();
        System.out.println("Enter second double: ");
        double dNum2 = sc.nextDouble();

        double sum = dNum1 + dNum2;
        System.out.println("덧셈 결과: " + sum);

        // 뺄셈
        double diff = dNum1 - dNum2;
        System.out.println("뺄셈 결과: " + diff);

        // 곱셈
        double product = dNum1 * dNum2;
        System.out.println("곱셈 결과: " + product);

        // 나눗셈
        if (dNum2 != 0) {
            double division = dNum1 / dNum2;
            System.out.println("나눗셈 결과: " + division);
        } else {
            System.out.println("0으로 나눌 수 없습니다.");
        }

    }
}
