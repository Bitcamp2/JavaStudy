package chap99_homework.homework06;

import java.util.Scanner;

public class Basic01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. 사용자가 입력한 문자열에서 가, 바의 개수를 새서 출력하세요.
//		   0개면 '가, 바가 존재하지 않습니다.'라고 출력.
		
//		사용자가 입력할 수 있는 메소드 // Scanner
//		그 입력 값을 받아 줄 문자열  // String a = sc.nextLine();
//		그 문자열에 문자를 하나하나 새기 위해 문자 단위로 쪼개어줄 메소드 // .toCharArray();
//		가의 갯수를 셀 int변수 // int 가 = 0;
//		바의 갯수를 셀 int변수 // int 바 = 0;
//		배열의 요소와 가, 바 갯수를 비교할 반복문 // for( ; ; ) { if() { } else if() { } //
//		가,바가 0개일 때 출력할 조건문 // if( 가 == 0 && 바 == 0) {syso}  
//		가, 바 갯수를 출력할 출력문 // else { syso(가,바갯수) }
		
		System.out.println("원하는 문장을 입력하세요."); // 이놈이 필요했다.

		Scanner sc = new Scanner(System.in);
		String userStr = sc.nextLine(); // 사용자 입력값 문자열
		char[] compareChar = userStr.toCharArray(); // 사용자문자열 char배열로 변환

		int gcnt = 0;
		int bcnt = 0;
		
		for(int i = 0; i < compareChar.length; i++) {
			if(compareChar[i] == '가' ) {
				gcnt++;
			} else if(compareChar[i] == '바') {
				bcnt++;
			}
		}
			if(gcnt == 0 && bcnt == 0) { // 둘 다 존재하지 않을 때 출력하기 때문에 &&를 써야함.
				System.out.println("가, 바가 존재하지 않습니다.");
			} else {
				System.out.println("가: " + gcnt + "바: " + bcnt); 
			}
		
		
//			2. 사용자가 입력한 문자열에서 알파벳의 모음을 제거하여 출력하세요.
//			   대문자 모음, 소문자 모음 모두 제거. 모음은 a, e, i, o, u
			System.out.println("=====모음제거기=====");
			String uPutStr = sc.nextLine();
			
			char[] chaArr = uPutStr.toCharArray();
			
			char[] nChaArr = new char[chaArr.length];
			
			for(int i = 0; i < chaArr.length; i++) {
				if(chaArr[i] == 'a' || chaArr[i] == 'e' || chaArr[i] == 'i' || chaArr[i] == 'o' || chaArr[i] == 'u' || chaArr[i] == 'A'
						|| chaArr[i] == 'E' || chaArr[i] == 'I' || chaArr[i] =='O' || chaArr[i] == 'U') {
					// 제거하는 방법 : 그냥 continue;로 지나가고 else를 담아라!
					continue;
				} else {
					nChaArr[i] = chaArr[i];
				}
			}
			String nArr = new String(nChaArr);
			
			System.out.println(nArr);

			System.out.println("----소수점 둘 째 자리 반올림 출력기----");
//			3. 16.459를 소수점 둘 째 자리까지 반올림해서 출력(xx.xx), Math.round 메소드 이용

			double a = 16.459;
			System.out.println(Math.round(a *100) / 100.0); // a에 100을 * = 1645, 1645 / 100.0 = 16.46 
			
	
//		String userStr = sc.nextLine(); // 사용자 입력값 문자열
//		
//		char[] chArr = userStr.toCharArray(); // 사용자 문자열 문자를 모아둔 배열로 변환 // 이 메소드는 new 안 붙여도 댐..
//		
//		char[] exChArr = new char[chArr.length]; // 배열 선언하는데 new 키워드를 잊음.
		

	}

}
