package basic;

import java.util.Scanner;

public class basic12uu {
    public static void main(String[] args) {

        int[] intArray = new int[10];

        Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 10; i++) {

        intArray[i] = sc.nextInt();

        if (intArray[i] % 2 == 0 && intArray[i] % 3 == 0) {
        }
        System.out.println(intArray[i]);
    }

    }
}
