package _0515_basics2.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Collection2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();

        System.out.println("음식 이름과 가격을 입력하세요. 입력을 마치려면 빈 문자열을 입력하세요.");


        while (true) {
            System.out.print("음식 이름: ");
            String foodName = sc.nextLine();
            if (foodName.isEmpty()) {
                break; // 빈 문자열이 입력되면 입력 종료
            }
            System.out.print("가격: ");
            int price = sc.nextInt();
            sc.nextLine();

            // 입력받은 음식과 가격을 Map에 저장
            map.put(foodName, price);
        }

        System.out.print("음식 이름을 입력하세요: ");
        String foodName = sc.nextLine();
        System.out.print("수량을 입력하세요: ");
        int quantity = sc.nextInt();

        // 사용자가 입력한 음식의 가격과 수량으로 최종 금액 계산
        int totalPrice = 0;
        if (map.containsKey(foodName)) {
            int price = map.get(foodName);
            totalPrice = price * quantity;
            System.out.println("총 금액은 " + totalPrice + "원 입니다.");
        } else {
            System.out.println("죄송합니다. 해당 음식이 메뉴에 없습니다.");

        }
        sc.close();

    }
}
