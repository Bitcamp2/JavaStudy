package _0515_basics1.conditional;

import java.util.Scanner;

public class Conditional9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Enter another number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter another number: ");
        int num3 = sc.nextInt();

//        if (num % 2 == 0 && num2 % 2 == 0 && num3 % 2 == 0){
//            System.out.println("모두 짝수입니다.");
//        } if (num % 2 != 0 && num2 % 2 != 0 && num3 % 2 != 0){
//            System.out.println("모두 홀수입니다.");
//        } else {
//
//        }

        if (num % 2 == 0) {
            evenCount++;
        } else {
            oddCount++;
        }

        if (num2 % 2 == 0) {
            evenCount++;
        } else {
            oddCount++;
        }

        if (num3 % 2 == 0) {
            evenCount++;
        } else {
            oddCount++;
        }

        if (evenCount == 3) {
            System.out.println("모두 짝수입니다.");
        } else if (oddCount == 3) {
            System.out.println("모두 홀수입니다.");
        } else {
            System.out.println("짝수: " + evenCount + "개, 홀수: " + oddCount + "개 입니다.");
        }
    }
    
}

