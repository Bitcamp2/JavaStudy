package hw08;

import java.util.Calendar;

public class Advance01 {
    public static void main(String[] args) {

        Calendar marry = Calendar.getInstance();
        marry.set(2001, 12, 19);
        int plusDay = 0;

        for (int i = 2001; i < 2022; i++) {
            if ((i % 400 == 0) || (i % 4 == 0 && i % 100 != 0)) {
                plusDay++;
            }
        }
        marry.add(Calendar.DATE, plusDay);
        System.out.println("2022년 결혼기념일은 "
                + (marry.get(Calendar.MONTH) + 1) + "월 "
                + marry.get(Calendar.DATE) + "일 입니다.");

    }
}
