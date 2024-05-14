package _0513_.basic;

public class Basic4 {
    public static <T> void printArr(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
     Integer[] intArr = {1,2,3,4,5,6,7,8,9,10};
     printArr(intArr);
    }


}
