package hw01;

public class Middle {
    public static void main(String[] args) {

        //1.
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 6 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        //2.
        int num = 1;

        while (num <= 10) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
            num++;
        }
        System.out.println();

        //3.
        sum = 0;

        System.out.print("2, 7의 공배수: ");
        for (int i = 1; i <= 1000; i++) {
            if (i % 14 == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.print("공배수 합: " + sum);
        System.out.println();

        //4.
        int[] arr = new int[20];
        int index = 1;
        int x = 0, y = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 101);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("값: ");
        for (int i = 0; i < arr.length; i++) {
            if (index % 2 != 0) {
                System.out.print(arr[x++] + " ");
            } else {
                System.out.print(arr[arr.length - (y++) - 1] + " ");
            }
            index++;
        }
        System.out.println();

        //5.
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i >= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //6.
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j >= 0; j--) {
                if (i < j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        //7.
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j >= 0; j--) {
                if (i <= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //8.
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i <= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
