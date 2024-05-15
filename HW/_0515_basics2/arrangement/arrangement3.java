package _0515_basics2.arrangement;

import java.util.Scanner;

public class arrangement3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        System.out.println("정수 10개를 입력하세요:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += arr[i];
        }
        double average = sum / 10;

        System.out.println("입력한 정수의 평균은 " + average + "입니다.");

        sc.close();
    }
}
