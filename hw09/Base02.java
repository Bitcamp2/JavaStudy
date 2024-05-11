package hw09;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Base02 {
    public static void main(String[] args) {

        //  2. 이름과 전화번호를 쌍으로 하는 주소록을 HashMap으로 구현하고
        //  특정 이름의 전화번호를 조회하는 기능을 구현하세요.

        //  이름과 전화번호를 저장하는 Map 생성
        Map<String, Object> addressMap = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("*** 주소록 입력 ***");
        for (int i = 0; i < 5; i++) {
            System.out.print("이름을 입력하세요: ");
            String name = sc.nextLine();
            System.out.print("번호를 입력하세요: ");
            String calNum = sc.nextLine();

            addressMap.put(name, calNum);
            System.out.println();
        }

        //  찾는 사람 입력
        System.out.print("찾는분: ");
        String findName = sc.nextLine();

        //  Map에 찾는 이름이 있는지 체크 -> containsKey()
        if (addressMap.containsKey(findName)) {
            System.out.println("찾으시는분 번호: " + addressMap.get(findName));
        } else {
            System.out.println("없는 번호 입니다.");
        }
    }
}
