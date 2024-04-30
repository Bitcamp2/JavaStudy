package chap06_method.score;

public class Score {
	
//	1. int형 배열(점수배열)을 매개변수로 받아서 점수의 총합을 int형으로 리턴하는 메소드 getTotalScore를 구현하라.
	public int getTotalScore(int[]scores) {
		int sum = 0;
		
//		for문이 어떻게 추가되어야 하는지 몰랐다.
//		sum을 무엇과 더해야하는지 몰랐다.
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		 return sum;
	}
	
//	2. int형 배열(점수배열)을 매개변수로 받아서 점수의 평균을 double형으로 리턴하는 메소드
	public double getAvgScroe(int[] scores) {
		return (double)getTotalScore(scores) / scores.length;
				}
	
	
	
//	int형 배열(점수배열)을 매개변수로 받아서 점수의 총합을 int형으로 리턴하는 메소드 getTotalScore를 구현하라.
	
	// {1,2,3}
//	public int getTotalScore(int[]scores) {
//		int sum = 0;
//		for()
//		sum += i;
//				
//	}
//			
//		return;
//	}
	
	
//	2. int형 배열(점수배열)을 매개변수로 받아서 점수의 평균을 double형으로 리턴하는 메소드
	

}
