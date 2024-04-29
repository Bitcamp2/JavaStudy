package homework_basic;

import java.util.Scanner;

public class _02_basic_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10. int배열을 10개 생성해서 사용자로부터 10개의 값을 입력받고 순서대로 출력하고 총 합을 구하세요.
		
		
		int[] intArr = new int[10];
		int sum = 0;
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("값을 10개 입력하세요.");
		
		for(int i = 0; i < 10; i++) {
			intArr[i] = sc.nextInt();
			sum += intArr[i];
		}
	
		for(int i = 0; i < 10; i++)
			System.out.println(intArr[i]);
			System.out.println("총 합 : " + sum);
		sc.close();	
	}
	
}
