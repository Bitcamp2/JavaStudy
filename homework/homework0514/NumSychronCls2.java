package chap99_homework.homework0514;

public class NumSychronCls2 extends Thread {
	private NumberPrinter npt;
	
	public void setNpt(NumberPrinter npt) {
		this.npt = npt;
	}

	public NumberPrinter getNpt() {
		return this.npt;
	}
	
	@Override
	public void run() {
		npt.numPrint2(20);
	}
	
}
