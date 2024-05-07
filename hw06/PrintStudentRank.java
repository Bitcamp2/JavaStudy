package hw06;

import hw05.advance.ComStudent;
import hw05.advance.EngStudent;
import hw05.advance.MathStudent;
import hw05.advance.Student;

import java.util.ArrayList;
import java.util.Comparator;

public class PrintStudentRank {
    //학과별 배열을 만들어주는 메소드
    public void makMajorArr(Student[] stArr, int index) {

        //학과별로 새로운 배열 생성
        MathStudent[] mathStudent = new MathStudent[3];
        EngStudent[] engStudent = new EngStudent[3];
        ComStudent[] comStudent = new ComStudent[3];


        //성적순으로 출력
        ArrayList<Double> list = new ArrayList<>();
        list.add(0, mathStudent[0].getAvg());
        list.add(1, mathStudent[1].getAvg());
        list.add(2, mathStudent[2].getAvg());
        list.sort(Comparator.naturalOrder());
        System.out.println("수학과 성적순으로 출력.");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }

        list.add(0, engStudent[0].getAvg());
        list.add(1, engStudent[1].getAvg());
        list.add(2, engStudent[2].getAvg());
        list.sort(Comparator.naturalOrder());
        System.out.println("영어과 성적순으로 출력.");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }

        list.add(0, comStudent[0].getAvg());
        list.add(1, comStudent[1].getAvg());
        list.add(2, comStudent[2].getAvg());
        list.sort(Comparator.naturalOrder());
        System.out.println("컴공과 성적순으로 출력.");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }

        //위에서 생성한 세 개의 배열 매개변수로 전달
        printRankArray(mathStudent, engStudent, comStudent);
    }

    //학과별 배열을 성적순대로 정렬하고 출력하는 메소드
    public void majorRank(Student[] stArr, String major) {

    }

    //학과별 배열을 모두 받아서 majorRank로 전달하는 메소드
    public void printRankArray(MathStudent[] mathStudentArr, EngStudent[] engStudentArr, ComStudent[] comStudentArr) {
        majorRank(mathStudentArr, "수학");
        majorRank(engStudentArr, "영어");
        majorRank(comStudentArr, "컴공");
    }
}
