package homework_05_02;

public class Lion extends Felidae{
	Lion(){
		super("사자");
	}

	public void run() {
		System.out.println("네발로 달린다.");
	}
	
	public void hunt() {
		System.out.println("동물을 사냥한다.");
	}
	
}
