package chap99_homework.homework0514;

public class NumSychronCls extends Thread {
	private NumberPrinter npt;
	
	public void setNpt(NumberPrinter npt) {
		this.npt = npt;
	}

	public NumberPrinter getNpt() {
		return this.npt;
	}
	
	@Override
	public void run() {
		npt.numPrint1(10);
	}
//	그리고 공유객체를 사용하며 numPrint1을 호출하는 스레드 클래스 1개와 numPrint2를 
	
//	호출하는 스레드 클래스 1개를 구현하고 메인스레드에서 두 개의 스레드를 실행하세요.

}
