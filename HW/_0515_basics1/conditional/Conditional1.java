package _0515_basics1.conditional;

import java.util.Scanner;

public class Conditional1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Enter another number: ");
        int num2 = sc.nextInt();

        if (num == num2) {
            System.out.println("똑같잖아 바보야");
        } else if (num > num2) {
            System.out.println(num + "이 더 커서 출력함");
        } else {
            System.out.println(num2 + "이 더 커서 출력함");
        }

    }
}
