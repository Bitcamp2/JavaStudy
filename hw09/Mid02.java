package hw09;


import java.util.*;

public class Mid02 {
    public static void main(String[] args) {

        //  2. 매개변수로 Map<Integer, Integer>이 주어졌을 때
        //  key, value의 곱이 가장 큰 Entry를 리턴하는 메소드 getMaxMul을 구현하세요.

        Map<Integer, Integer> mulMap = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("*** 숫자 입력 ***");
        for (int i = 0; i < 3; i++) {
            System.out.println("첫 번째 숫자 입력: ");
            int a = sc.nextInt();
            System.out.println("두 번째 숫자 입력: ");
            int b = sc.nextInt();
            mulMap.put(a, b);
        }

        Map.Entry<Integer, Integer> getMulEntry = getMaxMul(mulMap);
        System.out.println("가장 큰 곱을 갖는 Entry: Key = " + getMulEntry.getKey() + ", Value = " + getMulEntry.getValue());
    }

    private static Map.Entry<Integer, Integer> getMaxMul(Map<Integer, Integer> dulMap) {
        //  원하는 값을 얻고 반환하기 위한 maxEntry 초기화
        Map.Entry<Integer, Integer> maxEntry = null;

        Set<Map.Entry<Integer, Integer>> entrySet = dulMap.entrySet();
        Iterator<Map.Entry<Integer, Integer>> iterator = entrySet.iterator();

        //  int 데이터 타입이 가질 수 있는 최솟값
        //  이렇게 초기화를 하면, 반복문에 첫번째 Entry 곱을 최대값으로 설정할 수 있다
        int max = Integer.MIN_VALUE;

        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            int entryMul = entry.getKey() * entry.getValue();

            if (max < entryMul) {
                max = entryMul;
                maxEntry = entry;
            }
        }
        return maxEntry;
    }
}