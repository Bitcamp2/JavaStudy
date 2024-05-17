package _0517_.middle;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Middle1_2 {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "홍길동", 100, "A"));
        studentList.add(new Student(2, "임꺽정", 75, "C"));
        studentList.add(new Student(3, "장길산", 86, "B"));
        studentList.add(new Student(4, "정도전", 97, "A"));
        studentList.add(new Student(5, "이순신", 95, "A"));

        // 1번
        List<Student> highScoringStudents = studentList.stream()
                .filter(student -> student.getScore() >= 95)
                .collect(Collectors.toList());

        System.out.println("점수가 95점 이상인 학생들: " + highScoringStudents);

        // 2번
        List<Student> updatedGradeStudents = highScoringStudents.stream()
                .map(student -> new Student(student.getSno(), student.getsName(), student.getScore(), "A+"))
                .collect(Collectors.toList());

        System.out.println("점수가 95점 이상인 학생들 (grade를 A+로 변경): " + updatedGradeStudents);
    }
}
