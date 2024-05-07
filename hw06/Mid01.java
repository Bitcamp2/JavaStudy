package hw06;

import java.util.Scanner;

public class Mid01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("문자 입력: ");
        String result = sc.nextLine();

        System.out.println("입력받은 문자열 길이: " + result.length());
        if (result.length() % 2 != 0) {
            System.out.println(result.charAt(result.length() / 2));
        } else if (result.length() % 2 == 0) {
            System.out.println(result.substring(result.length() / 2 - 1, result.length() / 2 + 1));
        }
    }
}
