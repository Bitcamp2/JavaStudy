package _0517_.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Basic3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> strList = new ArrayList<>();

        System.out.println("10개의 문자열을 입력하세요:");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "번째 문자열: ");
            String input = sc.nextLine();
            strList.add(input);
        }

        System.out.println("영문자가 포함된 문자열:");

        // Pattern.compile: 정규 표현식을 컴파일하여 패턴 객체를 생성
        // [a-zA-Z]: 영문자 중 어느 하나라도 일치하는 문자
        Pattern pattern = Pattern.compile("[a-zA-Z]");

        strList.stream()
                // pattern.matcher(str).find(): 주어진 문자열 str이 패턴과 일치하는지 검사하고,
                //                              일치하는 부분이 있는 경우 true를 반환
                .filter(str -> pattern.matcher(str).find())
                .forEach(str -> System.out.println(str));

    }
}
