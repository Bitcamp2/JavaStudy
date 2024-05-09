package homework_05_09;

import java.util.ArrayList;
import java.util.Scanner;

public class basic_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		System.out.println("정수를 5개 입력하세요.");
		
		for(int i = 0; i < 5; i++) {
			int input = sc.nextInt();
			numbers.add(input);
		}
		
		
		sc.close();
		
		System.out.println(numbers);
		
	}

}
