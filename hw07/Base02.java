package hw07;

public class Base02 {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer(30);

        sb.append("hello");

        int x = sb.capacity() - sb.length();

        for (int i = 0; i < x; i++) {
            sb.append("a");
        }

        System.out.println(sb);
    }
}
