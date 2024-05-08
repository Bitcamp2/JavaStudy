package hw07;

public class Mid01 {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer(30);

        sb.append("hello");

        int x = sb.capacity() - sb.length();
        //6b ,7i, 8t
        for (int i = 0; i < x; i++) {
            if (i % 3 == 0) {
                sb.append("b");
            } else if (i % 3 == 1) {
                sb.append("i");
            } else if (i % 3 == 2) {
                sb.append("t");
            }
        }
        System.out.println(sb);
    }
}
