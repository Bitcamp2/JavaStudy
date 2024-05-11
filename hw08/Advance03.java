package hw08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Advance03 {
    public static void main(String[] args) {

        // sort 사용하면 쉽게할 수있음
        List<Integer> num = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("정수 5개 입력: ");
        for (int i = 0; i < 5; i++) {
            num.add(i, sc.nextInt());
        }

        int max = num.get(0) + num.get(1);

        int maxNum1 = num.get(0);
        int maxNum2 = num.get(1);

        for (int i = 0; i < num.size() - 1; i++) {
            if (max < num.get(i) + num.get(i + 1)) {
                max = num.get(i) + num.get(i + 1);
                maxNum1 = num.get(i);
                maxNum2 = num.get(i + 1);
            }
        }

        System.out.println("가장큰 두수: " + maxNum1 + ", " + maxNum2);
    }
}
