package hw07;

import java.util.Scanner;

public class Advance02 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        Scanner sc = new Scanner(System.in);

        System.out.println("문자열 입력: ");
        sb1.append(sc.nextLine());

        for (int i = 1; i < sb1.length(); i++) {
            if (sb1.charAt(i - 1) == sb1.charAt(i)) {
                sb1.delete(i, i + 1);
                i--;
            }

        }
        //delete(인덱스, 값)
        System.out.println(sb1);
    }
}
