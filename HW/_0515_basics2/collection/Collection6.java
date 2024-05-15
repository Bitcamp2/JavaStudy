package _0515_basics2.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collection6 {
    public static void main(String[] args) {

        // 리스트 생성 및 초기 데이터 추가
        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);
        numbersList.add(5);
        numbersList.add(5); // 중복 값
        numbersList.add(6);
        numbersList.add(7);
        numbersList.add(7);
        numbersList.add(8);
        numbersList.add(9);

        // 중복 제거를 위해 Set에 데이터 복사
        Set<Integer> numbersSet = new HashSet<>(numbersList);

        // Set의 모든 요소 출력
        System.out.println("Set에 있는 모든 요소:");
        for (int num : numbersSet) {
            System.out.println(num);
        }

    }
}
