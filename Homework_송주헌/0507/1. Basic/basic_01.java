package homework_05_07;

import java.util.Scanner;

public class basic_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요.");
		
		String input = sc.nextLine();
		
		int countG = 0;
		int countB = 0;
		
		System.out.println(input);
		
		for(int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if(c == '가') {
				countG ++;
			} else if(c == '바'){
				countB ++;
			}
		}
		
		if(countG == 0 && countB == 0) {
			System.out.println("가, 바가 존재하지 않습니다.");
		} else {
			System.out.println("가의 개수: " + countG);
			System.out.println("바의 개수: " + countB);
		} 
		
		sc.close();
	}
	
}
