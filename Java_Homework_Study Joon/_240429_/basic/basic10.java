package _240429_.basic;

public class basic10 {
    public static void main(String[] args) {

    int[] intArray = new int[10];
    int sum = 0;

    for (int i = 1; i < intArray.length; i++) {
        intArray[i] = i;
        sum += intArray[i];
        System.out.println(intArray[i]);
    }
        System.out.println("합은: " + sum);

    }
}
