package _0515_basics2.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Collection3_4 {
    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

        Map<String, Integer> studentScores = new HashMap<>();

        // 사용자로부터 학생의 이름과 점수 입력 받기
        while (true) {
            System.out.print("학생의 이름을 입력하세요 (끝내려면 'q' 입력): ");
            String name = sc.nextLine();
            if (name.equals("q")) {
                break; // 'q' 입력 시 입력 종료
            }
            System.out.print("학생의 점수를 입력하세요: ");
            int score = sc.nextInt();
            sc.nextLine();

            // 입력받은 이름과 점수를 Map에 저장
            studentScores.put(name, score);
        }

        // 점수가 90점 이상인 학생의 이름 출력
        System.out.println("점수가 90점 이상인 학생:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            if (entry.getValue() >= 90) {
                System.out.println(entry.getKey());
            }
        }


        String highestScoringStudent = null;
        int highestScore = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            if (entry.getValue() > highestScore) {
                highestScore = entry.getValue();
                highestScoringStudent = entry.getKey();
            }
        }
        System.out.println("가장 높은 점수를 받은 학생:");
        System.out.println("이름: " + highestScoringStudent);
        System.out.println("점수: " + highestScore);


        sc.close();

    }


}
