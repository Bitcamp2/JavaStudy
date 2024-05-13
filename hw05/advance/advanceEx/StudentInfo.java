package hw05.advance.advanceEx;

public class StudentInfo {

    public int sno;
    public String name;
    public String[] subject;
    public int[] finalExamScore;

    public StudentInfo(int sno, String name) {
        this.sno = sno;
        this.name = name;
    }

    int index = 0;

    public void saveInfo(String subject, int finalExamScore) {
        this.subject[index] = subject;
        this.finalExamScore[index++] = finalExamScore;
    }

    public void printInfo() {
        System.out.println("학번: " + sno);
        System.out.println("이름: " + name);

        System.out.println("수강중인 과목 개수: " + subject.length);
        System.out.println("----------------------------------");
        for (int i = 0; i < subject.length; i++) {
            System.out.print("과목: " + subject[i]);
            System.out.println("점수: " + finalExamScore[i]);
        }

        System.out.println("평균: " + getAvg());
    }

    public double getAvg() {
        double sum = 0.0;

        for (int i = 0; i < subject.length; i++) {
            sum += finalExamScore[i];
        }

        return sum/finalExamScore.length;
    }
}
