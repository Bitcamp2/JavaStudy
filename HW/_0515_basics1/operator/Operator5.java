package _0515_basics1.operator;

import java.util.Scanner;

public class Operator5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();

//        if(a % 2 == 0) {
//            System.out.println("짝수");
//        } else {
//            System.out.println("홀수");
//        }

        String result = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println(num + "는(은) " + result + "입니다.");

        sc.close();
    }
}
