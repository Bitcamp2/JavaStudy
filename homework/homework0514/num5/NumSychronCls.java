package chap99_homework.homework0514.num5;

public class NumSychronCls extends Thread {
	private NumberPrinter5 npt;
	
	public void setNpt(NumberPrinter5 npt) {
		this.npt = npt;
	}

	public NumberPrinter5 getNpt() {
		return this.npt;
	}
	
	@Override
	public void run() {
		npt.numPrint1(10);
	}
//	그리고 공유객체를 사용하며 numPrint1을 호출하는 스레드 클래스 1개와 numPrint2를 
	
//	호출하는 스레드 클래스 1개를 구현하고 메인스레드에서 두 개의 스레드를 실행하세요.

}
