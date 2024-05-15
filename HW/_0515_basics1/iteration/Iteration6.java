package _0515_basics1.iteration;

import java.util.Scanner;

public class Iteration6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String: ");
        String s = sc.nextLine();

        System.out.println("입력한 문자열을 역순으로 출력합니다:");
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }


    }
}
