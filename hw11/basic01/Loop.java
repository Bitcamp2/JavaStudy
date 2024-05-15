package hw11.basic01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        // 1. 1부터 10까지의 정수의 합을 출력하세요.
//        int sum1 = 0;
//        for (int i = 1; i <= 10; i++) {
//            sum1 += i;
//        }
//        System.out.println("합: " + sum1);
//
//        // 2. 2의 거듭제곱을 10회동안 반복하며 출력하세요.(2 * 2 = 4, 2 * 2 * 2 = 8 .....) 10회 반복 출력
//        int num2 = 2;
//        int numMul2 = 2;
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.print("2");
//            for (int j = 0; j < i; j++) {
//                System.out.print(" * 2");
//            }
//            numMul2 *= num2;
//            System.out.print(" = " + numMul2 + ", ");
//        }
//
//        // 3. 사용자가 입력한 정수까지의 모든 소수를 출력하세요.
//        System.out.println("정수 입력: ");
//        int num3 = sc.nextInt();
//
//        System.out.print("소수: 1 ");
//        for (int i = 2; i <= num3; i++) {
//            int cnt3 = 0;
//            for (int j = 1; j <= i; j++) {
//                if (i % j == 0) {
//                    cnt3++;
//                }
//            }
//            if (cnt3 == 2) {
//                System.out.print(i + " ");
//            }
//        }
//
//        // 4. 사용자가 입력한 정수의 약수를 출력하세요.
//        System.out.println("정수입력: ");
//        int num4 = sc.nextInt();
//
//        System.out.print("약수: ");
//        for (int i = 1; i <= num4; i++) {
//            if (num4 % i == 0) {
//                System.out.print(i + " ");
//            }
//        }
//
//        // 5. 사용자가 입력한 10개의 정수를 역순으로 출력하세요.(배열 사용)
//        int[] intArr5 = new int[10];
//
//        System.out.println("정수 10개 입력: ");
//        for (int i = 0; i < intArr5.length; i++) {
//            intArr5[i] = sc.nextInt();
//        }
//
//        System.out.print("역순: ");
//        for (int i = 0; i < intArr5.length; i++) {
//            System.out.print(intArr5[intArr5.length - i - 1] + " ");
//        }
//
//        // 6. 사용자가 입력한 문자열을 역순으로 출력하세요.
//        String str6 = sc.next();
//        char[] ch6 = str6.toCharArray();
//
//        System.out.println("역순: ");
//        for (int i = 0; i < ch6.length; i++) {
//            System.out.print(ch6[ch6.length - 1 - i] + " ");
//        }
//
//        // 7. 사용자가 입력한 두 정수의 최소공배수와 최대공약수를 출력하세요.
//        System.out.println("두 정수 입력: ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int gcda = a;
//        int gcdb = b;
//
//        // 최대공약수
//        while (gcdb != 0) {
//            int temp = gcdb;
//            gcdb = gcda % gcdb;
//            gcda = temp;
//        }
//        System.out.println("최대공약수: " + gcda);
//
//        // 최소공배수
//        int lcm = (a * b) / gcda;
//        System.out.println("최소공배수: " + lcm);
//
//        // 8. 중첩 for문으로 이용해서 다음과 같이 출력하세요.
//        //
//        //8-1. *
//        //     **
//        //     ***
//        //     ****
//        //     *****
//        //
//        //8-2. *****
//        //      ****
//        //       ***
//        //        **
//        //         *
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                if (i >= j) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                if (i <= j) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        // 9. 사용자가 q를 입력하기 전까지 계속 반복하면서 입력한 정수의 값을 더해서 출력하세요.
        int sum = 0;
        boolean result = false;
        while (!result) {

            System.out.print("정수 입력(q 입력시 프로그램종료): ");
            String num = sc.next();

            if (num.equalsIgnoreCase("q")) {
                System.out.println("프로그램 종료합니다.");
                result = true;
            } else {
                sum += Integer.parseInt(num);
                System.out.println("정수의 합: " + sum);
            }
        }
    }
}
