package _0515_basics1.iteration;

public class Iteration2 {
    public static void main(String[] args) {

        int sum = 1;

        for (int i = 1; i <= 10; i++) {
            sum *= 2;
        }
        System.out.println("2를 10번! : " + sum);
    }
}
