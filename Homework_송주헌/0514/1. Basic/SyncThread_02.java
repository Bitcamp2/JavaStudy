package homework_05_14;

public class SyncThread_02 extends Thread {

	private NumberPrinter np;
	
	public NumberPrinter getNp() {
		return np;
		
	}
	
	public void setNp(NumberPrinter np) {
		this.np = np;
		
	}
	
	public void run() {
		np.numPrint2(20);
}
}