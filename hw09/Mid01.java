package hw09;

import java.util.*;

public class Mid01 {
    public static void main(String[] args) {

        //  1. 학생이름을 key로 시험점수를 value로 가지는 Map<String, Integer>를 생성하고
        //  4명의 학생 데이터를 입력한 후 4명 중 최고 점을 맞은 학생의 이름과 점수을 출력하세요.(이름 : 90)

        //  이름과 성적을 저장하는 Map 생성
        Map<String, Integer> scoreMap = new HashMap<>();

        //  학생 등수를 체크할 List 생성
        List<Integer> scoreList = new ArrayList<>();

        //   4명의 학생 데이터 입력
        Scanner sc = new Scanner(System.in);
        System.out.println("*** 성적 입력 ***");
        for (int i = 0; i < 4; i++) {
            System.out.print("이름 입력: ");
            String name = sc.next();
            System.out.print("점수 입력: ");
            int score = sc.nextInt();

            scoreMap.put(name, score);
            scoreList.add(score);
            System.out.println();
        }

        //  최고점 학생 체크
        //  오름차순으로 정렬
        scoreList.sort(Comparator.naturalOrder());

        //  점수만 알고, 키값을 모르기대문에 KeySet 사용
        Set<String> keySet = scoreMap.keySet();
        Iterator<String> iterator = keySet.iterator();

        //  KeySet 사용해서 최고점맞은 학생 찾기
        while (iterator.hasNext()) {
            String findName = iterator.next();

            if (scoreMap.get(findName) == scoreList.get(scoreList.size() - 1)) {
                System.out.println("최고점 학생: " + findName + ", 점수: " + scoreMap.get(findName));
            }
        }
    }
}