package hw12.mid01;

import java.util.Scanner;

public class StringBuilderMain01 {
    public static void main(String[] args) {
        //  1. 두 개의 StringBuilder 값을 매개변수로 받아 두 개의 값을 합친 후
        //  역순으로 바꿔서 리턴하는 combineStrBuilder를 람다식으로 구현하세요
        //  StringBuilderUtils 함수형 인터페이스 선언
        //  StringBuilder combineStrBuilder(StringBuilder sb1, StringBuilder sb2) 추상메소드 선언

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력: ");
        StringBuilder sb1 = new StringBuilder(sc.nextLine());
        System.out.print("문자열 입력: ");
        StringBuilder sb2 = new StringBuilder(sc.nextLine());

        System.out.println(combineStrBuilder(sb1, sb2, StringBuilder::append));

    }

    public static StringBuilder combineStrBuilder(StringBuilder sb1, StringBuilder sb2, StringBuilderUtils stringBuilderUtils) {
        return stringBuilderUtils.combineStrBuilder(sb1, sb2).reverse();
    }
}
