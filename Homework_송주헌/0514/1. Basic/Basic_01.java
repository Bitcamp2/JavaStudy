package homework_05_14;

public class Basic_01{

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		Thread subThread = new Thread() {
			@Override
			public void run() {
				for(int i = 1; i <= 20; i++) {
					if(30 % i == 0) {
						System.out.println("서브스레드 실행");
						System.out.println(i);
					}
				}
			} 
			
		};
		
		subThread.start();

		for(int i = 1; i <= 20; i++) {
			if(i % 3 == 0 && i % 4 == 0) {
				System.out.println("메인스레드 실행");
				System.out.println(i);
			}
		}
	}
}