package _240429_.basic;

public class basic6 {
    public static void main(String[] args) {

        int num = 1;
        int sum = 0;

        while (num <= 100) {
            sum += num++;
        }
        System.out.println(sum);

    }
}
