package homework_basic;

import java.util.Random;

public class _02_basic_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 11. int배열로 10개의 공간을 생성하세요. 1 ~ 10까지의 임의의 수를 저장하고 홀수만 골라서 출력하세요.
		
		int[] intArr = new int[10];
		
		Random random = new Random();
		
		for(int i = 0; i < 10; i++)
			intArr[i] = random.nextInt(10) + 1;
		for(int i = 0; i < 10; i++) {
			if(intArr[i] % 2 != 0)
				System.out.println(intArr[i]);
		}
		
		
	}

}
