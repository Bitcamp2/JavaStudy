package _0515_basics2.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collection7 {
    public static void main(String[] args) {

        // 현대차의 차종과 판매량을 저장하는 Map 생성
        Map<String, Integer> hyundaiSales = new HashMap<>();
        hyundaiSales.put("아반떼", 3000);
        hyundaiSales.put("소나타", 4000);
        hyundaiSales.put("그랜저", 8000);

        // 기아차의 차종과 판매량을 저장하는 Map 생성
        Map<String, Integer> kiaSales = new HashMap<>();
        kiaSales.put("K5", 3000);
        kiaSales.put("K7", 6000);
        kiaSales.put("K9", 2000);

        // 현대차와 기아차의 Map을 List에 저장
        List<Map<String, Integer>> carSalesList = new ArrayList<>();
        carSalesList.add(hyundaiSales);
        carSalesList.add(kiaSales);

        // 각 회사별로 가장 판매량이 높은 차종의 Entry를 뽑아서 새로운 List에 저장
        List<Map.Entry<String, Integer>> highestSalesByCompany = new ArrayList<>();
        for (Map<String, Integer> carSales : carSalesList) {
            Map.Entry<String, Integer> maxEntry = null;
            for (Map.Entry<String, Integer> entry : carSales.entrySet()) {
                if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                    maxEntry = entry;
                }
            }
            highestSalesByCompany.add(maxEntry);
        }

        // 결과 출력
        System.out.println("각 회사별 가장 판매량이 높은 차종:");
        for (Map.Entry<String, Integer> entry : highestSalesByCompany) {
            System.out.println("차종: " + entry.getKey() + ", 판매량: " + entry.getValue());
        }

    }
}
