package hw13.mid;

public class Student {

    //// 1. int sno, String sName, int score, String grade를 갖는 Student 클래스를 만들고
    private int sno;
    private String sName;
    private int score;
    private String grade;

    public Student(int sno, String sName, int score) {
        this.sno = sno;
        this.sName = sName;
        this.score = score;
    }

    public Student(int sno, String sName, int score, String grade) {
        this.sno = sno;
        this.sName = sName;
        this.score = score;
        this.grade = grade;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", sName='" + sName + '\'' +
                ", score=" + score +
                ", grade='" + grade + '\'' +
                '}';
    }
}
