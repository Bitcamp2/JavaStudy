package _0517_.middle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Middle3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Character> charList = new ArrayList<>();

        System.out.println("10개의 영문자를 입력하세요:");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "번째 영문자: ");
            char input = sc.next().charAt(0);
            charList.add(input);
        }

        List<Character> changedCaseList = charList.stream()
                                                  .map(c -> {
                                                     if (Character.isLowerCase(c)) {
                                                         return Character.toUpperCase(c);
                                                     } else if (Character.isUpperCase(c)) {
                                                         return Character.toLowerCase(c);
                                                     } else {
                                                         return c;
                                                     }
                                                  })
                                                  .collect(Collectors.toList());

        System.out.println("변경된 문자들:" + changedCaseList);

    }
}
