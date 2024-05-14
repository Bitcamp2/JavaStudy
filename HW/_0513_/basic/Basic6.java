package _0513_.basic;

import java.util.HashMap;
import java.util.Map;

public class Basic6 {
    public static void printOverTen(Map<?, ?> map) {
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            String valueString = String.valueOf(entry.getValue());
            if (valueString.length() >= 10){
                System.out.println("Key: " + entry.getKey());
            }
        }
    }
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "abcdesadjsajdsajdsa");
        map.put(2, "bcde");
        map.put(3, "cdea");
        map.put(4, "dedsak");
        map.put(5, "esandjsbds");

        printOverTen(map);
    }
}
