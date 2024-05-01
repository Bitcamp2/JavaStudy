package _240501_.basic;

public class Rect {

    public int width;
    public int height;

    public Rect() {

    }

    public Rect(int width, int height) {
    this.height = height;
    this.width = width;
    }

    public int circumference() {
        return width * height;
    }



}
