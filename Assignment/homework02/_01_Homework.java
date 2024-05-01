package chap99_Homework.homework02;

public class _01_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		_02_RockScissPaper rsp = new _02_RockScissPaper();
		rsp.start();
		*/
		
		
		int[] arr = {1,2,3,4,5};
		arr = reverse(arr);
		System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
		
		char[] chArr = {'A','B','c','D','E'};
		chArr = reverseAlphabet(chArr);
		System.out.println(chArr[0]+" "+chArr[1]+" "+chArr[2]+" "+chArr[3]+" "+chArr[4]);
		
		System.out.println(sum(5));
		
		System.out.println(ConcatString("asdf", "zxcv",5));
		
		reverseArr(arr);
	}
	
	// basic 1
	public static int sum(int a) {
		int sum = 0;
		for(int i=1;i<=a;i++) {
			sum += i;
		}
		return sum;
	}
	
	// basic 2
	public static String ConcatString(String a, String b) {
		return a+b;
	}
	
	// basic 3
	public static String ConcatString(String a, String b, int c) {
		return a+b+c;
	}
	
	// basic 4
	public static void reverseArr(int[] arr) {
		for(int i=arr.length-1;i>=0;i--) System.out.println(arr[i]);
	}
	
	// Middle 1
	public static int[] reverse(int[] arr) {
		int[] rev = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			rev[(arr.length-1)-i] = arr[i];
		}
		return rev;
	}
	
	// Middle 2
	public static char[] reverseAlphabet(char[] chArr) {
		char[] convertArr = new char[chArr.length];
		for(int i=0;i<chArr.length;i++) {
			if(chArr[i]>=65 && chArr[i]<=90) {
				convertArr[i] = Character.toLowerCase(chArr[i]);
				if(convertArr[i]=='a') convertArr[i] = 'z';
				else convertArr[i]++;
			}
			else {
				convertArr[i] = Character.toUpperCase(chArr[i]);
				if(convertArr[i]=='A') convertArr[i] = 'Z';
				else convertArr[i]--;
			}
		}
		return convertArr;
	}

}
