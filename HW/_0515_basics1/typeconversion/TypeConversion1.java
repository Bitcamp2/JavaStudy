package _0515_basics1.typeconversion;

import java.util.Scanner;

public class TypeConversion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요");
        String str1 = sc.nextLine();
        System.out.println("두번째 정수를 입력하세요");
        String str2 = sc.nextLine();

        int firstNum = Integer.parseInt(str1);
        int secondNum = Integer.parseInt(str2);

        int result = firstNum + secondNum;

        System.out.println("합: " + result);

    }
}
