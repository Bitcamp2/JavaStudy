package homework_05_03;

import java.util.Scanner;

public class MathStudent extends CommonStat implements Student {

	Scanner scanner = new Scanner(System.in);
	
	@Override
	public void saveInfo(int index, String name) {
		// TODO Auto-generated method stub
		System.out.println("학생 번호");	
		sno = scanner.nextInt();
		System.out.println("학생 이름");
		name = scanner.nextLine();
		
		System.out.println("학생정보를 저장한다.");
	}

	@Override
	public void printInfo(String name, int sno) {
		// TODO Auto-generated method stub
		System.out.println("학생정보:" + name + "학번- " + sno);
	}

	@Override
	public double getAvg() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
