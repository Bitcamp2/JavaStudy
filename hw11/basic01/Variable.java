package hw11.basic01;

import java.util.Scanner;

public class Variable {

    public static void main(String[] args) {

        //1. 사용자가 입력한 이름, 나이, 성별을 출력하세요.
        Scanner sc = new Scanner(System.in);
        System.out.println("이름: ");
        String name = sc.next();
        System.out.println("나이: ");
        int age = sc.nextInt();
        System.out.println("성별: ");
        String gender = sc.next();

        System.out.println("이름: " + name + ", 나이: " + age + ", 성별: " + gender);

        //2. 사용자가 입력한 두 개의 정수와 문자(char) 연산자를 받아 두 정수로 해당 연산을 진행한 결과를 출력하세요.
        System.out.println("정수 두개 입력: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("연산자 입력: ");
        String str = sc.next();

        if (str.equals("+")) {
            System.out.println(num1 + num2);
        } else if (str.equals("-")) {
            System.out.println(num1 - num2);
        } else if (str.equals("*")) {
            System.out.println(num1 * num2);
        } else if (str.equals("/")) {
            System.out.println(num1 / num2);
        }

        // 3. 반지름이 20인 원의 넓이와 둘레를 출력하세요.(넓이 : 2 * 3.14 * 반지름 ^ 2, 둘레 : 4 * 3.14 * 반지름)
        // 단, 원주율 3.14는 상수로 선언하세요.
        final double PI = 3.14;
        int radius = 20;

        System.out.println("넓이: " + (2 * PI * radius) + ", 둘레: " + (4 * PI * radius));

        // 4.
    }
}
