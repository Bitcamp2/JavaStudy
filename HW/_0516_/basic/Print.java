package _0516_.basic;

import java.util.Arrays;

public class Print {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8};

        PrintNumber printEvenNum = (int[] numArr) -> {
            Arrays.stream(numArr)
                    .filter(n -> n % 2 == 0)
                    .forEach(System.out::println);
        };

        printEvenNum.printEvenNum(numbers);
    }
}
