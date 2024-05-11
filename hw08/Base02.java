package hw08;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Base02 {
    public static void main(String[] args) {

//        Calendar cal = Calendar.getInstance();
//
//        System.out.println(cal.get(Calendar.YEAR) + "-" +
//                ((cal.get(Calendar.MONTH) + 1) < 10
//                        ? "0" + (cal.get(Calendar.MONTH) + 1)
//                        : (cal.get(Calendar.MONTH) + 1)) + "-" +
//                (cal.get(Calendar.DATE) < 10
//                        ? "0" + (cal.get(Calendar.DATE))
//                        : (cal.get(Calendar.DATE))));
//
//        System.out.println("--------------------------------");
//
//        System.out.println(cal.get(Calendar.YEAR) + "년 " +
//                ((cal.get(Calendar.MONTH) + 1) < 10
//                        ? "0" + (cal.get(Calendar.MONTH) + 1)
//                        : (cal.get(Calendar.MONTH) + 1)) + "월 " +
//                (cal.get(Calendar.DATE) < 10
//                        ? "0" + (cal.get(Calendar.DATE))
//                        : (cal.get(Calendar.DATE))) + "일 " +
//                cal.get(Calendar.HOUR_OF_DAY) + "시 " +
//                cal.get(Calendar.MINUTE) + "분 " +
//                cal.get(Calendar.SECOND) + "초");
//    }

        // Calendar는 Date클래스의 단점을 해결하고 등장
        // 추상클래스이기 때문에 객체를 생성할 수 없다
        // 하지만 인스턴스를 생성해야할 때가 있는데, 이때 getInstance()를 사용한다

        Calendar cal = Calendar.getInstance(); // Calendar 객체 생성

        System.out.println(cal.get(Calendar.YEAR) + "-" +
                ((cal.get(Calendar.MONTH) + 1) < 10
                        ? "0" + (cal.get(Calendar.MONTH) + 1)
                        : (cal.get(Calendar.MONTH) + 1)) + "-" +
                (cal.get(Calendar.DATE) < 10
                        ? "0" + cal.get(Calendar.DATE)
                        : cal.get(Calendar.DATE))); // 오늘 날짜 출력, 1번 형식

        System.out.println(cal.get(Calendar.YEAR) + "년 " +
                ((cal.get(Calendar.MONTH) + 1) < 10
                        ? "0" + (cal.get(Calendar.MONTH) + 1)
                        : (cal.get(Calendar.MONTH) + 1)) + "월 " +
                (cal.get(Calendar.DATE) < 10
                        ? "0" + cal.get(Calendar.DATE)
                        : cal.get(Calendar.DATE)) + "일 " +
                (cal.get(Calendar.HOUR_OF_DAY) < 10
                        ? "0" + (cal.get(Calendar.HOUR_OF_DAY))
                        : cal.get(Calendar.HOUR_OF_DAY)) + "시 " +
                (cal.get(Calendar.MINUTE) < 10
                        ? "0" + (cal.get(Calendar.MINUTE))
                        : cal.get(Calendar.MINUTE)) + "분 " +
                (cal.get(Calendar.SECOND) < 10
                        ? "0" + (cal.get(Calendar.SECOND))
                        : cal.get(Calendar.SECOND)) + "초 "
        ); //// 오늘 날짜 출력, 2번 형식
    }
}
