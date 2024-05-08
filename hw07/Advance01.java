package hw07;

import java.util.Scanner;

public class Advance01 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        Scanner sc = new Scanner(System.in);
        int index = 0;
        System.out.println("문자열 입력: ");
        sb1.append(sc.nextLine());

        sb2.append(sb1.charAt(0));

        for (int i = 1; i < sb1.length(); i++) {
            if (sb2.charAt(index) != sb1.charAt(i)) {
                sb2.append(sb1.charAt(i));
                index++;
            }
        }

        System.out.println(sb2);
    }
}
