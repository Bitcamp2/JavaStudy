package hw08;

import java.util.Calendar;

public class Base01 {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        // 2020/ 4/ 8일 변경
        cal.set(2020, 3, 8);
        System.out.println(cal.get(Calendar.YEAR) + "년 "
                + (cal.get(Calendar.MONTH) + 1) + "월 "
                + cal.get(Calendar.DATE) + "일");

        cal.add(Calendar.YEAR, 5);
        cal.add(Calendar.MONTH, 2);
        cal.add(Calendar.DATE, 3);
        // 5년 ,2달, 3일뒤
        System.out.println(cal.get(Calendar.YEAR) + "년 "
                + (cal.get(Calendar.MONTH) + 1) + "월 "
                + cal.get(Calendar.DATE) + "일");
    }
}
