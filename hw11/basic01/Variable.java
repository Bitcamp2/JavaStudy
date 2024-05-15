package hw11.basic01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
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

        // 4. 사용자가 입력한 5개의 정수의 합계와 평균을 출력하세요.

        int sum = 0;
        double avg = 0.0;

        sum = 10 + 20 + 30 + 40 + 53;
        System.out.println("합: " + sum);

        avg = sum / 5;
        System.out.println("평균: " + avg);

        // 5. 사용자가 입력한 세 정수의 최소 값, 중간 값, 최대 값을 출력하세요.

        List<Integer> list = new ArrayList<>(3);
        list.add(10);
        list.add(33);
        list.add(5);

        list.sort(Comparator.naturalOrder());
        System.out.println("최대값: " + list.get(list.size() - 1));
        System.out.println("최소값: " + list.get(0));
        System.out.println("중간값: " + list.get(list.size() / 2));

        // 6. 사용자가 입력한 정수의 구구단을 출력하세요.(출력 양식 => 2를 입력했을 때 2 * 1 = 2
        //											  2 * 2 = 4
        //											  .....
        //											  2 * 9 = 18

        int gugudan = sc.nextInt();
        for (int i = 2; i <= 9; i++) {
            System.out.println(gugudan + " * " + i + " = " + (gugudan * i));
        }

        // 7. 사용자가 입력한 정수로 해당 정수의 팩토리얼을 계산하여 출력하세요.(재귀메소드 없이, while이나 for 반복문을 사용)

        int fact = sc.nextInt();
        int resultFact = 1;
        for (int i = 2; i <= fact; i++) {
            resultFact *= i;
        }
        System.out.println(resultFact);

        // 8. 사용자가 입력한 10개의 정수 중 소수의 개수를 출력하세요.(소수는 1이랑 본인 말고는 나눠떨어지는 값이 없는 수입니다.)
        // 사용자가 입력할 수 있는 값은 2 ~ 30로 제한
        int[] intArr = {1, 3, 5, 8, 12, 14, 17, 18, 19, 20};

        System.out.print("소수: ");
        for (int i = 0; i < 10; i++) {
            int cnt = 0;
            for (int j = 1; j <= intArr[i]; j++) {
                if (intArr[i] == 1) {
                    cnt = 2;
                } else if (intArr[i] % j == 0) {
                    cnt++;
                }
            }
            if (cnt == 2) {
                System.out.print(intArr[i] + " ");
            }
        }
    }
}
