package homework_05_07;

import java.util.Scanner;

public class middle_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요.");
		
		String input = sc.nextLine();
		
		
		
		String middleChars = middleChars(input);
		System.out.println(middleChars);
		
		sc.close();
	}

	public static String middleChars(String str) {
		// TODO Auto-generated method stub
		
		int length = str.length();
		int mid = length / 2;
		if(length % 2 == 0) {
			return str.substring(mid - 1, mid + 1);
			
		} else {
			return str.substring(mid, mid + 1);
		}
		
	}

}
