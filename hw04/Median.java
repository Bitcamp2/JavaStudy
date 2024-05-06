package hw04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Median {

    static void med3(int a, int b, int c) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(0, a);
        list.add(1, b);
        list.add(2, c);
        list.sort(Comparator.naturalOrder());

        System.out.println("중앙값은 " + (list.get(list.size() / 2) + " 입니다."));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("세 정수의 중앙값을 구합니다.");
        System.out.println("a의값: ");
        int a = sc.nextInt();
        System.out.println("b의값: ");
        int b = sc.nextInt();
        System.out.println("c의값: ");
        int c = sc.nextInt();

        med3(a, b, c);
    }
}
