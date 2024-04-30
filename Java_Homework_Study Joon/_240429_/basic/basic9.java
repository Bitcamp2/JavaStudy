package _240429_.basic;

public class basic9 {
    public static void main(String[] args) {

    int[] intArray = new int[10];

    for(int i = intArray.length - 1; i >= 0; i--) {
        intArray[i] = (i+1) * 3;
        System.out.println(intArray[i]);
    }

    }
}
