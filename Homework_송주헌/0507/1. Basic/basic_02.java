package homework_05_07;

import java.util.Scanner;

public class basic_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요.");
		
		String input = sc.nextLine();
		
		StringBuilder result = new StringBuilder();
		

		for(int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' 
			&& c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
				result.append(c);
			}
		}
		
		
		System.out.println(result.toString());
		
		sc.close();
		
		
	}

}
