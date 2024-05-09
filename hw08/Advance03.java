package hw08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Advance03 {
    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int maxNum1 = 0;
        int maxNum2 = 0;

        System.out.println("정수 5개 입력: ");
        for (int i = 0; i < 5; i++) {
            num.add(i, sc.nextInt());
        }
        int max = num.get(0) + num.get(1);
        for (int i = 1; i < 4; i++) {
            if (max < num.get(i) + num.get(i + 1)) {
                maxNum1 = num.get(i);
                maxNum2 = num.get(i + 1);
            }
        }

        System.out.println("가장큰 두수: " + maxNum1 + ", " + maxNum2);
    }
}
