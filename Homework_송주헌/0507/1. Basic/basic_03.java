package homework_05_07;

public class basic_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double number = 16.459;
		double roundedNumber = roundToTwoDecimalPlaces(number);
		System.out.println(roundedNumber);
		
	}

	public static double roundToTwoDecimalPlaces(double number) {
		// TODO Auto-generated method stub
		return Math.round(number * 100.0) / 100.0;
	}
	
	
	
}
