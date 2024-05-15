package _0515_basics2._class;

import java.util.Scanner;

public class Circle {

    // 속성(멤버 변수)
    private double radius;

    // 생성자
    public Circle(double radius) {
        this.radius = radius;
    }

    // 원의 넓이를 계산하여 반환하는 메소드
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // 원의 둘레를 계산하여 반환하는 메소드
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 반지름 입력 받기
        System.out.print("반지름을 입력하세요: ");
        double radius = sc.nextDouble();

        // 원 객체 생성
        Circle circle = new Circle(radius);

        // 원의 넓이와 둘레 출력
        System.out.println("원의 넓이: " + circle.calculateArea());
        System.out.println("원의 둘레: " + circle.calculatePerimeter());

        sc.close();
    }
}
