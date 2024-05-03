package homework_05_01;

public class Rect {
	
	public int width;
	public int height;
	
	public Rect() {
		
	}
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
		
	}
	
	public int circumference() {
		return 2 * (this.width + this.height);
	
	}
	
	public int area() {
		return this.width * this.height;
		
	}
}
