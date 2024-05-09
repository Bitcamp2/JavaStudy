package homework_05_09;

import java.util.Calendar;

public class basic_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		
		calendar.set(2020, 3, 8);
		
		System.out.print(calendar.get(Calendar.YEAR) + "년 "); 
		System.out.print(calendar.get(Calendar.MONTH) + 1 + "월 "); 
		System.out.println(calendar.get(Calendar.DATE) +  "일");
		
		calendar.add(Calendar.YEAR, 5);
		calendar.add(Calendar.MONTH, 2);
		calendar.add(Calendar.DATE, 3);
		
		System.out.println("---------------------");
		
		System.out.print(calendar.get(Calendar.YEAR) + "년 "); 
		System.out.print(calendar.get(Calendar.MONTH) + 1 + "월 "); 
		System.out.print(calendar.get(Calendar.DATE) +  "일");
		
	}

	
				
}

