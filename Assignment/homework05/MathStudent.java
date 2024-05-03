package chap99_Homework.homework05;

public class MathStudent extends CommonStat implements Student {
	int index = 0;
	
	@Override
	public void saveInfo() {
		this.sno = 1;
		this.name = "홍길동";
		this.subject[index] = "Math";
		this.finalExamScore[index] = 100;
		index++;
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("학번: "+this.sno);
		System.out.println("이름: "+this.name);
		System.out.println("과목: "+this.subject[index]);
		System.out.println("점수: "+this.finalExamScore[index]);
		
	}

	@Override
	public double getAvg() {
		return this.finalExamScore[index];
	}

}
