package _0515_basics2.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Collection1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, String> map = new HashMap<>();

        System.out.print("단어를 입력하세요: ");
        String word = sc.nextLine();

        if (map.containsKey(word)) {
            System.out.println("'" + word + "'의 뜻은 '" + map.get(word) + "'입니다.");
        } else {
            // 단어가 사전에 없는 경우 사용자에게 뜻 추가 요청
            System.out.println("'" + word + "'는 사전에 없는 단어입니다.");
            System.out.print("뜻을 추가하시겠습니까? (Yes/No): ");
            String addMeaning = sc.nextLine();
            if (addMeaning.equalsIgnoreCase("Yes")) {
                System.out.print("뜻을 입력하세요: ");
                String meaning = sc.nextLine();
                map.put(word, meaning);
                System.out.println("'" + word + "'의 뜻 '" + meaning + "'이(가) 추가되었습니다.");
            }
        }
        sc.close();

    }

}
