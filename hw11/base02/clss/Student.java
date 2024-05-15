package hw11.base02.clss;

public class Student {

    // 1. 학생의 이름, 학번, 학과를 속성으로 가지고 학생의 정보를 저장하는 메소드와 학생의 정보를 출력하는 메소드를 갖는 학생 클래스를 생성하세요.

    private String name;
    private int eno;
    private  String subject;

    public Student(String name, int eno, String subject) {
        this.name = name;
        this.eno = eno;
        this.subject = subject;
    }

    public void printStudentInfo() {
        System.out.println("*** 학생 정보 ***");
        System.out.println("학번: " + eno);
        System.out.println("이름: " + name);
        System.out.println("학과: " + subject);
    }
}
