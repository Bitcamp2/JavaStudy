package _0515_basics2.arrangement;

import java.util.Scanner;

public class arrangement5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        System.out.println("정수 10개를 입력하세요:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < 10; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("입력한 정수 중 최소값: " + min);
        System.out.println("입력한 정수 중 최대값: " + max);

        sc.close();

    }
}
