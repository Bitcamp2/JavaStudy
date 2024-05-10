package _240429_.basic;

public class basic11 {
    public static void main(String[] args) {
        // int 배열로 10개의 공간을 생성하세요.
        //  1 ~ 10까지의 임의의 수를 저장하고
        //  홀수만 골라서 출력하세요.

        int[] intArray = new int[10];

        for (int i = 0; i < intArray.length; i++) {
            if (i % 2 >= 1) {
                intArray[i] = i;
                System.out.println(intArray[i]);
            }
        }
    }
}
