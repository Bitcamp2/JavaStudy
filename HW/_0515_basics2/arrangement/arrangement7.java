package _0515_basics2.arrangement;

import java.util.Random;

public class arrangement7 {
    public static void main(String[] args) {

        int[] intArr =  new int[4];
        int[] intArr2 =  new int[3];

        Random rand = new Random();
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = rand.nextInt(100) + 1;
        }

        for (int i = 0; i < intArr2.length; i++) {
            intArr2[i] = rand.nextInt(100) + 1;
        }

        int totalLength = intArr.length + intArr2.length;
        int[] combinedArr = new int[totalLength];

        System.arraycopy(intArr, 0, combinedArr, 0, intArr.length);
        System.arraycopy(intArr2, 0, combinedArr, intArr2.length, intArr2.length);

        System.out.println("첫 번째 배열:");
        printArray(intArr);
        System.out.println("두 번째 배열:");
        printArray(intArr2);
        System.out.println("두 배열을 합친 배열:");
        printArray(combinedArr);

    }
    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
