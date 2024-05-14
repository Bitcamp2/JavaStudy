package _0510_.middle;

import java.util.Map;

public class Middle2 {

    public static Map<Integer, Integer> getMaxDouble(Map<Integer, Integer> map){
        if (map == null || map.isEmpty()) {
            return null;
        }

        Map.Entry<Integer, Integer> maxEntry = null;
        int maxNum = Integer.MIN_VALUE;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int num = entry.getKey() * entry.getValue();


            // 현재까지의 최대 곱과 비교하여 더 큰 값을 발견했을 때,
            // 최대 곱과 그에 해당하는 Entry를 업데이트하는 부분.
            // 1. 현재 반복 중인 Entry의 key와 value를 곱한결과.
            // 2. num이 maxNum보다 크다면, 새로운 최대 곱을 발견한 것이므로 다음 단계 실행.
            // 3. maxNum이 num과 같아지면 새로운 곱셈을 maxNum 변수에 할당한다.
            // 4. 해당 entry를 maxEntry 변수에 할당하여 현재까지의 최대 곱에 해당하는 Entry를 업데이트한다.
            if(num > maxNum) {
                maxNum = num;
                maxEntry = entry;
            }
        }

        return (Map<Integer, Integer>) maxEntry;

    }
}
