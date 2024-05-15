package hw11.basic01;

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. 사용자가 입력한 두 정수 중에서 큰 정수를 출력하세요.
        int[] numArr1 = new int[2];
        System.out.println("정수 두개 입력: ");
        numArr1[0] = sc.nextInt();
        numArr1[1] = sc.nextInt();

        int max = 0;
        for (int i = 0; i < numArr1.length; i++) {
            if (max < numArr1[i]) {
                max = numArr1[i];
            }
        }
        System.out.println("두 정수중 큰 정수: " + max);

        // 2. 사용자가 입력한 정수가 양수면 "양수" 음수면 "음수"라고 출력하세요.
        int[] numArr2 = new int[2];
        System.out.println("정수 두개 입력: ");
        numArr2[0] = sc.nextInt();
        numArr2[1] = sc.nextInt();

        for (int i = 0; i < numArr2.length; i++) {
            if (numArr2[i] > 0) {
                System.out.println("양수");
            } else if (numArr2[i] < 0) {
                System.out.println("음수");
            } else {
                System.out.println("0");
            }
        }

        //  3. 사용자가 입력한 문자열이 "Java"인 경우 "좋아하는 언어입니다."를 출력하고,
        //  "Python"인 경우 "공부중인 언어입니다."를 출력하고, 그렇지 않은 경우 "다른 언어를 공부해보세요."를
        //  출력하세요.(switch~case~default 사용)
        System.out.println("문자열 입력: ");
        String str3 = sc.next();

        switch (str3) {
            case "Java":
                System.out.println("좋아하는 언어입니다.");
                break;
            case "Python":
                System.out.println("공부중인 언어입니다.");
                break;
            default:
                System.out.println("다른 언어를 공부해보세요.");
        }

        // 4. 사용자가 입력한 숫자가 3의 배수면 "3의 배수입니다."라고 출력하고
        // 3의 배수가 아니면 "3의 배수가 아닙니다."를 출력하세요.(switch~case~default 사용)
        System.out.println("정수입력: ");
        int num4 = sc.nextInt();

        switch (num4 % 3) {
            case 0:
                System.out.println("3의 배수입니다");
                break;
            default:
                System.out.println("3의 배수가 아닙니다.");
        }

        // 5. 사용자가 입력한 숫자가 홀수인 경우 "홀수입니다."를 출력하고,
        // 짝수인 경우 "짝수입니다."를 출력하는 프로그램을 작성하세요.
        System.out.println("0보다 큰 정수입력: ");
        int num5 = sc.nextInt();

        if (num5 % 2 == 0) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }

        // 6. 사용자가 입력한 5개의 정수중 가장 큰 수를 출력하세요.
        int[] intArr6 = new int[5];

        System.out.println("정수 5개 입력: ");
        for (int i = 0; i < intArr6.length; i++) {
            intArr6[i] = sc.nextInt();
        }

        max = 0;
        for (int i = 0; i < intArr6.length; i++) {
            if (max < intArr6[i]) {
                max = intArr6[i];
            }
        }
        System.out.println("가장큰 정수: " + max);

        // 7. 사용자가 입력한 문자열이 "Yes"인 경우 "예"를 출력하고, "No"인 경우 "아니오"를 출력하고,
        // 그 외의 경우에는 "잘못 입력하셨습니다."를 출력하세요.
        System.out.println("문자열 입력: ");
        String str7 = sc.next();

        if (str7.equalsIgnoreCase("Yes")) {
            System.out.println("예");
        } else if (str7.equalsIgnoreCase("No")) {
            System.out.println("아니오");
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }

        // 8. 사용자가 입력한 두 정수를 비교하여 같으면 "두 수가 같습니다." 첫 번째 수가 더 크면 "첫 번째 수가 더 큽니다."
        // 두 번째 수가 더 크면 "두 번째 수가 더 큽니다."를 출력하세요.
        System.out.println("두 정수 입력: ");
        int num81 = sc.nextInt();
        int num82 = sc.nextInt();

        if (num81 == num82) {
            System.out.println("두수가 같습니다.");
        } else if (num81 > num82) {
            System.out.println("첫 번째 수가 더 큽니다.");
        } else {
            System.out.println("두 번째 수가 더 큽니다.");
        }

        // 9. 사용자가 입력한 세 정수가 모두 짝수인 경우 "모두 짝수입니다." 모두 홀수인 경우 "모두 홀수입니다."
        // 그 외의 경우 "짝수 : xxx개, 홀수 : xxx개 입니다."를 출력하세요.

        int[] intArr9 = new int[3];

        System.out.println("정수 3개 입력: ");
        for (int i = 0; i < intArr9.length; i++) {
            intArr9[i] = sc.nextInt();
        }

        int evenCnt = 0;    //짝수
        int oddCnt = 0;     //홀수
        for (int i = 0; i < intArr9.length; i++) {
            if (intArr9[i] % 2 == 0) {
                evenCnt++;
            } else {
                oddCnt++;
            }
        }

        if (evenCnt == 3) {
            System.out.println("모두 짝수입니다.");
        } else if (oddCnt == 3) {
            System.out.println("모두 홀수입니다.");
        } else {
            System.out.println("짝수: " + evenCnt + "개, 홀수: " + oddCnt + "개 입니다.");
        }

    }
}
