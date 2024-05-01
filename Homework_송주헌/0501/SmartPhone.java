package homework;

public class SmartPhone {

	public String company;
	
	public String model;
	
	public String OS;
	
	
	public SmartPhone() {
		this.company = "Apple";
		
		this.model = "iPhone 15 Pro";
				
		this.OS = "IOS";
	}


	public void takePhoneCall() {
		System.out.println("전화를 한다.");
	}
	
	public void takePic() {
		System.out.println("사진을 찍는다.");
	}
	
	public void playGame() {
		System.out.println("게임을 한다.");
	}
}