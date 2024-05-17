package hw13.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class basic03 {
    public static void main(String[] args) {

        // 3. 사용자가 입력한 문자열 10개를 저장하는 List<String> strList를 만들고
        // 스트림을 이용해서 문자열에 영문자가 포함된 문자열만 뽑아서 스트림을 만들고 출력하세요.

        Scanner sc = new Scanner(System.in);

        List<String> strList = new ArrayList<>();

        System.out.println("문자열 입력(10개) 입력: ");
        for (int i = 0; i < 10; i++) {
            strList.add(sc.nextLine());
        }

        strList.stream()
                .filter(str -> str.contains(alpha()))
                .forEach(str -> System.out.println(str));
    }

    public static char alpha() {
        for (int i = 65; i <= 90; i++) {
            return (char) i;
        }
        
        return 0;
    }
}
