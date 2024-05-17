package hw12.mid03;

public class IntArrUtils {

    public static void getMax(int[] arr, MaxMinMid maxMinMid) {
        int max = maxMinMid.maxOrMinOrMid(arr);

        System.out.println("최대값: " + max);
    }

    public static void getMid(int[] arr, MaxMinMid maxMinMid) {
        int mid = maxMinMid.maxOrMinOrMid(arr);

        System.out.println("중간값: " + mid);
    }

    public static void getMin(int[] arr, MaxMinMid maxMinMid) {
        int min = maxMinMid.maxOrMinOrMid(arr);

        System.out.println("최소값: " + min);
    }
}
