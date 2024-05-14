package _0513_.middle;

import java.util.*;

public class Middle4 {
    public static List<Map.Entry<Integer, Integer>> getOverHundered(Map<Integer, Integer> map) {

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int product = entry.getKey() * entry.getValue();
            if (product > 1000) {
                list.add(entry);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        Random rand = new Random();
        // 50부터 60까지
        for (int i = 50; i <= 60; i++) {
            // 15부터 25까지의 랜덤 값
            int value = rand.nextInt(11) + 15;
            map.put(i, value);
        }
        List<Map.Entry<Integer, Integer>> list = getOverHundered(map);

        for (Map.Entry<Integer, Integer> entry : list) {
            System.out.println("key: " +  entry.getKey() + ", Value" + entry.getValue()
                               + " = entry: " + entry.getValue() * entry.getKey());
        }
    }
}