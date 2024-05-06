package hw05;

import java.util.ArrayList;

public class Reverse {

    public String reverseString(String str) {
        char[] ch = str.toCharArray();
        char[] rev = new char[ch.length];

        for (int i = 0; i < ch.length; i++) {
            rev[i] = ch[ch.length - 1 - i];
        }
        String result = String.valueOf(rev);
        return result;
    }

    public String dupString(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public String mulString(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            if (i % 15 == 0 && i != 0) {
                answer += 35;
            } else if (i % 5 == 0 && i != 0) {
                answer += 5;
            } else if (i % 3 == 0 && i != 0) {
                answer += 3;
            } else {
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        System.out.println(reverse.mulString("aaaaaaaaaaaaaaaa"));
    }
}
