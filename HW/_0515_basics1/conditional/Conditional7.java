package _0515_basics1.conditional;

import java.util.Scanner;

public class Conditional7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inpuStr = sc.nextLine();

        if(inpuStr.equals("Yes")) {
            System.out.println("예");
        } else if (inpuStr.equals("No")){
            System.out.println("아니오");
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
    }
}
