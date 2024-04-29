package homework_basic;

public class _01_basic_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 9. int 10개짜리 배열 생성하여 int배열에 3의 배수를 차례대로 저장하세요 그리고 거꾸로 출력하세요.
		
		System.out.println("9번");
		
		int[] intArr = new int[10];
		
		for(int i = 0; i < 10; i++)
		
		intArr[i] = (i + 1) * 3;
		
		for(int i = intArr.length - 1; i >= 0; i--)
		
		System.out.println(intArr[i]);
		
		
		

	}

}
