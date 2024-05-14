package _0514_.basic;

public class Basic1 {
    public static void main(String[] args) {

        Thread thread = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 20; i++) {
                    if (i % 3 == 0 && i % 4 == 0) {
                        System.out.println("1~20 사이의 3과 4의 공배수: " + i);
                    }
                }
            }
        };

        thread.start();
        StringBuilder sb = new StringBuilder("30의 약수: ");
        for (int i = 1; i <= 20; i++) {
            if (30 % i == 0) {
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb.toString().trim());
    }
}

