package homework_05_17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class _1_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = new ArrayList<>();
		
		//1. List<Integer> intList를 생성하고 10개의 랜덤값(1~10)을 저장합니다. intList를 Stream으로 만들어서 
		//각 요소에 곱하기 3을 한 요소로 새로운 스트림을 만들어서 출력하세요.
		for(int i = 0; i < 10; i++) {
			intList.add((int)(Math.random() * 10) + 1);
		}
		intList.stream()
			   .forEach(num -> System.out.println(num * 3));
		
	
		//2. 사용자가 입력한 문자열 10개를 저장한 문자열 리스트를 이용하여 문자열의 길이가 5이상인 문자열만 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		List<String> string = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("문자열을 입력하세요." + (i + 1));
			
			string.add(sc.nextLine()); 
		}
		
		List<String> filteredString = string.stream()
											.filter(strings -> strings.length() >= 5)
											.collect(Collectors.toList());
											
		
		System.out.println("길이가 5이상인 문자열: ");

		
		filteredString.forEach(System.out::println);

//		3. 사용자가 입력한 문자열 10개를 저장하는 List<String> strList를 만들고 스트림을 이용해서 문자열에 
//		영문자가 포함된 문자열만 뽑아서 스트림을 만들고 출력하세요.
		
		List<String> strList = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("문자열을 입력하세요." + (i + 1));
			
			strList.add(sc.nextLine()); 
		}
		
		List<String> filteredEngString = strList.stream()
											   .filter(strings -> strings.chars()
													   .anyMatch(ch -> (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')))
											   .collect(Collectors.toList());
		
		System.out.println("영문자가 포함된 문자열: ");
		
		filteredEngString.forEach(System.out::println);
		
		
		sc.close();
		
		
		
	}
	
	
}
