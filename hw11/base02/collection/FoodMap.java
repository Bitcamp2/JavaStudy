package hw11.base02.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FoodMap {
    public static void main(String[] args) {

        // 2. Map을 이용해서 음식 이름과 가격을 저장하고 사용자가 입력한 음식의 이름과 수량으로 최종 금액을 출력하세요.

        Map<String, Integer> foodMap = new HashMap<>();
        foodMap.put("pizza", 5000);
        foodMap.put("chicken", 6000);

        Scanner sc = new Scanner(System.in);

        System.out.println("음식 이름: ");
        String foodName = sc.next();
        System.out.println("수량: ");
        int foodCount = sc.nextInt();

        System.out.println("최종 금액: " + (foodMap.get(foodName) * foodCount));


    }
}
