package hw11.base02;

import java.util.*;

public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. 1부터 10까지의 정수를 배열에 저장하고 배열의 모든 요소를 출력하세요.
        int[] intArr1 = new int[10];

        for (int i = 0; i < intArr1.length; i++) {
            intArr1[i] = i + 1;
        }

        System.out.print("배열 값: ");
        for (int i : intArr1) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 2. 사용자가 q를 입력하기 전까지 정수를 입력받아 배열에 저장하고 배열의 모든 요소를 출력하세요.
        int[] intArr2 = new int[100];
        int index = 0;
        boolean result = false;
        while (!result) {

            System.out.print("정수 입력(q 입력시 프로그램종료): ");
            String num = sc.next();

            if (num.equalsIgnoreCase("q")) {
                System.out.println("프로그램 종료합니다.");
                result = true;
            } else {
                intArr2[index] = Integer.parseInt(num);
            }
            index++;
        }
        for (int i1 : intArr2) {
            if (i1 != 0) {
                System.out.print(i1 + " ");
            }
        }
        System.out.println();

        // 3. 사용자가 입력한 10개의 정수를 배열에 저장하고 평균을 계산하여 출력하세요.
        int[] intArr3 = new int[10];
        int sum = 0;
        System.out.println("정수 10개 입력: ");
        for (int j = 0; j < 10; j++) {
            intArr3[index] = sc.nextInt();
            sum += intArr3[index];
        }
        System.out.print("평균: " + ((double) sum / intArr3.length));
        System.out.println();

        // 4. 1부터 100까지의 숫자 중에서 짝수만 배열에 저장하고 배열의 합을 계산하여 출력하세요.
        int[] intArr4 = new int[100];
        int index4 = 0;
        sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                intArr4[index4++] = i;
            }
        }

        for (int i : intArr4) {
            sum += i;
        }
        System.out.println("배열 총합: " + sum);
        System.out.println();

        // 5. 사용자가 입력한 10개의 정수를 배열에 저장하고 최소값과 최대값을 찾아서 출력하세요.
        List<Integer> list5 = new ArrayList<>();

        System.out.println("정수 10개 입력: ");
        for (int i = 0; i < 10; i++) {
            list5.add(sc.nextInt());
        }

        list5.sort(Comparator.naturalOrder());
        System.out.println("최대값: " + list5.getLast());
        System.out.println("최소값: " + list5.getFirst());
        System.out.println();

        // 6. 사용자가 입력한 5개의 문자열을 배열에 저장하고 길이가 가장 긴 문자열과 길이가 가장 작은 문자열을 출력하세요.
        String[] strArr6 = new String[5];
        String maxStr = "";
        String minStr = "";
        int max = 0;

        System.out.println("문자열 입력: ");
        for (int i = 0; i < strArr6.length; i++) {
            strArr6[i] = sc.next();
        }

        for (String string : strArr6) {
            if (max < string.length()) {
                max = string.length();
                maxStr = string;
            }
        }

        int min = strArr6[0].length();
        for (int i = 1; i < strArr6.length; i++) {
            if (min > strArr6[i].length()) {
                min = strArr6[i].length();
                minStr = strArr6[i];
            }
        }
        System.out.println("가장긴 문자열: " + maxStr + ", 가장 짧은 문자열: " + minStr);
        System.out.println();


        //7. 두 개의 정수형 배열을 만들고 1 ~ 100까지의 랜덤한 값으로 첫 번째 배열은 4개 두 번째 배열은 3개를 저장하고
        // 두 배열을 합친 새로운 배열을 생성하세요.
        int[] intArr71 = new int[4];
        int[] intArr72 = new int[3];
        int[] sumArr = new int[intArr71.length + intArr72.length];
        Random random = new Random();

        for (int i = 0; i < sumArr.length; i++) {
            sumArr[i] = random.nextInt(99) + 1;
        }

        for (int i : sumArr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 8. 사용자가 문자열을 입력하는데 문자열 사이사이에 -을 넣어 구분자로 만들어준다.
        // -기준으로 잘라진 문자열 배열을 생성하고 잘라진 문자열 중에
        // 가장 길이가 긴 문자열의 인덱스와 그 문자열을 출력하세요.
        System.out.println("문자열 입력: ");
        String str8 = sc.nextLine();


        // 계산하지말고 split()사용
        String[] strArr8 = str8.split("-");

        int maxLength = 0;
        int indexResult = 0;
        String result8 = "";
        for (int i = 0; i < strArr8.length; i++) {
            if (strArr8[i] != null) {
                if (maxLength < strArr8[i].length()) {
                    maxLength = strArr8[i].length();
                    indexResult = i;
                    result8 = strArr8[i];
                }
            }
        }
        System.out.println("가장길이가 긴 문자열: " + result8 + ", 인덱스: " + indexResult);
    }
}
