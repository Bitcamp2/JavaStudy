package homework_basic;

import java.util.Scanner;

public class _02_basic_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12. 정수 10개를 입력받아 배열에 저장하고, 이 정수 중에서 2의 배수와 3의 배수를 출력하세요.
		
		int[] intArr = new int[10];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 10개를 입력하세요.");
		
		for(int i = 0; i < 10; i++)
			intArr[i] = sc.nextInt();
		for(int i = 0; i < 10; i++) {
			if(intArr[i] % 2 == 0 || intArr[i] % 3 == 0)
				System.out.println( + intArr[i]);
		
			sc.close();
		}
		}
	}
 
