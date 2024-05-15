package _0515_basics2.arrangement;

import java.util.Scanner;

public class arrangement4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[50];

        int sum = 0;
        int index = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                arr[index] = i;
                sum += i;
                index++;
            }
        }

        System.out.println("배열의 합: " + sum);

    }
}
