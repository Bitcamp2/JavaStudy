package _0515_basics1.iteration;

import java.util.Scanner;

public class Iteration7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = sc.nextInt();
        System.out.println("Enter sec number: ");
        int num2 = sc.nextInt();

        int gcd = findGCD(num, num2);
        int lcm = (num * num2) / gcd;

        System.out.println("두 정수의 최대공약수는 " + gcd + "입니다.");
        System.out.println("두 정수의 최소공배수는 " + lcm + "입니다.");
    }
        private static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
