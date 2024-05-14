package _0510_.basic;

import java.util.HashMap;
import java.util.Map;


public class Basic1 {
    public static void main(String[] args) {

        Map<String, Integer> uniMap = new HashMap<>();

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            uniMap.put(String.valueOf(ch), (int)ch);
        }
        for (char ch = 'a'; ch <= 'z'; ch++) {
            uniMap.put(String.valueOf(ch), (int) ch);
        }

        System.out.println(uniMap);
    }
}
