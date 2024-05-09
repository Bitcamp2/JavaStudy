package chap99_homework.homework07;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. 사용자가 문자열 3개를 입력하고 그 문자열을 합쳐서 출력하세요(StrginBuffer 사용).
		Scanner sc = new Scanner(System.in);
		
		System.out.println("~");

		StringBuffer sb1 = new StringBuffer();
		sb1.append(sc.nextLine());
		StringBuffer sb2 = new StringBuffer();
		sb2.append(sc.nextLine());
		StringBuffer sb3 = new StringBuffer();
		sb3.append(sc.nextLine());
		
		System.out.println(sb1.append(sb2)
								.append(sb3)); // 체이닝 기법
		
//		2. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
//		    비어있는 바이트의 공간을 a로 모두 채우시오.
		StringBuffer sb30 = new StringBuffer(30);
		
		sb30.append("hello");
		
//		System.out.println(sb30.capacity());
//		System.out.println(sb30.length());
		
		int remainBufferSize = sb30.capacity() - sb30.length();
		
		for(int i = 0; i < remainBufferSize; i++) {
			sb30.append("a");
		}
		System.out.println(sb30);
		
		
//		1. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
//		    비어있는 바이트의 공간을 b, i, t가 반복되어 들어가도록 모두 채우세요.
		// bit가  어떻게 차례대로 나올까 ?
		StringBuffer sb30bit = new StringBuffer(30);
		
		sb30bit.append("hello");
		
		int remainBufferSizebit = sb30bit.capacity() - sb30bit.length();
		
		for(int i = 0; i <remainBufferSizebit; i++) {
			if(i % 3 == 0) {
				sb30bit.append("b");
			} else if(i % 3 == 1) {
				sb30bit.append("i");
			} else if(i % 3 == 2) {
				sb30bit.append("t");
			}
		}
		System.out.println(sb30bit);
		
		
		
		
		
		
		
		
		
		
		
//		2. "유용한 클래스는 많다. 다양한 라이브러리를 활용한다."라는 StringBuffer이 있을 때 사용자가 정수를 입력하고 위 StringBuffer를 거꾸로 만든 StringBuffer의 사용자가 입력한 정수에 해당하는 인덱스의 문자를 출력하세요.

		
		
		
		
		

	}

}
