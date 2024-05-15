package _0515_basics1.iteration;

public class Iteration8_2 {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 0; i < n; i++) { // 행 반복
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println(); // 다음 행으로 이동
        }

    }
}
