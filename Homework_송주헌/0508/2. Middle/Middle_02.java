package homeword_05_08;

import java.util.Scanner;

public class Middle_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		StringBuffer sb1 = new StringBuffer("유용한 클래스는 많다. 다양한 라이브러리를 활용한다.");
		
		sb1.reverse();
		
		int num = sc.nextInt();
		
		
		System.out.println(num + "번째 문자는 '" + sb1.charAt(num) + "' 입니다.");
		
		
		sc.close();
		
		
		
		
	}

}
