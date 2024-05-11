package hw09;

import javax.swing.text.html.parser.Entity;
import java.util.*;

public class Mid03 {
    public static void main(String[] args) {

        //  3. Map<Integer, Integer>을 매개변수로 받아서 key는 정순 출력, value는 역순 출력하는 printKVDesc라는 메소드를 구현하세요.
        //  {1: 3, 2: 4, 3: 5}
        //  1 : 5
        //  2 : 4
        //  3 : 3

        Map<Integer, Integer> numMap = new HashMap<>();

        printKVDesc(numMap);
    }

    private static void printKVDesc(Map<Integer, Integer> numMap) {

        //  정순, 역순 담기위한 List 객체 생성
        List<Integer> numList1 = new ArrayList<>();
        List<Integer> numList2 = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("*** 숫자 입력 ***");
        for (int i = 0; i < 3; i++) {
            System.out.println("첫 번째 숫자 입력: ");
            int a = sc.nextInt();
            System.out.println("두 번째 숫자 입력: ");
            int b = sc.nextInt();

            numMap.put(a, b);
            numList1.add(a);
            numList2.add(b);
            System.out.println();
        }

        //  오름차순 정렬
        numList1.sort(Comparator.naturalOrder());
        numList2.sort(Comparator.naturalOrder());

        //  Map에 데이터 저장
        for (int i = 0; i < numMap.size(); i++) {
            numMap.put(numList1.get(i), numList2.get(numMap.size() - i - 1));
        }
        System.out.println(numMap);

        //  출력 형식에 맞추기위한 Entry
        Set<Map.Entry<Integer, Integer>> entrySet = numMap.entrySet();
        Iterator<Map.Entry<Integer, Integer>> iterator = entrySet.iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();

            if (entry != null) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
