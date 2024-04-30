package chap05_array;

public class _06_shallowCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5};
		
//		1. 얕은 복사
//		배열도 참조타입의 변수다. 그렇기 때문에 stack 메모리에는 heap 메모리 주소가 저장 되어 있다.
//		대입 연산자를 통해, 다른 배열에 원본 배열을 저장하게 된다면
//		heap 메모리의 주소가 전달 되어 '같은' 배열을 바라 보게 된다.
		int[] copyArr = arr; // arr와 copyArr는 heap에 같은 주소를 바라봄.

//		배열은 참조타입이기 때문에 배열을 출력하면 주소 값이 출력된다.
		System.out.println(arr);
		System.out.println(copyArr);
		System.out.println(arr != copyArr);
		
//		얕은 복사는 같은 메모리 주소를 가지기 때문에 동일한 배열의 값들을 사용한다.
//		따라서 복사된 배열에서 값을 변경하면 원본 배열의 값이 변경 된다.
		copyArr[0] = 1000;
		
		System.out.println(arr[0]);
	}

}
