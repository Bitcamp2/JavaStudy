package _0510_.middle;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Middle1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, Integer> scoreMap = new HashMap<>();

        for (int i = 1; i <= 4; i++) {
            System.out.print("학생 " + i + "의 이름을 입력하세요: ");
            String name = sc.next();

            System.out.print("학생 " + i + "의 점수를 입력하세요: ");
            int score = sc.nextInt();

            scoreMap.put(name, score);
        }

        String highestScorer = "";
        int highestScore = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : scoreMap.entrySet()) {
            if (entry.getValue() > highestScore) {
                highestScore = entry.getValue();
                highestScorer = entry.getKey();
            }
        }

        System.out.println("최고점을 받은 학생은: " + highestScorer);
        System.out.println("최고점은: " + highestScore);

        sc.close();
    }
}
