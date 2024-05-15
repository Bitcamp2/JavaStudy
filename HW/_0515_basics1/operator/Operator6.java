package _0515_basics1.operator;

import java.util.Scanner;

public class Operator6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int num = sc.nextInt();

        String result = (num > 100) ? "100보다 큼" : (num < 100) ?"100보다 작음" : "100";
        System.out.println(num + " 은 " + result);

        sc.close();
    }
}
