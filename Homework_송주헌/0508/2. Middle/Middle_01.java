package homeword_05_08;

public class Middle_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb1 = new StringBuffer(30);
		
		sb1.append("hello");
		
		int remainBufferSize = sb1.capacity() - sb1.length();
		
		for(int i = 0; i < remainBufferSize; i++) {
			if(i % 3 == 0) sb1.append("b");
			 else if(i % 2 == 0) sb1.append("i");	 
			 else if(i % 1 == 0) sb1.append("t");
		
	}
		System.out.println(sb1);
}
}