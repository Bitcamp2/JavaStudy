package hw08;

import java.util.Calendar;

public class Mid03 {
    public static void main(String[] args) {

        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.set(2023, 2, 15, 20, 31, 45); // 3월
        cal2.set(2021,6,8,11,58,4); //7월

        long diff = cal1.getTimeInMillis() - cal2.getTimeInMillis();

        long diffTime = diff / ((long) 1000 * 60 * 60);
        diff %= ((long) 1000 * 60 * 60);
        long diffMin = diff / ((long) 1000 * 60);
        diff %= ((long) 1000 * 60);
        long diffSec = diff / ((long) 1000);

        System.out.println("cal2부터 cal1까지 " + diffTime + "시 " + diffMin + "분 " + diffSec + "초 입니다.");
    }
}
