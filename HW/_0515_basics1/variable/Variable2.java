package _0515_basics1.variable;

import java.util.Scanner;

public class Variable2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println("Enter second integer: ");
        int num2 = sc.nextInt();

        System.out.println("Enter one of +,-,%,/ : ");
        char op = sc.next().charAt(0);

        int result = 0;

        switch (op) {
            case '+' : System.out.println(result = num + num2); break;
            case '-' : System.out.println(result = num - num2); break;
            case '*' : System.out.println(result = num * num2); break;
            case '/' :
                if (num2 != 0){
                    System.out.println(result = num / num2);
                } else {
                    System.out.println("0으로 어떻게 나누냐 임마");
                break;
            }
        }
    }
}
