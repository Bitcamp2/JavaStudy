package hw11.base02.collection;

import java.util.*;

public class StudentMap {
    public static void main(String[] args) {

        // 3. Map을 이용해서 학생의 이름과 점수를 저장하고 점수가 90점 이상인 학생의 이름을 모두 출력하세요.
        // 4. 3번에서 사용한 Map에서 점수가 가장 높은 학생의 이름과 점수를 출력하세요.

        Map<String, Integer> studentMap = new HashMap<>();
        List<Integer> maxList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("이름: ");
            String name = sc.next();
            System.out.print("점수: ");
            int score = sc.nextInt();

            studentMap.put(name, score);
            maxList.add(score);
        }
        maxList.sort(Comparator.naturalOrder());

        System.out.print("90점 이상인 학생: ");
        for (String findName : studentMap.keySet()) {
            if (studentMap.get(findName) >= 90) {
                System.out.print(findName + " ");
            }
        }

        System.out.println();
        for (Map.Entry<String, Integer> findStudent : studentMap.entrySet()) {
            if (maxList.getLast() == findStudent.getValue()) {
                System.out.println("최고점 학생: " + findStudent.getKey() + ", 점수: " + findStudent.getValue());
            }
        }

//        Set<String> keySet = studentMap.keySet();
//        Iterator<String> iterator = keySet.iterator();
//
//        System.out.print("90점 이상인 학생: ");
//        while (iterator.hasNext()) {
//            String findName = iterator.next();
//
//            if (studentMap.get(findName) >= 90) {
//                System.out.print(findName + " ");
//            }
//        }
    }
}
