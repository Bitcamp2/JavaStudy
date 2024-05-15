package _0515_basics1.typeconversion;

import java.util.Scanner;

public class TypeConversion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println("Enter an integer(Except 0): ");
        int num2 = sc.nextInt();

        double dNum = num / num2;

        System.out.println(num + " 을 " + num2 + "로 나눈 값: " + dNum);
    }
}
