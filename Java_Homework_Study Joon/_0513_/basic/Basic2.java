package _0513_.basic;

public class Basic2 {
    public static <T> String add(T t1, T t2){
        return String.valueOf(t1) + String.valueOf(t2);
    }

    public static void main(String[] args) {
        String result1 = Basic2.add(1, 2);
        System.out.println(result1);

        String result2 = Basic2.add("a", "b");
        System.out.println(result2);
    }
}
