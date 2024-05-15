package _0515_basics1.typeconversion;

import java.util.Scanner;

public class TypeConversion6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two strings: ");
        String input1 = sc.next();
        String input2 = sc.next();

        for (int i = 0; i < input1.length(); i++) {
            char ch = input1.charAt(i);
            System.out.println(ch + "의 유니코드: " + (int) ch);
            for (int j = 0; j < input2.length(); j++) {
                char ch2 = input2.charAt(j);
                System.out.println(ch2 + "의 유니코드: " + (int) ch2);
            }
        }

    }

}
