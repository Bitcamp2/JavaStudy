package basic;

import java.util.Scanner;

public class basic12 {
    public static void main(String[] args) {

        int[] numArr = new int[10];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            numArr[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (numArr[i] % 2 == 0 || numArr[i] % 3 == 0) {
                System.out.println(numArr[i]);
            }
        }

    }

}