package hw05.advance;

public class MathStudent extends CommonStat implements Student {

    public MathStudent() {
        super();
    }

    public MathStudent(int sno, StringBuffer name) {
        super(sno, name);
    }

    @Override
    public void saveInfo(int index, String subject, int score) {
        this.subject[index] = subject;
        this.finalExamScore[index] = score;
    }

    @Override
    public void printInfo() {
        System.out.println("학번: " + sno);
        System.out.println("이름: " + name);
        System.out.println("평균: " + getAvg());
        System.out.println("----------------------");
    }

    @Override
    public double getAvg() {
        int sum = 0;

        for (int i = 0; i < subject.length; i++) {
            sum += finalExamScore[i];
        }
        return (double) Math.round(((double) sum / subject.length) * 100) / 100;
    }

    @Override
    public int getSno() {
        return this.sno;
    }

    @Override
    public StringBuffer getName() {
        return this.name;
    }

    @Override
    public void initSubScore(int cnt) {
        this.subject = new String[cnt];
        this.finalExamScore = new int[cnt];
    }
}
