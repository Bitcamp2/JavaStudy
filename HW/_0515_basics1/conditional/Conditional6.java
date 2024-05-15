package _0515_basics1.conditional;

import java.util.Scanner;

public class Conditional6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < 5  ; i++) {
            System.out.print("Enter number ");
            int number = in.nextInt();
            if(number > max) {
                max = number;
            }
        }

        System.out.println("최대값: " + max);

    }
}
