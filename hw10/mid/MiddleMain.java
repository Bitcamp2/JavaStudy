package hw10.mid;

import java.util.*;

public class MiddleMain {
    public static void main(String[] args) {

        //  3. 커피 메뉴를 갖는 enum을 생성하고 AMERICANO, LATTE, MOCHA, COLDBREW 4개로 지정한다.
        //  가격이 값이 되고 순서대로 2000, 3000, 4000, 4500으로 지정한다.
        //  메뉴의 총 가격을 계산하는 추상 메소드를 정의하고 각각의 상수에서 구현하는데
        //  아메리카노(아이스 300 추가), 라떼(아이스 500 추가), 모카(휘핑 1000 추가), 콜드브루(시럽 200 추가)
        //  모든 메뉴 옵션 없는 주문은 지정한 가격대로 진행된다. totalPrice(int optionOrder, int normalOrder) 옵션 추가 잔수와
        //  일반 메뉴 잔수를 받아서 각 메뉴의 가격을 계산하는 추상 메소드 구현한다.
        //  아아 2잔 뜨아 1잔 아라 1잔 휘핑 모카 2잔 콜드브루 2잔일 때의 가격을 출력하세요
        System.out.println("커피 총 가격: " + (CoffeeMenu.AMERICANO.totalPrice(2, 1)
                + CoffeeMenu.LATTE.totalPrice(1, 0)
                + CoffeeMenu.MOCHA.totalPrice(2, 0)
                + CoffeeMenu.COLDBREW.totalPrice(0, 2)));



        // 4. Map<Integer, Integer>을 매개변수로 받아서
        // List<Entry<K, V>>를 리턴하는 메소드 getOverHundr를 구현하세요.
        // 매개변수 Map에는 key는 50~60까지 value는 15~25까지 넣어주고
        // 키와 밸류의 곱셈의 결과가 1000을 넘는 Entry만 List에 저장합니다.
        Map<Integer, Integer> numMap = new HashMap<>();

        int key = 50;
        int value = 15;

        for (int i = 0; i <= 10; i++) {
            numMap.put(key + i, value + i);
        }

        System.out.println(getOverHundr(numMap));

        for (Map.Entry<Integer,Integer> entry : getOverHundr(numMap)) {
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
        }

    }

    public static <K, V> List<Map.Entry<K, V>> getOverHundr(Map<K, V> map) {
        List<Map.Entry<K, V>> entryList = new ArrayList<>();

        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (((int) entry.getKey() * (int) entry.getValue()) > 1000) {
                entryList.add(entry);
            }
        }
        return entryList;
    }
}
