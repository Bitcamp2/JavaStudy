package hw10.advance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //  1. 12달을 상수로 만들어서 enum을 선언하고 첫 번째 값은 평년일 때 그 달의 일수 두 번째 값은 윤년일 때
        //  그 달의 일수로 설정하고 사용자가 년도를 입력하면 해당 년도의 1, 2, 3, 4, 5월의 일수의 총합을 출력하는 메소드를 구현하세요.
        //  sumDays(int year)

        Scanner sc = new Scanner(System.in);

        System.out.print("년도 입력: ");
        int year = sc.nextInt();

        sumDays(year);
    }

    public static void sumDays(int year) {

        // 이넘배열만들어서 조건문 돌리기
        Month[] months = Month.values();

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            if (year % 400 == 0 || (year % 4 == 0) && (year % 100 != 0)) {
                sum += months[i].getsMonth();
                //sum = Month.JAN.getsMonth() + Month.FAB.getsMonth() + Month.MAR.getsMonth() + Month.APR.getsMonth() + Month.MAR.getsMonth();
            } else {
                sum += months[i].getfMonth();
                //sum = Month.JAN.getfMonth() + Month.FAB.getfMonth() + Month.MAR.getfMonth() + Month.APR.getfMonth() + Month.MAR.getfMonth();
            }
        }

        System.out.println("총 일수: " + sum);
    }
}
