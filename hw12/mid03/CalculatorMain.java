package hw12.mid03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CalculatorMain {
    public static void main(String[] args) {
        // 3. 매개변수로 받아온 정수 배열에서
        // 최대값, 최소값, 중간값을 구하는 static 메소드 getMax, getMin, getMid를 갖는 클래스 IntArrUtils를 구현하고
        // maxOrMinOrMid라는 메소드를 갖는 함수형 인터페이스 MaxMinMid를 만들고
        // 람다식으로 IntArrUtils의 메소드를 참조하여 구현하세요.

        int[] numArr = new int[]{1, 30, 5, 72, 3};

        IntArrUtils.getMax(numArr, arr -> {
            List<Integer> list = new ArrayList<>();
            for (int i : arr) {
                list.add(i);
            }
            list.sort(Comparator.naturalOrder());

            System.out.println("최대값: " + list.getLast());
        });

        IntArrUtils.getMid(numArr, arr -> {
            List<Integer> list = new ArrayList<>();
            for (int i : arr) {
                list.add(i);
            }
            list.sort(Comparator.naturalOrder());

            System.out.println("중간값: " + list.get(list.size() / 2));
        });

        IntArrUtils.getMin(numArr, arr -> {
            List<Integer> list = new ArrayList<>();
            for (int i : arr) {
                list.add(i);
            }
            list.sort(Comparator.naturalOrder());

            System.out.println("최소값: " + list.getFirst());
        });
    }
}
