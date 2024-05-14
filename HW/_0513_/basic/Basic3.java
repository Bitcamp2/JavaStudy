package _0513_.basic;

import java.util.List;

public class Basic3 {
    public static Integer sum(List<?> list) {
        Integer sum = 0;
        for (Object object : list) {
            if (object instanceof Integer) {
                sum += (Integer) object;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3);

        System.out.println(sum(integerList));
    }
}
