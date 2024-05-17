package _0517_.middle;

public class Student {

    private int sno;
    private String sName;
    private int score;
    private String grade;

    public Student(int sno, String sName, int score, String grade) {
        this.sno = sno;
        this.sName = sName;
        this.score = score;
        this.grade = grade;
    }

    public int getSno() {
        return sno;
    }

    public String getsName() {
        return sName;
    }

    public int getScore() {
        return score;
    }

    public String getGrade() {
        return grade;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +  "sno=" + sno +  ", sName='" + sName + '\''
                          + ", score=" + score + ", grade='" + grade + '\'' + '}';
    }

}
