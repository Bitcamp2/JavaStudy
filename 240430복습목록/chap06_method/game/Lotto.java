package chap06_method.game;

public class Lotto {
//	1. 1~45까지 숫자 중 랜덤 값 7개를 저장해서 배열로 리턴하는 메소드 generateLottoArray를 구현.
//	매개변수 없음
//	리턴할 배열을 만들어라.
//	기능구현 칸에 조건문을 넣을 수 있다. 리턴타입 배열이라 return칸에 배열타입의 변수lotto를 넣었다.
	
//  내 질문
//	기능구현 괄호 안에 for문을 넣어야하는가?
//	Math.random메소드를 사용하는 게 맞나?
//	배열 생성(선언)하는 법을 떠올리지 못함. (모른다고 봐야함)
	
	public int[] generateLottoArray() {
			int[] lotto = new int[7];
			
			for(int i = 0; i < lotto.length; i++) {
				lotto[i] = (int)(Math.random()*45) + 1;
				
				if(isDuplicated(lotto, i)) {
					i--;
				}
			}
			return lotto;
	}
	
	

	
//	2. 정수형 배열과 int 타입의 인덱스를 매개변수로 받아서 중복체크하는 메소드 isDuplicated를 구현하세요.
//	리턴타입 boolean형태 => 중복이 됐으면 true 리턴, 중복이 없으면 false 리턴
//	 매개변수???? 매개변수부터 어떻게 해야할지 몰랐음.
//	기능구현 괄호에 조건식 중첩도 쌉가능
//	변수를 몇개 만들어야할지 감을 못잡는듯 함.

	public boolean isDuplicated(int[] arr, int index) {
		for(int i = 0; i < index; i++) {
			if(arr[index] == arr[i]) {
				return true;
			}
		}
		
		return false;
	}
	

}
