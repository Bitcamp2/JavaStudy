package chap99_Homework.homework04;

public class ArrayUtility2 {
	static int[] concat(int[] s1, int[] s2) {
		int[] dest = new int[s1.length+s2.length];
		int index = 0;
		for(int i=0;i<s1.length;i++) dest[i] = s1[i];
		for(int i=s1.length; i<s1.length+s2.length;i++) {
			dest[i] = s2[index];
			index++;
		}
		for(int i=0;i<dest.length;i++) System.out.print(dest[i]+" ");
		return dest;
	}
	
	static int[] remove(int[] s1, int[] s2) {
		int[] dest = new int[s1.length];
		int index = 0;
		for(int i=0;i<s1.length;i++) {
			for(int j=0;j<s2.length;j++) {
				if(s1[i]!=s2[j]) {
					dest[index] = s1[i];
					index++;
				}
			}
		}
		for(int i=0;i<dest.length;i++) System.out.println(dest[i]+" ");
		return dest;
	}
	
	public static void main(String[] args) {
		concat(new int[] {1,2,3,4,5}, new int[] {4,5,6,7,8});
		System.out.println();
		remove(new int[] {1,2,3,4,5}, new int[] {4,5,6,7,8});
	}
}
