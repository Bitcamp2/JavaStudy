package _0510_.middle;

import java.util.*;

public class Middle3 {
    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 3);
        map.put(2, 4);
        map.put(3, 5);

        List<Integer> keys = new ArrayList<>(map.keySet());

        // 키 리스트를 sort로 정렬
        Collections.sort(keys);

        for (Integer key : keys) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}

//    private static void printVal(Map<Integer, Integer> map) {
//
//        List<Integer> keys = new ArrayList<>(map.keySet());
//
//        // 키 리스트를 sort로 정렬
//        Collections.sort(keys);
//
        // 키 리스트를 값에 따라 역순으로 정렬한다.
        // (a, b ) -> Integer.compare(map.get(b), map.get(a)) 는 람다 표현식.
        // 하나의 식으로 표현하여 훨씬 간략하게 표현이 가능하게 되며, 메서드의 이름과 반환값이 없어지므로 "익명함수"라고도 한다.
        // 두 개의 정수 값을 입력으로 받아서 map.get 을 이용하여 해당 값의 키에 맞는 값을 비교한다.
        // Integer.compare 은 두 정수 값을 비교하여 결과를 반환. -> 이를 통해 값에 따라 역순으로 키를 정렬.
//        Collections.sort(keys, (a, b) -> Integer.compare(map.get(b), map.get(a)));
//
//        Collections.reverse(keys);
//
//        for(int i = keys.size() - 1; i >= 0; i--) {
//            Integer key = keys.get(i);
//            System.out.println(key + " : " + map.get(key));
//        }
//
//    }
//}
