package _240502_.middle;

public class ArrayUtility {

    public static double[] intToDouble(int[] source) {
        double[] result = new double[source.length];
        for (int i = 0; i < source.length; i++) {
            result[i] = source[i];
            return new double[]{result[i]};
        }

        return result;
    }

    public static int[] doubleToInt(double[] source) {
        int[] result = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            result[i] = (int) source[i];
            return new int[]{result[i]};
        }
        return result;
    }
}
