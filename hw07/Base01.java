package hw07;

import java.util.Scanner;

public class Base01 {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();

        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < 3; i++) {
            System.out.println("문자열을 입력하세요: ");
            sb.append(sc.nextLine());
        }

        System.out.println(sb);
    }
}
