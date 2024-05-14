package _0513_.basic;

public class Basic5 {
    public static <T extends Number> T getMin(T[] array) {
        if(array == null || array.length == 0) {
            return null;
        }
        T min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i].doubleValue() < min.doubleValue()){
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Integer[] intArr = {1,2,3,4,5};

        Integer minInt = getMin(intArr);

        System.out.println(minInt);
    }

}
