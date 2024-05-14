package chap99_homework.homework0514.num5;

public class NumberPrinter5 {
	private int num;

	public void setNum(int num) {
		this.num = num;
	}

	public synchronized void numPrint1(int num) { //synchronized
		this.setNum(num);

		for(int i = this.num; this.num <= 50; this.num++) {
			if(this.num % 3 == 0) {
				System.out.println("3의 배수: " + this.num);

				notify();


				try {

					wait();

					//				Thread.sleep(100);
				} catch(InterruptedException ie) {
					System.out.println(ie.getMessage());
				}
			}
		}
	}

	public synchronized void numPrint2(int num) {
		this.setNum(this.num);

		for(int i = this.num; this.num <= 100; this.num++) {
			if(this.num % 5 == 0 || this.num % 7 == 0) {
				System.out.println("5와 7의 공배수: " + this.num);

				notify();


				try {

					wait();

				} catch(InterruptedException ie) {
					System.out.println(ie.getMessage());
				}

			}
		}
	}




}


