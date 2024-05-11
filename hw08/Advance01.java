package hw08;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import static java.time.Year.isLeap;

public class Advance01 {
    public static void main(String[] args) {

        // LocalDate 사용해서 다시
        Calendar marry = Calendar.getInstance();
        marry.set(2001, 12, 19);
        int plusDay = 0;

        for (int i = 2001; i <= 2022; i++) {
            if (isLeap(i)) {
                marry.add(Calendar.DATE, 1);
            }
        }
        SimpleDateFormat sdf = new SimpleDateFormat("MM월 dd일");
        Date date = new Date(marry.getTimeInMillis());
        System.out.println("2022년 결혼기념일 날짜는 " + sdf.format(date) + "입니다.");

    }
}
