package _0513_.advance;

import java.util.Scanner;

public enum Months {

    JAN(31, 31),
    FEB(28, 29),
    MAR(31, 31),
    APR(30, 30),
    MAY(31, 31),
    JUNE(30, 30),
    JULY(31, 31),
    AUG(31, 31),
    SEP(30, 30),
    OCT(31, 31),
    NOV(30, 30),
    DEC(31, 31);

    private final int nLeapYear;
    private final int LeapYear;

    Months(int nLeapYear, int leapYear) {
        this.nLeapYear = nLeapYear;
        LeapYear = leapYear;
    }

    public int getDays(int year) {
        return isLeapYear(year) ? LeapYear : nLeapYear;
    }

    private boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();
        scanner.close();

        int sum = sumDays(year);
        System.out.println("1월부터 5월까지의 일수: " + sum);
    }

    public static int sumDays(int year) {
        int sum = 0;
        for (Months months : Months.values()) {
            sum += months.getDays(year);
            if (months.ordinal() == 4)
                break;
        }
        return sum;
    }
}

