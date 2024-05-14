package chap99_homework.homework0514.num5;

public class Basic_5_Use {

	public static void main(String[] args) {
//		구현하고 메인스레드에서 두 개의 스레드를 실행하세요.

		NumberPrinter5 npt = new NumberPrinter5();
		
		NumSychronCls nsc1 = new NumSychronCls();
		NumSychronCls2 nsc2 = new NumSychronCls2();
		
		
		nsc1.setNpt(npt);
		nsc2.setNpt(npt);
		
		nsc1.start();
		nsc2.start();
		
		
//		 
	
//
//		4. 3번 문제에서 첫 스레드의 공유객체 점유가 끝날때까지 두 번째 스레드를 실행하지 못하도록 잠금 상태로 만드세요.
//
//		5. 3, 4번 문제에서 wait와 notify를 이용하여 스레드 두개가 각각 한 번씩 출력하도록 수정하세요.

	}

}
