package homework_05_03;

public class HybridCar implements ElectronicCar, FuelCar {

	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		System.out.println("하이브리드 차량의 속력을 높인다.");
	}

	@Override
	public void speedDown() {
		// TODO Auto-generated method stub
		System.out.println("하이브리드 차량의 속력을 낮춘다.");
	}

	@Override
	public void addFuel() {
		// TODO Auto-generated method stub
		System.out.println("하이브리드 차량에 연료를 주입한다.");
	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		System.out.println("하이브리드 차량의 배터리를 충전한다.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HybridCar hCar = new HybridCar();
		hCar.speedDown();
		hCar.speedUp();
		hCar.addFuel();
		hCar.charge();
		

			
	}

}
