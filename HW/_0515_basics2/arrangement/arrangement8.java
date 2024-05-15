package _0515_basics2.arrangement;

import java.util.Scanner;

public class arrangement8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("문자열을 입력하세요 (문자열 사이에 -을 넣어주세요):");
        String input = sc.nextLine();

        String[] parts = input.split("-");

        int maxLengthIndex = 0;
        int maxLength = parts[0].length();
        for (int i = 1; i < parts.length; i++) {
            if (parts[i].length() > maxLength) {
                maxLengthIndex = i;
                maxLength = parts[i].length();
            }
        }

        System.out.println("가장 긴 문자열의 인덱스: " + maxLengthIndex);
        System.out.println("가장 긴 문자열: " + parts[maxLengthIndex]);

        sc.close();

    }
}
