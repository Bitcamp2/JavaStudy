package hw08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Mid01 {
    public static void main(String[] args) throws ParseException {

//        Calendar cal = Calendar.getInstance();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//
//        System.out.println(cal.get(Calendar.YEAR) + "년 "
//                + (cal.get(Calendar.MONTH) + 1) + "월 "
//                + cal.get(Calendar.DATE) + "일");
//
//
//        cal.add(Calendar.DATE, 3);
//        Date date = new Date(cal.getTimeInMillis());
//        System.out.println(sdf.format(date));


        Scanner sc = new Scanner(System.in);
        String inputDate = sc.nextLine(); // 사용자가 입력한 날자 (yyyy-MM-dd 형식으로 입력받음, String타입)

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // 나중에 결과값을 "yyyy-MM-dd"형식으로 출력하기위해 SimpleDateFormat 타입 객체 생성

        Date date = new Date();
        Calendar cal = Calendar.getInstance();

        try {
            date = sdf.parse(inputDate);
            cal.setTime(date);
            cal.add(Calendar.DATE, 3);
            date = cal.getTime();
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(sdf.format(date));

        // format메소드를 통해 Date객체의 날짜 데이터를 SimpleDateFormat객체의 지정한 형식으로 바꿀 수 있다.
        // 리턴값은 String이기 때문에 연산은x

    }
}
