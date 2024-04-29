package middle;

public class middle5 {
    public static void main(String[] args) {

        // 5-1.
        for(int i=0;i<5;i++) {
            for (int j = 0; j <= i; j++) System.out.print("*");
            System.out.println();
        }
        System.out.println("----------------");

        // 5-2
        for(int i=0;i<5;i++) {
            for (int j = 0; j < 5 - i; j++) System.out.print(" ");
            for (int j = 0; j <= i; j++) System.out.print("*");
            System.out.println();
        }
        System.out.println("----------------");

        // 5-3
        for(int i=0;i<5;i++) {
            for (int j = 0; j < 5 - i; j++) System.out.print("*");
            System.out.println();
        }
        System.out.println("----------------");

        // 5-4
        for(int i=0;i<5;i++) {
            for(int j=0;j<i;j++) System.out.print(" ");
            for(int j=0;j<5-i;j++) System.out.print("*");
            System.out.println();
        }

    }
}
