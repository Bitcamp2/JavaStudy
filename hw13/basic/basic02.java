package hw13.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class basic02 {
    public static void main(String[] args) {

        // 2. 사용자가 입력한 문자열 10개를 저장한 문자열 리스트를 이용하여 문자열의 길이가 5이상인 문자열만 출력하세요.

        Scanner sc = new Scanner(System.in);

        List<String> strList = new ArrayList<>();

        System.out.println("문자열 입력(10개) 입력: ");
        for (int i = 0; i < 10; i++) {
            strList.add(sc.nextLine());
        }

        System.out.println("길이가 5이상인 문자열");
        strList.stream()
                .filter(str -> str.length() >= 5)
                .forEach(str -> System.out.println(str));
    }
}
