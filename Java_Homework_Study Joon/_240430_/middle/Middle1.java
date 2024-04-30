package _240430_.middle;

public class Middle1 {
    // 1. int 배열 한 개를 매개변수로 받아서 역순으로 저장된 새로운 배열을 리턴하는 메소드를 구현하세요.
    // 실행클래스의 메인메소드 아래에 static 메소드로 선언하세요. static의 위치는 접근제어자와 리턴타입 사이입니다.
    // (예시 public static void add(int a, int b) { return a + b; })

    public static int[] reverseArray(int[] arr) {
    int[] result = new int[arr.length];

    for (int i = arr.length; i > 0; i--) {

        result[arr.length - i] = arr[i - 1];
    }

    return result;
    }
}
