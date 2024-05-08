package hw07;

import java.util.Scanner;

public class Mid02 {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();

        Scanner sc = new Scanner(System.in);

        System.out.println("정수 입력: ");
        int num = sc.nextInt();

        sb.append("유용한 클래스는 많다. 다양한 라이브러리를 활용한다.");
        System.out.println("문자열: " + sb);
        sb.reverse();
        System.out.println("문자열 역순: " + sb);

        System.out.println("정수인덱스 번째 문자열 값: " + sb.charAt(num));

    }
}
