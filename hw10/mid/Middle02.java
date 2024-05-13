package hw10.mid;

public class Middle02 {
    public static void main(String[] args) {


        //  2.  Number 클래스를 상속받은 클래스만 지정가능한 제네릭 클래스를 만들고
        //  T 배열을 매개변수로 받아서 합, 차, 곱셈, 나눗셈을 연산해주는 메소드를 구현하세요.
        //  각 메소드는 double로 리턴하고 add, sub, mul, div로 메소드명을 갖습니다.(Math.round()로 소수점 두자리까지만 표출)
        double[] intArr = new double[]{1.22, 2.31, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("합: " + add(intArr));
        System.out.println("차: " + sub(intArr));
        System.out.println("곱: " + mul(intArr));
        System.out.println("나누기: " + div(intArr));

    }

    public static <T extends Number> double add(double[] T) {
        double sum = 0;

        for (double i : T) {
            sum += i;
        }

        return (double) Math.round(sum * 100) / 100;
    }

    public static <T extends Number> double sub(double[] T) {
        double sub = 0;

        for (double i : T) {
            sub -= i;
        }

        return (double)Math.round(sub * 100) / 100;
    }

    public static <T extends Number> double mul(double[] T) {
        double mul = T[0];

        for (int i = 1; i < T.length; i++) {
            mul = mul * T[i];
        }

        return (double)Math.round(mul * 100) / 100;
    }

    public static <T extends Number> double div(double[] T) {
        double div = T[0];

        for (int i = 1; i < T.length; i++) {
            div = div / T[i];
        }
        return (double)Math.round(div * 100) / 100;
    }
}
