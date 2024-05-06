package hw02;

public class Middle {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5};
        char[] ch = {'y', 'B', 'c', 'D'};

        reverse(arr);
        System.out.println();
        change(ch);

        }

    public static void reverse(int[] arr) {
        int[] revArr = new int[arr.length];

        for (int i = 0; i < revArr.length; i++) {
            revArr[i] = arr[arr.length - 1 - i];
        }

        for (int i : revArr) {
            System.out.print(i + " ");
        }
    }

    public static void change(char[] ch) {
        char[] change = new char[ch.length];

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 65 && ch[i] <= 90) {
                if (ch[i] == 65) {
                    change[i] = (char)(ch[i] + 57);
                } else {
                    change[i] = (char) (ch[i] + 31);
                }
            } else if (ch[i] >= 95 && ch[i] <= 122) {
                if (ch[i] == 122) {
                    change[i] = (char) (ch[i] - 57);
                } else {
                    change[i] = (char) (ch[i] - 31);
                }
            }
        }
        for (char c : change) {
            System.out.print(c + " ");
        }
    }
}
