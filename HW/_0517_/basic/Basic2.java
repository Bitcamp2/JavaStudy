package _0517_.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Basic2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> strList = new ArrayList<String>();


        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "번째 문자열: ");
            String input = sc.nextLine();
            strList.add(input);
        }

        System.out.println("길이가 5 이상인 문자열:");
        for (String str : strList) {
            if (str.length() >= 5) {
                System.out.println(str);
            }
        }

        sc.close();
    }
}
