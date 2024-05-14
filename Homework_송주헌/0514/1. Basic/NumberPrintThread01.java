package homework_05_14;

public class NumberPrintThread01 extends Thread {
	private NumberPrinter numberPrinter;
	
	public void setNp(NumberPrinter numberPrinter) {
		this.numberPrinter = numberPrinter;
		
	}
	
	public NumberPrinter getNp() {
		return this.numberPrinter;
		
	}
	
	@Override
	public void run() {
		numberPrinter.numPrint1(10);
	}
}
