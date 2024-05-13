package hw08;

import java.util.*;

public class Advance04 {
    public static void main(String[] args) {

        //  4. 사용자가 입력한 6개의 정수를 저장하는 List<Integer>를 생성하고
        //  두 수의 합이 유일한 값이 되는 개수를 출력하세요.(중복 숫자 사용불가)
        //  ex) [1, 2, 3, 4, 5, 6] => 총 4개(3, 4, 10, 11)

        Map<String, Integer> numMap = new HashMap<>();

        List<Integer> numList = new ArrayList<>();
        List<Integer> sumList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("정수 6개 입력: ");
        for (int i = 0; i < 6; i++) {
            numList.add(sc.nextInt());
        }

        for (int i = 0; i < numList.size(); i++) {
            for (int j = i + 1; j < numList.size(); j++) {
                sumList.add(numList.get(i) + numList.get(j));
            }
        }
        System.out.println(sumList);

        for (int i = 0; i < sumList.size(); i++) {
            int cnt = 1;

            for (int j = 0; j < sumList.size(); j++) {
                if (i != j) {
                    if (sumList.get(i) == sumList.get(j)) {
                        cnt++;

                    }
                }
                numMap.put(String.valueOf(sumList.get(i)), cnt);
            }
        }
        System.out.println(numMap);

        Set<Map.Entry<String, Integer>> entrySet = numMap.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();

        int entryCnt = 0;
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();

            if (entry.getValue() == 1) {
                entryCnt++;
            }
        }
        System.out.println("두수의 합이 유일한 값이 되는 개수: " + entryCnt);
    }
}
