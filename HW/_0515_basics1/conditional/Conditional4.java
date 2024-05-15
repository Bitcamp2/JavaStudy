package _0515_basics1.conditional;

import java.util.Scanner;

public class Conditional4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int a = sc.nextInt();

        switch(a % 3) {
            case 0 :
                System.out.println("3의 배수입니다");
                break;
            default:
                System.out.println("3의 배수가 아닙니다");
        }
    }
}
