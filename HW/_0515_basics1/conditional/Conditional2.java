package _0515_basics1.conditional;

import java.util.Scanner;

public class Conditional2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int a = sc.nextInt();

        if (a < 0){
            System.out.println("음수");
        } else {
            System.out.println("양수");
        }
    }
}
