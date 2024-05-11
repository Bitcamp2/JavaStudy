package hw08;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Mid02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] week = new String[]{"", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};



        //포기
        System.out.println("날짜 입력: ");
        Date date = new Date(sc.nextInt());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.format(date);

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);


        System.out.println("오늘은 "+
                week[cal.get(Calendar.DAY_OF_WEEK)]
        );
    }
}
