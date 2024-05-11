package hw08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Advance04 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int cnt = 0;

        System.out.println("정수 입력(6개): ");
        for (int i = 0; i < 6; i++) {
            list1.add(i, sc.nextInt());
        }

        for (int i = 0; i < 6; i++) {
            list2.add(i, (list1.get(i) + list1.get(i+1)));
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i - 1; j++) {
                if (list2.get(i) != list2.get(j + 1)) {
                    list.add(i,)
                }
            }
        }


    }
}
