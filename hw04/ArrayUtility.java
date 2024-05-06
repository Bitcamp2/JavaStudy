package hw04;

public class ArrayUtility {

    static double[] intToDouble(int[] source) {
        double[] chInt = new double[source.length];

        for (int i = 0; i < source.length; i++) {
            chInt[i] = source[i];
        }

        return chInt;
    }

    static int[] doubleToInt(double[] source) {
        int[] chDouble = new int[source.length];

        for (int i = 0; i < source.length; i++) {
            chDouble[i] = (int) source[i];
        }

        return chDouble;
    }
}
