package _0515_basics2.arrangement;

import java.util.Scanner;

public class arrangement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];

        int count = 0; // 입력된 정수의 개수를 저장할 변수
        System.out.println("정수를 입력하세요. 입력을 끝내려면 'q'를 입력하세요.");
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                int num = sc.nextInt();
                arr[count] = num;
                count++;

                // 배열 크기 초과 시
                if (count == arr.length) {
                    System.out.println("더 많은 정수를 입력할 수 없습니다.");
                    break;
                }
            } else {
                String input = sc.next();
                if (input.equals("q")) {
                    break;
                } else {
                    System.out.println("올바른 정수나 'q'를 입력하세요.");
                }
            }
        }
        System.out.println("배열의 요소:");
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }

        sc.close();

    }
}
