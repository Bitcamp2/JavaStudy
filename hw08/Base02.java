package hw08;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Base02 {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        System.out.println(cal.get(Calendar.YEAR) + "-" +
                ((cal.get(Calendar.MONTH) + 1) < 10
                        ? "0" + (cal.get(Calendar.MONTH) + 1)
                        : (cal.get(Calendar.MONTH) + 1)) + "-" +
                (cal.get(Calendar.DATE) < 10
                        ? "0" + (cal.get(Calendar.DATE))
                        : (cal.get(Calendar.DATE))));

        System.out.println("--------------------------------");

        System.out.println(cal.get(Calendar.YEAR) + "년 " +
                ((cal.get(Calendar.MONTH) + 1) < 10
                        ? "0" + (cal.get(Calendar.MONTH) + 1)
                        : (cal.get(Calendar.MONTH) + 1)) + "월 " +
                (cal.get(Calendar.DATE) < 10
                        ? "0" + (cal.get(Calendar.DATE))
                        : (cal.get(Calendar.DATE))) + "일 " +
                cal.get(Calendar.HOUR_OF_DAY) + "시 " +
                cal.get(Calendar.MINUTE) + "분 " +
                cal.get(Calendar.SECOND) + "초");
    }
}
