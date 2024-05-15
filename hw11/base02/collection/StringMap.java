package hw11.base02.collection;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMap {
    public static void main(String[] args) {

        // 5. List에 문자열을 저장하고 사용자가 입력한 문자열을 검색하여 해당 문자열의 인덱스를 출력하세요.

        List<String> stringList = new ArrayList<>();

        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");

        Scanner sc = new Scanner(System.in);

        System.out.print("문자 입력: ");
        String findStr = sc.next();

        System.out.print("해당문자 인덱스: ");
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).equals(findStr)) {
                System.out.println(i);
            }
        }

    }
}
