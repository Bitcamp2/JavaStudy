package chap16_usefulclass;

import java.util.Scanner;

public class _10_MathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자가 5개의 정수를 입력하고 배열에 저장
		// 배열에 저장된 정수 5개 중 최대값과 최소값을 구하세요.
		// Math.max와 Math.min 메소드를 이용
		
		// 정수 5개를 저장할 배열
		// 저장된 값을 비교할 제어문 // 중첩 for문 // Math 메소드를 이용해서 비교
		
		// 정수5개를 배열에 어떻게 담지 ??
		// 정수 5개를 서로 어떻게 비교하지?? // 배열 인덱스를 사용해야할 것 같음.
		// 
		Scanner sc = new Scanner(System.in);
		System.out.println("~");
		int[] uArr = new int[5];
		
		uArr[0] = sc.nextInt();
		sc.nextLine();
		System.out.println("~");
		uArr[1] = sc.nextInt();
		sc.nextLine();
		System.out.println("~");
		uArr[2] = sc.nextInt();
		sc.nextLine();
		System.out.println("~");
		uArr[3] = sc.nextInt();
		sc.nextLine();
		System.out.println("~");
		uArr[4] = sc.nextInt();
		sc.nextLine();
		
		System.out.println("--------------------");
		int[] intArr = new int[5];
		
		// for문을 이용해서 사용자 입력값을 받았다.
		for(int i = 0; i < intArr.length; i++) {
			System.out.println("입력하세요");
			intArr[i] = sc.nextInt(); // 이걸 몰랐다 ; // 배열에 값을 넣기 위해선 자리값 요소에 접근해야했음.
		}
	
		int max =  0;//intArr[0];
		int min = 0; //intArr[0];
		
		for(int i = 1; 1 < intArr.length; i++) {
			max = Math.max(max, intArr[i]);
			min = Math.min(min, intArr[i]);
		}
		
		System.out.println("최대값: " + max + ", 최소값: " + min);
		
	}

}
