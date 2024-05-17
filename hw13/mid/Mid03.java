package hw13.mid;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mid03 {
    public static void main(String[] args) {

        //3. 사용자가 입력한 영문자 10개를 저장하는 List<Character> charList를 만들고
        // 스트림을 이용해서 영문자가 소문자면 대문자로 대문자면 소문자로 바꾼 스트림을 만들어서 출력하세요.

        Scanner sc = new Scanner(System.in);

        List<Character> charList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            charList.add(sc.next().charAt(0));
        }

        charList.stream()
                .map(ch -> {
                    int i = 0;
                    if (ch >= 65 && ch <= 90) {
                         i = ch + 32;
                    } else if (ch >= 97 && ch <= 122) {
                        i = ch - 32;
                    }
                    return (char) i;
                })
                .forEach(ch -> System.out.print(ch + " "));
    }
}
