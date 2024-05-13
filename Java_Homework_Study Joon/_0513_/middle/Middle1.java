package _0513_.middle;

import java.util.Map;

public class Middle1 {
    public static <K extends Number, V extends Number> Map.Entry<K, V> getMaxMul(Map<K, V> map) {
        Map.Entry<K, V> maxEntry = null;

        //양수인 곱셈의 최소값을 나타내기 위해서 maxProduct를 Integer.MIN_VALUE로 초기화하는 한다.
        int maxProduct = Integer.MIN_VALUE;

        // 맵의 모든 엔트리를 반복하면서 각 엔트리의 K와 V가 Number 클래스의 인스턴스인지 확인한다.
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getKey() instanceof Number && entry.getValue() instanceof Number) {
                //만약 엔트리의 키와 값이 Number 클래스의 인스턴스라면 해당 키와 값의 곱을 계산하고,

                // 이 값이 현재까지의 최대 곱보다 큰지 확인한다.
                int product = (entry.getKey()).intValue() * (entry.getValue()).intValue();
                if (product > maxProduct) {
                    maxProduct = product;
                    maxEntry = entry;
                }
            }
        }

        return maxEntry;
    }
}
