package hw08;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Advance03 {
    public static void main(String[] args) {

        //  3. 사용자가 입력한 5개의 정수를 저장하는 List<Integer>를 생성하고
        //  연속된 두 수의 합이 가장 커지는 구간의 두 수를 출력하세요.
        //  ex) [1, 2, 3, 4, 5] => 4, 5 출력

        List<Integer> numList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("정수 5개 입력: ");
        for (int i = 0; i < 5; i++) {
            numList.add(sc.nextInt());
        }

        numList.sort(Comparator.naturalOrder());

        System.out.println(numList);
        System.out.println(numList.get(numList.size() - 2) + ", " + numList.get(numList.size() - 1));
    }
}
