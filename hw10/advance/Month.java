package hw10.advance;

public enum Month {

    JAN(31, 31), FAB(28, 29), MAR(31, 31), APR(30, 30), MAY(31, 31), JUN(30, 30),
    JUL(31, 31), AUG(30, 30), SEP(31, 31), OCT(30, 30), NOV(31, 31), DEC(30, 30),;

    private int fMonth;
    private int sMonth;

    Month(int fMonth, int sMonth) {
        this.fMonth = fMonth;
        this.sMonth = sMonth;
    }

    public int getfMonth() {
        return fMonth;
    }

    public void setfMonth(int fMonth) {
        this.fMonth = fMonth;
    }

    public int getsMonth() {
        return sMonth;
    }

    public void setsMonth(int sMonth) {
        this.sMonth = sMonth;
    }

}
