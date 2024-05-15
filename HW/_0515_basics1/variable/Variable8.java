package _0515_basics1.variable;

import java.util.Scanner;

public class Variable8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int primeCount = 0;

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++){
            int num = sc.nextInt();
            if (num < 2 || num > 30){
                System.out.println("Invalid number");
                i--;
            } else {
                numbers[i] = num;
            }
        }

        for (int num : numbers) {
            if (isPrime(num)){
                primeCount++;
            }
        }
        System.out.println("Prime count: " + primeCount);
    }

    public static boolean isPrime(int num) {
        if (num < 2 || num > 30) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
