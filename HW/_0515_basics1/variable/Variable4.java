package _0515_basics1.variable;

import java.util.Scanner;

public class Variable4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println("Enter an integer: ");
        int num2 = sc.nextInt();
        System.out.println("Enter an integer: ");
        int num3 = sc.nextInt();
        System.out.println("Enter an integer: ");
        int num4 = sc.nextInt();
        System.out.println("Enter an integer: ");
        int num5 = sc.nextInt();

        int addResult = num + num2 + num3 + num4 + num5;
        System.out.println("합계는: " + addResult);

        int divResult = addResult / 5;
        System.out.println("평균은: " + divResult);

    }
}
