package chap99_homework.homework04;

public class UseOfArrayUtil2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = ArrUtility2.remove(new int[] {1, 2, 3, 4, 5, 1, 2, 3},
				new int[] {1, 1, 1, 1, 2, 2, 1, 3, 2, 1, 3, 2});
		
		for(int i : arr) {
			System.out.println(i);
			
			
		}
	}

}
