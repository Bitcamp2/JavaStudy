package hw11.base02.collection;

import java.util.*;

public class CarMap {
    public static void main(String[] args) {

        //    7. 현대차의 차종과 판매량을 저장하는 Map 한 개와 기아차의 차종과 판매량을 저장하는 Map 한 개를 만들어서
        //    List에 둘 다 저장합니다. 회사별로 가장 판매량이 높은 차종의 Entry를 뽑아서 새로운 List에 저장하고
        //    출력하세요. (현대 차종은 아반떼, 소나타, 그랜저 기아 차종은, k5, k7, k9, 판매량은 마음대로 정하시면 됩니다.)

        Map<String, Integer> hcMap = new HashMap<>();
        Map<String, Integer> kMap = new HashMap<>();

        List<Map<String, Integer>> saleMap = new ArrayList<>();

        hcMap.put("아반떼", 3);
        hcMap.put("소나타", 5);
        hcMap.put("그렌저", 2);
        saleMap.add(hcMap);

        kMap.put("k5", 3);
        kMap.put("k7", 4);
        kMap.put("k9", 1);
        saleMap.add(kMap);

        List<Map.Entry<String, Integer>> highestSales = new ArrayList<>();

        for (Map<String, Integer> companyMap : saleMap) {
            Map.Entry<String, Integer> maxEntry = null;
            for (Map.Entry<String, Integer> entry : companyMap.entrySet()) {
                if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                    maxEntry = entry;
                }
            }
            highestSales.add(maxEntry);
        }

        for (Map.Entry<String, Integer> entry : highestSales) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
