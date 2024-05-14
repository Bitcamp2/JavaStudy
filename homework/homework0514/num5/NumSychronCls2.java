package chap99_homework.homework0514.num5;

public class NumSychronCls2 extends Thread {
	private NumberPrinter5 npt;
	
	public void setNpt(NumberPrinter5 npt) {
		this.npt = npt;
	}

	public NumberPrinter5 getNpt() {
		return this.npt;
	}
	
	@Override
	public void run() {
		npt.numPrint2(20);
	}
	
}
