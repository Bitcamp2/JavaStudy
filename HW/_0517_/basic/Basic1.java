package _0517_.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Basic1 {
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            intList.add((int) (Math.random() * 10 + 1));
        }
        List<Integer> resultList = intList.stream()
                                          .map(n -> n * 3)
                                          .collect(Collectors.toList());
        System.out.println(resultList);


    }

}
