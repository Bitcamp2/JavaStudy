package circle;

public class Circle {


		
	public double pi = 3.14;
	public int radius;
	
	public Circle() {
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double circumference() {
		return (double)2 * pi * radius;
	}
	
	public double circleArea() {
		return (double)pi * radius * radius;
	}
}
	