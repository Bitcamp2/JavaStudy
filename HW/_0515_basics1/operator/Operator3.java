package _0515_basics1.operator;

import java.util.Scanner;

public class Operator3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        if (num % 2 == 0 && num % 7 == 0) {
            System.out.println("2와 7의 공배수");
        } else {
            System.out.println("2와 7의 공배수가 아니지롱");
        }
    }
}
