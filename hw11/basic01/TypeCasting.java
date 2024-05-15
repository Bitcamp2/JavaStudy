package hw11.basic01;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 사용자가 두 개의 정수를 입력하면 문자열로 받아서 두 개의 문자열 정수를 정수형으로 변환해서 합을 출력하세요.
        System.out.println("두정수 입력(문자열 타입으로): ");
        String strNum1 = sc.next();
        String strNum2 = sc.next();

        int strSum = Integer.valueOf(strNum1) + Integer.valueOf(strNum2);
        System.out.println("합(정수형): " + strSum);

        // 2. 사용자가 두 개의 정수(a, b)를 입력해서 a / b의 연산결과를 실수로 출력하세요.(단, b는 0을 입력할 수 없습니다.)
        int a = sc.nextInt();
        int b = sc.nextInt();
        double doubleSum = (double) a / b;

        System.out.println("a / b = " + doubleSum);

        // 3. 사용자가 실수 한 개를 입력하면 정수형으로 변환해서 출력하세요.
        double doubleNum1 = sc.nextDouble();
        System.out.println((int) doubleNum1);

        // 4. 사용자가 한 개의 실수를 입력하면 그 실수의 제곱의 결과를 문자열로 변환하여 출력하세요.
        double doubleNum2 = sc.nextDouble();
        double doubleMul = doubleNum2 * doubleNum2;
        System.out.println(String.valueOf(doubleMul));
        System.out.println(String.valueOf(doubleMul).getClass());

        // 5. int형 변수 iNum = 10과 long형 변수 lNum = 20의 값을 서로 교환하세요.
        int iNum = 10;
        long lNum = 20L;
        long temp = 0;

        temp = lNum;
        lNum = iNum;
        iNum = (int) temp;
        System.out.println(lNum);
        System.out.println(iNum);

        // 6. 사용자가 입력한 두 개의 문자 각각의 유니코드를 출력하세요.
        int uc1 = sc.nextInt();
        int uc2 = sc.nextInt();

        char ucc1 = (char) uc1;
        char ucc2 = (char) uc2;
        System.out.println(ucc1 + ", " + ucc2);
    }
}
