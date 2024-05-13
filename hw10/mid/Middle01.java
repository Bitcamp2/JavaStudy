package hw10.mid;

import java.util.HashMap;
import java.util.Map;

public class Middle01 {
    public static void main(String[] args) {

        //  1. key와 value 모두 Number를 상속받은 클래스만 받고 매개변수로 Map이 주어졌을 때
        //  key, value의 곱이 가장 큰 Entry를 리턴하는 메소드 getMaxMul을 구현하세요.
        Map<Integer, Integer> mulMap = new HashMap<>();
        mulMap.put(1, 2);
        mulMap.put(1, 3);
        mulMap.put(1, 4);
        mulMap.put(1, 5);

        System.out.println(getMaxMul(mulMap));
    }

    public static  <K, V extends Number> Map.Entry<Integer, Integer> getMaxMul(Map<Integer, Integer> map) {

        Map.Entry<Integer, Integer> maxEntry = null;
        int max = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (max < (entry.getKey() * entry.getValue())) {
                max = entry.getKey() * entry.getValue();
                maxEntry = entry;
            }
        }
        return maxEntry;
    }
}
