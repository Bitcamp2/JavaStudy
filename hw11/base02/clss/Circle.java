package hw11.base02.clss;

public class Circle {

    // 5. 반지름을 속성으로 갖는 원클래스를 만들고 사용자가 입력한 반지름이 생성자를 통해
    // 속성에 저장되며 원의 넓이와 둘레를 구해서 리턴하는 메소드를 각각 구현하세요.

    private int radius;
    private final double PI = 3.14;


    public Circle(int radius) {
        this.radius = radius;
    }

    public double circleArea() {
        return radius * radius * PI;
    }

    public double circleWidth() {
        return 2 * radius * PI;
    }
}
