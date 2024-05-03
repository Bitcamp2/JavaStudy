package homework_05_02;

public class Mammal {
	int age;
	String size;
	boolean hasline;
	
	public Mammal() {
		
	}
	
	public Mammal(int age, String size, boolean hasline) {
		this.age = age;
		this.size = size;
		this.hasline = hasline;
	}
	
	
	public void run() {
		System.out.println("달린다.");
	}
	
	public void hunt() {
		System.out.println("사냥한다.");
	}
}
