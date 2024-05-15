package _0515_basics1.variable;

import java.util.Scanner;

public class Variable1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("이름을 입력하세요");
        String name = sc.nextLine();

        System.out.println("나이를 입력하세요");
        int age = sc.nextInt();

        System.out.println("성별을 입력하세요");
        String sex = sc.next();


        System.out.println("이름: "  + name + ", 나이: " + age + ", 성별: " + sex);

    }
}
