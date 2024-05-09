package chap99_homework.homework0509;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Middle0509 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. 사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)에 add 메소드로 3일뒤로 변경하고
//	     yyyy-MM-dd 형식으로 출력하세요. (SimpleDateFormat 클래스 사용. 
//		SimpleDateFormat의 parse() 메소드를 이용하면 String -> Calendar로 변환가능)
		Scanner sc = new Scanner(System.in);
		
		Calendar cl = Calendar.getInstance();
		
		System.out.println("yyyy-MM-dd를 순서대로 입력하세요.");
		cl.set(sc.nextInt(), sc.nextInt(),sc.nextInt());
		
		cl.add(Calendar.DATE, 3);
		
		SimpleDateFormat sDF = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		
		sDF.parse("yyyy-MM-dd", )
		
		// add로 변경한 날짜를 바꾼 형식에 어떻게 출력해야할지 고민하다 끝남.
		// DATE를 객체를 또 만들어야하는지..
		//parse 메소드 사용법 모르겠음.
		
		

		
		
		
		
		
		
//
//	2. 길이가 8이며 한글로 된 요일이 저장되어 있는 요일 배열을 만들고
//	   사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)의 요일을 한글로 출력하세요.
//
//	3. 두 개의 날짜 데이터 2023-03-15 20:31:45와 2021-07-08 11:58:04의 차이를
//	     시 분 초 형태로 나타내시오.

	}

}
