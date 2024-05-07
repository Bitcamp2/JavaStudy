package hw06;

public class Mid02 {
    public static void main(String[] args) {

        char[] ch = new char[]{'b', 'c', 's', 'i', 'i', 'o', 'q', 'n', 't', 'm', 'l', 't'};

        String bit = "";
        bit += ch[0];
        bit += ch[3];
        bit += ch[8];

        String com = "";
        com += ch[1];
        com += ch[5];
        com += ch[9];

        String sql = "";
        sql += ch[2];
        sql += ch[6];
        sql += ch[10];

        String it = "";
        it += ch[4];
        it += ch[7];
        it += ch[11];

        System.out.println(bit);
        System.out.println(com);
        System.out.println(sql);
        System.out.println(it);
    }
}
