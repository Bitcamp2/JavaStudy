package hw09;


import java.util.*;

public class Advance01 {
    public static void main(String[] args) {

        //  1. 사용자가 입력한 문자열에서 가장 많이 등장하는 문자와 그 개수를 출력하세요.
        //  (Map<Character, Integer> 형태의 Map과 Entry 사용)

        // 문자열 입력받고
        // 문자열 전부 char로 자르고
        // cnt 카운팅
        // cnt 젤높은값 엔트리로 키값 벨류값 찾기

        Map<Character, Integer> cntMap = new HashMap<>();
        List<Integer> numList = new ArrayList<>();

        //  문자열 입력받고
        Scanner sc = new Scanner(System.in);

        //  char배열에 한글자씩 저장
        System.out.println("문자 입력: ");
        char[] ch = sc.nextLine().toCharArray();

        //  중복 체크
        for (int i = 0; i < ch.length; i++) {
            int cnt = 1;
            for (int j = 0; j < ch.length; j++) {
                if (i != j) {
                    if (ch[i] == ch[j]) {
                        cnt++;

                        cntMap.put(ch[i], cnt);
                        numList.add(cnt);
                    }
                }
            }
        }

        numList.sort(Comparator.naturalOrder());

        Set<Map.Entry<Character, Integer>> entrySet = cntMap.entrySet();
        Iterator<Map.Entry<Character, Integer>> iterator = entrySet.iterator();

        while (iterator.hasNext()) {
            Map.Entry<Character, Integer> entry = iterator.next();

            if (entry.getValue() == numList.get(numList.size() - 1)) {
                System.out.println("가장 많이 나온 문자: " + entry.getKey() + ", 개수: " + entry.getValue());
            }
        }
    }
}
