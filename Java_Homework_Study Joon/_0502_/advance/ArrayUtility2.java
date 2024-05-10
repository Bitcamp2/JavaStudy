package _240502_.advance;

public class ArrayUtility2 {
    public static int[] concat(int[] s1, int[] s2) {
        int[] result = new int[s1.length + s2.length];
        System.arraycopy(s1, 0, result, 0, s1.length);
        System.arraycopy(s2, 0, result, result.length, s2.length);
        return result;
    }
    static int[] remove(int[] s1, int[] s2) {
        int[] result = new int[s1.length - s2.length];
        System.arraycopy(s1, 0, result, 0, s1.length - s2.length);
        System.arraycopy(s2, 0, result, result.length, s2.length);
        return result;
    }
}
