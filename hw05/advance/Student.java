package hw05.advance;

public interface Student {

    void saveInfo(int index, String subject, int score);
    void printInfo();
    double getAvg();
    int getSno();
    StringBuffer getName();
    void initSubScore(int cnt);

}
