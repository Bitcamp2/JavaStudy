package _0515_basics1.variable;

import java.util.Scanner;

public class Variable5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter another number: ");
        int b = sc.nextInt();
        System.out.println("Enter another number: ");
        int c = sc.nextInt();

        int min,mid,max;

        if (a <= b && a <= c) {
            min = a;
            if (b <= c) {
                mid = b;
                max = c;
            } else {
                mid = c;
                max = b;
            }
        } else if (b <= a && b <= c) {
            min = b;
            if (a <= c) {
                mid = a;
                max = c;
            } else {
                mid = c;
                max = a;
            }
        } else {
            min = c;
            if (a <= b) {
                mid = a;
                max = b;
            } else {
                mid = b;
                max = a;
            }
        }

        System.out.println("The minimum number is: " + min);
        System.out.println("The middle number is: " + mid);
        System.out.println("The maximum number is: " + max);


    }
}
