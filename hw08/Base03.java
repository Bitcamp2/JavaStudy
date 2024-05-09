package hw08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Base03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> intList = new ArrayList<>();

        System.out.println("정수 입력(5개): ");
        for (int i = 0; i <5; i++) {
            intList.add(i, sc.nextInt());
        }

        for (Integer list : intList) {
            System.out.print(list + " ");
        }
    }
}
