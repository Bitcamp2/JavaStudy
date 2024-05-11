package hw08;

import java.util.Calendar;

public class Base01 {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance(); // Calender 객체 생성

        cal.set(2020, 4, 8); // 객체의 날짜를 2020년 4월 8일로 변경

        cal.add(Calendar.YEAR, 5);
        cal.add(Calendar.MONTH, 2);
        cal.add(Calendar.DATE, 3);  // 객체의 날짜를 add메소드 사용해서 변경

        System.out.println(cal.get(Calendar.YEAR) + "년 "
                + cal.get(Calendar.MONTH) + "월 "
                + cal.get(Calendar.DATE) + "일");
    }
}
