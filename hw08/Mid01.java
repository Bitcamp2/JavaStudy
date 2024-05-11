package hw08;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Mid01 {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println(cal.get(Calendar.YEAR) + "년 "
                + (cal.get(Calendar.MONTH) + 1) + "월 "
                + cal.get(Calendar.DATE) + "일");


        cal.add(Calendar.DATE, 3);
        Date date = new Date(cal.getTimeInMillis());
        System.out.println(sdf.format(date));
    }
}
