package _0515_basics1.conditional;

import java.util.Scanner;

public class Conditional3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String s = sc.nextLine();

//        if (s.equals("Java")) {
//            System.out.println("좋아하는 언어입니다.");
//        } else if (s.equals("Python")) {
//            System.out.println("공부중인 언어입니다.");
//        } else {
//            System.out.println("다른 언어를 공부해보세요");
//        }
        switch (s) {
            case "Java": System.out.println("좋아하는 언어입니다."); break;
            case "Python": System.out.println("공부중인 언어입니다."); break;
            default: System.out.println("?");
        }
    }
}
