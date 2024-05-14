package _0510_.advance;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Advance1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("문자열을 입력하세요");
        String input =  sc.nextLine();

        Map<Character, Integer> map = new HashMap<>();


        //  문자열에서 각 문자의 등장 횟수를 계산하여 map 에 저장한다.
        // getOrDefault: 찾는 key 가 존재한다면 찾는 key 의 value 를 반환하고
        //               없거나 null 이면 default 값을 반환한다.
        // getOrDefault(Object key, V DefaultValue) 형태.
        for (char c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // 가장 많이 등장하는 문자와 그 개수를 찾는 과정
        char mostChar = '0';
        int maxCount = 0;
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        System.out.println("가장 많이 등장하는 문자: " + mostChar);
        System.out.println("개수: " + maxCount);

        sc.close();

    }
}
