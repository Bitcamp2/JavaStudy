package _0515_basics1.variable;

import java.util.Scanner;

public class Variable6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number(2~9): ");

        int num = sc.nextInt();

        if(num <2 || num > 9){
            System.out.println("Invalid number");
        } else {
            System.out.println(num + "단 :");
            for(int i = 1; i <= 9; i++){
                System.out.println(num + "*" + i + "=" + (num*i));
            }
        }
        sc.close();
    }
}
