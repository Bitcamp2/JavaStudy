package hw05.advance;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {

        MainPage mainPage = new MainPage();

        Scanner sc = new Scanner(System.in);

        Student[] stArr = new Student[1000];

        while (true) {
            mainPage.printMenu(sc, stArr);
        }
    }
}
