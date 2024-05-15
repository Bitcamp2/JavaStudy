package _0515_basics1.operator;

import java.util.Scanner;

public class Operator4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Hello");
        String hello = sc.nextLine();

        if (hello.equals("Hello")) {
            System.out.println("잘했어");
        } else {
            System.out.println("Hello도 못씀?");
        }
    }
}
