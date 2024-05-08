package hw06;

public class Mid02 {
    public static void main(String[] args) {

        char[] ch = new char[]{'b', 'c', 's', 'i', 'i', 'o', 'q', 'n', 't', 'm', 'l', 't'};

        String[] stArr = {"", "", "", ""};


        for (int i = 0; i < ch.length; i++) {
            if (i % 4 == 0) {
                stArr[0] += ch[i];
            } else if (i % 4 == 1) {
                stArr[1] += ch[i];
            } else if (i % 4 == 2) {
                stArr[2] += ch[i];
            } else if (i % 4 == 3) {
                stArr[3] += ch[i];
            }
        }

        for (String s : stArr) {
            System.out.println(s);
        }


        // 문자열 배열의 값을 다시 문자배열에 담기
        String bit = "bit";
        String com = "com";
        String sql = "sql";
        String intStr = "int";

        char[] ch2 = new char[ch.length];

        for (int i = 0; i < ch.length; i++) {
            if (i % 4 == 0) {
                ch2[i] = bit.charAt(i / 4);
                //인덱스를 4로 나눈 나머지가 0일때 bit -> 0, 4, 8
            } else if (i % 4 == 1) {
                ch2[i] = com.charAt(i / 4);
                //인덱스를 4로 나눈 나머지가 1일때 com -> 1, 5, 9
            } else if (i % 4 == 2) {
                ch2[i] = sql.charAt(i / 4);
                //인덱스를 4로 나눈 나머지가 2일때 sql -> 2, 6, 10
            } else if (i % 4 == 3) {
                ch2[i] = intStr.charAt(i / 4);
                //인덱스를 4로 나눈 나머지가 3일때 int  -> 3, 7, 11
            }
        }

        for (char c : ch2) {
            System.out.print(c + " ");
        }
    }
}
