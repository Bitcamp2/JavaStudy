package _0515_basics1.conditional;

import java.util.Scanner;

public class Conditional5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int a = sc.nextInt();

        if(a % 2 == 0) {
            System.out.println("짝수입니다");
        } else{
            System.out.println("홀수입니다");
        }
    }
}
