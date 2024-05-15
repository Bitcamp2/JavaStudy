package hw11.base02.clss;

public class Addclss {

    // 7. Add라는 클래스를 만들고 정수형 매개변수 2개를 받아서 합을 리턴하는 add 메소드를 구현하세요.
    //    그리고 오버로딩을 통해 정수형 매개변수 세개를 받아서 각각의 제곱의 합을 리턴하는 add메소드도 구현하세요.

    public int sumAdd(int a, int b) {
        return a + b;
    }

    // 오버로딩
    public int sumAdd(int a, int b, int c) {
        return (a * a) + (b * b) + (c * c);
    }
}
