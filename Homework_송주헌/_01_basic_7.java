package homework_basic;

public class _01_basic_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 7. 1 ~ 100까지 합을 do ~ while문으로 출력
		System.out.println("7번");
		
		int u = 1;
		int y = 0;
		
		do {
			y += u;
			u++;
			}while(u <= 100);
			System.out.println(+ y);
	}

}
