package _0513_.middle;

public class Middle2 <T extends Number> {

    private T[] array;

    public Middle2(T[] array) {
        this.array = array;
    }

    public double add() {
        double result = 0;
        for (T element : array) {
            result += element.doubleValue();
        }
        return Math.round(result * 100.0) / 100.0;
    }

    public double sub() {
        double result = array[0].doubleValue();
        for (int i = 1; i < array.length; i++) {
            result -= array[i].doubleValue();
        }
        return Math.round(result * 100.0) / 100.0;
    }

    public double mul() {
        double result = 1;
        for (T element : array) {
            result *= element.doubleValue();
        }
        return Math.round(result * 100.0) / 100.0;
    }

    public double div() {
        double result = array[0].doubleValue();
        for (int i = 1; i < array.length; i++) {
            if(array[i].doubleValue() == array[i-1].doubleValue()){
                result /= array[i].doubleValue();
            }
        }
        return Math.round(result * 100.0) / 100.0;
    }
}
