package homework_05_14;

public class NumberPrinter {
	private int num;
	
	public int getNum() {
		return num;
		
	}
	
	public void setNum(int num) {
		this.num = num;
		
	}
	
	public synchronized void numPrint1(int num) {
		this.setNum(num);
		for(int i = 1; i <= 50; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
				notify();
				
				
			}
			try {
				wait();
			} catch() {
				
			}
		}
	}
	
	public void numPrint2(int num) {
		synchronized(this) {
			this.setNum(num);
		}
			for(int i = 1; i <= 100; i++) {
				if(i % 5 == 0 && i % 7 == 0) {
					System.out.println(i);
				}
			}
		}
	}
