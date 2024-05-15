package _0515_basics1.iteration;

import java.util.Scanner;

public class Iteration9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter number: ");
        while(true){
            String input = sc.nextLine();
            if(input.equals("q")){
                break;
            }
            try{
                int num = Integer.parseInt(input);
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("Not a number");
            }
        }
        System.out.println("입력한 정수의 합: " + sum);

    }
}
