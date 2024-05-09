package chap99_homework.homework0509;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Basic0509 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. Calendar 객체를 오늘날짜로 생성하세요.
		
//		   객체의 날짜를 2020년 4월 8일로 변경하고 출력하세요.
		
//		   위의 객체의 날짜를 add 메소드를 이용해서 5년뒤 2달뒤 3일뒤(동시에)로 변경하고 출력하세요.
		Calendar calendar = Calendar.getInstance();
		calendar.set(2020, 4, 8);
		System.out.println(DateToString(calendar));
		
		calendar.add(Calendar.YEAR,5);
		calendar.add(Calendar.MONTH,2);
		calendar.add(Calendar.DATE,3);
		printCalendar(calendar);
		
		
//		2. Calendar 객체를 오늘날짜로 생성하세요.
//		   오늘날짜를 2023-03-24 형식으로 출력하세요.
//		   오늘날짜를 2023년 03월 24일 xx시 xx분 xx초 형식으로 출력하세요.
		Calendar calendar2 = Calendar.getInstance();
		Date today = new Date();
		
		SimpleDateFormat simDF = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(simDF.format(today));
		
		SimpleDateFormat simDF2 = new SimpleDateFormat("yyyy년 MM월 dd월 HH시 mm분 ss초");
		System.out.println(simDF2.format(today));
		
//		3. 정수형 데이터를 저장할 수 있는 ArrayList를 생성하고 사용자가 입력한 5개의 정수를 저장하고 출력하세요.

		Scanner sc = new Scanner(System.in);
		
		List<Integer> iList = new ArrayList<>();
		
		
		
		for(int i = 0; i < 5; i++) {
			System.out.println("정수를 입력하세요.");
			iList.add(sc.nextInt());
		}
		System.out.println(iList);
		
		
		
		
	}
	private static void printCalendar(Calendar calendar) {
		System.out.println(calendar.get(Calendar.YEAR) + "년 " + 
				(calendar.get(Calendar.MONTH) + 1) + "월 " +
				calendar.get(Calendar.DATE) + "일");
	}
	
	public static String DateToString(Calendar calendar) {
		// 몇년 몇월 몇일 형태의 String이 리턴되도록 구현
		return calendar.get(Calendar.YEAR) + "년 " +
				(calendar.get(Calendar.MONTH) + 1) + "월 " +
				calendar.get(Calendar.DATE) + "일";
	}

}
