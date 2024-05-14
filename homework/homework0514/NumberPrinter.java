package chap99_homework.homework0514;

public class NumberPrinter {
	private int num;
	
//		멤버변수로 int num을 가지고 정수형 매개변수를 받아 매개변수로 받아온 값은 num에 저장하고 // setNum
	public void setNum(int num) {
		this.num = num;
	}
	
//		num~50까지중 3의 배수를 출력하는 메소드 numPrint1(int num)과 
	public synchronized void numPrint1(int num) { //synchronized
		this.setNum(num);
		
		for(int i = this.num; this.num <= 50; this.num++) {
			if(this.num % 3 == 0) {
				System.out.println("3의 배수: " + this.num);
			}
			
			try {
				Thread.sleep(100);
			} catch(InterruptedException ie) {
				System.out.println(ie.getMessage());
			}
		}
	}
	
//		num~100까지 숫자 중 5와 7의 공배수를 출력하는 메소드 numPrint2(int num)를 구현하세요. 
	public void numPrint2(int num) {
		synchronized(this) {
			this.setNum(this.num);
		}
		for(int i = this.num; this.num <= 100; this.num++) {
			if(this.num % 5 == 0 || this.num % 7 == 0) {
				System.out.println("5와 7의 공배수: " + this.num);
			}
		}
	}
	

	
//		3. 공유객체로 사용될 클래스 NumberPrinter를 만들고 
		
//		그리고 공유객체를 사용하며 numPrint1을 호출하는 스레드 클래스 1개와 numPrint2를 
	
//		호출하는 스레드 클래스 1개를 구현하고 메인스레드에서 두 개의 스레드를 실행하세요.
//
//		4. 3번 문제에서 첫 스레드의 공유객체 점유가 끝날때까지 두 번째 스레드를 실행하지 못하도록 잠금 상태로 만드세요.
//
//		5. 3, 4번 문제에서 wait와 notify를 이용하여 스레드 두개가 각각 한 번씩 출력하도록 수정하세요.

	}


