package hw07;

import java.util.Scanner;

public class Advance02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("문자열 입력: ");
        StringBuilder sb = new StringBuilder(sc.nextLine());

        System.out.println("입력한 문자열: " + sb);

        for (int i = 1; i < sb.length(); i++) {
            if (sb.charAt(i - 1) == sb.charAt(i)) {
                sb.delete(i, i + 1);
                i--;
            }
        }

        System.out.println("결과: " + sb);
    }
}
