package _0510_.basic;

import java.util.HashMap;
import java.util.Scanner;

public class Basic2 {
    public static void main(String[] args) {

        // Hashmap을 사용해서 주소록을 만들어준다.
        HashMap<String, Integer> addressBook = new HashMap<>();

        // 사용자 입력.
        Scanner sc = new Scanner(System.in);

        System.out.println("주소록에 추가 할 이름을 입력하세요.");
        String inputName = sc.nextLine();
        System.out.println("추가할 번호를 입력하세요.");
        String inputNum = sc.nextLine();

        inputNum = String.valueOf(inputNum);

        addressBook.put(inputName, Integer.parseInt(inputNum));

        System.out.println("조회할 이름을 입력하세요.");
        String inputSearch = sc.nextLine();


        // 조회 부분 구성
        // 한국번호는 0으로 시작하는데,
        // String.valueOf를 사용하면 0으로 시작하지 않는다.(해당 숫자가 정수형으로 표현)
        String searchedNum = String.valueOf(addressBook.get(inputSearch));

        if(searchedNum != null) {
            System.out.println(inputSearch + "의 전화번호는: 0" + searchedNum);
        } else {
            System.out.println("없는 번호입니다.");
        }

        sc.close();
    }
}
