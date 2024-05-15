package hw11.basic01;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. 사용자가 입력한 두 정수읜 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
        //  (메소드로 따로 만들지 말고 메인메소드에서 구현)
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("sum = " + (num1 + num2));
        System.out.println("sub = " + (num1 - num2));
        System.out.println("Mul = " + (num1 * num2));
        System.out.println("div = " + ((double) num1 / num2));
        System.out.println("rem = " + (num1 % num2));

        // 2. int형 변수 20을 증감연산자를 사용해서 다음과 같은 순서로 출력되도록 구현하세요.
        // 21, 22, 22, 21, 20, 20, 19, 마지막 변수의 값(증감연산자 없이) : 20

        int x = 20;
        System.out.println(++x);    //21
        System.out.println(++x);    //22
        System.out.println(x--);    //22 ,21
        System.out.println(x--);    //21 ,20
        System.out.println(x);      //20
        System.out.println(x--);    //20 ,19
        System.out.println(x++);    //19 ,20
        System.out.println(x);      //20

        // 3. 사용자가 입력한 정수가 2와 7의 공배수면 "2와 7의 공배수"라고 출력하고
        // 아니면 "2와 7의 공배수가 아님"이라고 출력하세요.
        int num3 = sc.nextInt();

        if (num3 % 14 == 0) {
            System.out.println("2와 7의 공배수");
        } else {
            System.out.println("2와 7의 공배수가 아님");
        }

        // 4. 사용자로부터 입력받은 문자열이 "Hello"인지 아닌지 판별하는 프로그램을 작성하세요.
        System.out.println("문자열 입력: ");
        String str4 = sc.next();
        if (str4.equalsIgnoreCase("Hello")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        // 5. 삼항연산자를 이용하여 사용자가 입력한 정수가 홀수면 "홀수" 짝수면 "짝수"라고 출력하세요.
        System.out.println("정수 입력: ");
        int num5 = sc.nextInt();

        System.out.println(num5 % 2 != 0 ? "홀수" : "짝수");

        // 6. 삼항연산자의 중첩을 이용하여 사용자가 입력한 정수가
        // 100보다 크면 "100보다 큼" 작으면 "100보다 작음" 같으면 "100"을 출력하세요.
        System.out.println("정수 입력:");
        int num6 = sc.nextInt();

        System.out.println(num6 == 100 ? "100" : num6 > 100 ? "100보다 큼" : "100보다 작음");

        // 7. 사용자가 입력한 두 실수의 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
        double doubleNum1 = sc.nextDouble();
        double doubleNum2 = sc.nextDouble();

        System.out.println("doubleSum = " + (double) Math.round((doubleNum1 + doubleNum2) * 100) / 100);
        System.out.println("doubleSub = " + (double) Math.round((doubleNum1 - doubleNum2) * 100) / 100);
        System.out.println("doubleMul = " + (double) Math.round((doubleNum1 * doubleNum2) * 100) / 100);
        System.out.println("doubleDiv = " + (double) Math.round((doubleNum1 / doubleNum2) * 100) / 100);
        System.out.println("doubleRem = " + (double) Math.round((doubleNum1 % doubleNum2) * 100) / 100);

        // 8. 사용자가 입력한 하나의 문자열과 하나의 정수로
        // "입력한 문자열 xxxxx이고, 입력한 숫자는 xxxxxx입니다." 라고 출력하세요.
        String str8 = sc.next();
        int num8 = sc.nextInt();

        System.out.println("입력한 문자열 " + str8 + "이고, 입력한 숫자는 " + num8 + "입니다.");
    }
}
