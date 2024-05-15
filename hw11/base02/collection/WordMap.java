package hw11.base02.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordMap {
    public static void main(String[] args) {

        // 1. Map을 이용하여 영어 단어와 뜻을 저장하고 사용자가 입력한 단어의 뜻을 출력하세요.
        Map<String, String> wordMap = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("단어입력: ");
        String word = sc.next();
        System.out.print("뜻 입력: ");
        String mean = sc.next();
        wordMap.put(word, mean);

        System.out.println("입력한 단어: " + word + ", 뜻: " + wordMap.get(word));
    }
}
