package hw11.base02.collection;

import java.util.*;

public class SetList {
    public static void main(String[] args) {

        // 6. List에 정수 10개를 저장하되 중복 값을 1개 이상 포함시키고 Set으로 옮겨서 모든 요소를 출력하세요.

        List<Integer> list = new ArrayList<>(10);
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(9) + 1);
        }
        System.out.print("List 출력: ");
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();

        Set<Integer> set = new HashSet<>(list);
        System.out.print("Set 출력: ");
        for (Integer x : set) {
            System.out.print(x + " ");
        }
    }
}
