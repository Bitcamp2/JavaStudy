package homeword_05_08;

public class basic_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb1 = new StringBuffer(30);
		
		sb1.append("hello");
		
		int remainBufferSize = sb1.capacity() - sb1.length();
		
		for(int i = 0; i < remainBufferSize; i++) {
			sb1.append("a");
		
	}
		System.out.println(sb1);

	
	}	
}
