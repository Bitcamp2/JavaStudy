package _0515_basics1.operator;

import java.util.Scanner;

public class Operator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int num = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        int sum  = num + num2;
        System.out.println("덧셈 결과: " + sum);
        int diff = num - num2;
        System.out.println("뺄셈 결과: " + diff);
        int product = num * num2;
        System.out.println("곱셈 결과: " + product);

        if (num2 != 0) {
            double quotient = (double) num / num2;
            System.out.println("나눗셈 결과: " + quotient);
        } else {
            System.out.println("0으로 나눌 수 없습니다.");
        }

        sc.close();
    }
}
