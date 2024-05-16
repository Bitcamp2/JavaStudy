package _0516_.middle;

import java.util.Arrays;

public class IntArrUtils {

    public static int getMax(int[] arr) {

        // getMax 메소드는 배열을 스트림으로 변환한 후
        // max() 메소드를 사용하여 최댓값을 찾는다.
        return Arrays.stream(arr).max()
                // orElseThrow() 메소드를 사용하여 최댓값이 존재하지 않는 경우에는 IllegalArgumentException 을 던진다.
                .orElseThrow(() -> new IllegalArgumentException("빈 배열입니다."));
    }
    public static int getMin(int[] arr) {

        // getMin 메소드는 배열을 스트림으로 변환한 후
        // min() 메소드를 사용하여 최솟값을 찾는다.
        return Arrays.stream(arr).min()
                //orElseThrow() 메소드를 사용하여 최솟값이 존재하지 않는 경우에는 IllegalArgumentException 을 던진다.
                .orElseThrow(() -> new IllegalArgumentException("빈 배열입니다."));
    }

    public static int getMid(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("빈 배열입니다.");
        }

        // 원본 배열 복사: Arrays.copyOf(arr, arr.length)는 원본 배열 arr의 복사본을 만들어준다.
        // 이렇게 하면 원본 배열이 변경되지 않고 그대로 유지된다.
        int[] sortedArr = Arrays.copyOf(arr, arr.length);

        // 복사된 배열 정렬: Arrays.sort(sortedArr)는 복사된 배열 sortedArr를 오름차순으로 정렬한다.
        Arrays.sort(sortedArr);

        return sortedArr[sortedArr.length / 2];

    }

}
