package _0515_basics2.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collection5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        System.out.println("리스트에 문자열을 입력하세요. 입력을 마치려면 빈 문자열을 입력하세요.");

        while (true) {
            System.out.print("문자열 입력: ");
            String input = sc.nextLine();

            if (input.isEmpty()) {
                break; // 빈 문자열 입력 시 입력 종료
            }

            list.add(input);
        }

        System.out.print("검색할 문자열을 입력하세요: ");
        String search = sc.nextLine();

        // 문자열 검색 및 인덱스 출력
        int index = list.indexOf(search);
        if (index != -1) {
            System.out.println("문자열 '" + search + "'의 인덱스는 " + index + "입니다.");
        } else {
            System.out.println("문자열 '" + search + "'는 리스트에 없습니다.");
        }

        sc.close();
    }
}
