package _0515_basics1.iteration;

import java.util.Scanner;

public class Iteration5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers:");

        for(int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        for(int  i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
        }
    }
}
