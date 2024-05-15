package _0515_basics1.operator;

public class Operator2 {
    public static void main(String[] args) {

        int num = 20;
                                   // 출력값, 값
        System.out.println(++num); // 21,21
        System.out.println(++num); // 22,22
        System.out.println(num--); // 22,21
        System.out.println(num--); // 21,20
        System.out.println(num); // 20,20
        System.out.println(num--); // 20,19
        System.out.println(num++); // 19,19
        System.out.println("증감연산자 없이: " + num); // 20

    }
}
