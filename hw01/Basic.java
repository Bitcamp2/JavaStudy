package hw01;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {

        //1.
        int num = 10;

        System.out.println(++num);
        System.out.println(++num);
        System.out.println(num--);
        System.out.println(--num);
        System.out.println(num--);
        System.out.println(--num);

        //2.
        int a = 10, b = 20;
        System.out.println(a < b);
        System.out.println(a > b);

        //3.
        num = 10;

        while (num > 0) {
            System.out.println(num--);
        }

        //4.
        num = 10;

        do {
            System.out.println(num--);
        } while (num > 0);

        //5.
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        //6.
        int sum = 0;
        num = 1;

        while (num <= 100) {
            sum += num++;
        }
        System.out.println("1 ~ 100까지 합: " + sum);

        //7.
        sum = 0;
        num = 1;

        do {
            sum += num++;
        } while (num <= 100);
        System.out.println("1 ~ 100까지 합: " + sum);

        //8.
        sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1 ~ 100까지 합: " + sum);

        //9.
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 3 * (i + 1);
        }

        for (int i = arr.length-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

        //10.
        Scanner sc = new Scanner(System.in);
        sum = 0;

        System.out.println("값을 입력하세요: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("합: " + sum);

        //11.
        System.out.println("값을 입력하세요: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }

        //12.
        System.out.println("값을 입력하세요: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("2의배수: " + arr[i]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                System.out.println("3의배수: " + arr[i]);
            }
        }

    }
}
