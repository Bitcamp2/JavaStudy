package _0515_basics1.conditional;

import java.util.Scanner;

public class Conditional8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Enter sec number: ");
        int num2 = sc.nextInt();

        if (num == num2) {
            System.out.println("두 수가 같습니다");
        } else if (num > num2) {
            System.out.println("첫번째 수가 더 큽니다");
        } else {
            System.out.println("두번째 수가 더 큽니다");
        }


    }
}
