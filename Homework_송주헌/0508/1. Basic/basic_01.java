package homeword_05_08;

import java.util.Scanner;

public class basic_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 3개를 입력하세요.");
		
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		String str3 = sc.nextLine();
		
		StringBuffer stringBuffer = new StringBuffer(str1 + str2 + str3);
		
		System.out.println(stringBuffer);
		
		
		
		sc.close();
	}

	
	
	
}
