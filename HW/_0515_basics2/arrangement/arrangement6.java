package _0515_basics2.arrangement;

import java.util.Scanner;

public class arrangement6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strArr = new String[5];

        System.out.println("문자열 5개를 입력하세요:");
        for (int i = 0; i < 5; i++) {
            strArr[i] = sc.nextLine();
        }

        String maxLengthString = strArr[0];
        String minLengthString = strArr[0];
        for (int i = 1; i < 5; i++) {
            if (strArr[i].length() > maxLengthString.length()) {
                maxLengthString = strArr[i];
            }
            if (strArr[i].length() < minLengthString.length()) {
                minLengthString = strArr[i];
            }
        }

        System.out.println("가장 긴 문자열: " + maxLengthString);
        System.out.println("가장 짧은 문자열: " + minLengthString);

        sc.close();

    }
}
