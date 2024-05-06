package hw01;

import java.util.Scanner;

public class Advance {
    public static void main(String[] args) {

        //1.
        Scanner sc = new Scanner(System.in);
        System.out.println("금액 입력: ");
        int price = sc.nextInt();
        int fiveMillion = 0, oneMillion = 0, fiveThousand = 0, oneThousand = 0, fiveHundred = 0, oneHundred = 0, fifty = 0, ten = 0;

        if (price / 50000 != 0) {
            fiveMillion = price / 50000;
            oneMillion = (price % 50000) / 10000;
            fiveThousand = (price % 10000) / 5000;
            oneThousand = (price % 5000) / 1000;
            fiveHundred = (price % 1000) / 500;
            oneHundred = (price % 500) / 100;
            fifty = (price % 100) / 50;
            ten = (price % 50) / 10;
        } else if (price / 10000 != 0) {
            oneMillion = price / 10000;
            fiveThousand = (price % 10000) / 5000;
            oneThousand = (price % 5000) / 1000;
            fiveHundred = (price % 1000) / 500;
            oneHundred = (price % 500) / 100;
            fifty = (price % 100) / 50;
            ten = (price % 50) / 10;
        } else if (price / 5000 != 0) {
            fiveThousand = price / 5000;
            oneThousand = (price % 5000) / 1000;
            fiveHundred = (price % 1000) / 500;
            oneHundred = (price % 500) / 100;
            fifty = (price % 100) / 50;
            ten = (price % 50) / 10;
        } else if (price / 1000 != 0) {
            oneThousand = price / 1000;
            fiveHundred = (price % 1000) / 500;
            oneHundred = (price % 500) / 100;
            fifty = (price % 100) / 50;
            ten = (price % 50) / 10;
        } else if (price / 500 != 0) {
            fiveHundred = price / 500;
            oneHundred = (price % 500) / 100;
            fifty = (price % 100) / 50;
            ten = (price % 50) / 10;
        } else if (price / 100 != 0) {
            oneHundred = price / 100;
            fifty = (price % 100) / 50;
            ten = (price % 50) / 10;
        } else if (price / 50 != 0) {
            fifty = price / 50;
            ten = (price % 50) / 10;
        } else if (price / 10 != 0) {
            ten = price / 10;
        }

        System.out.println("오만원 " + fiveMillion + "매, 만원 " + oneMillion + "매, 오천원 " + fiveThousand + "매, 천원 " + oneThousand + "매, 500원 " + fiveHundred + "개, 100원 " + oneHundred +"개, 50원 " + fifty +"개, 10원 " + ten + "개");

        //2.
        System.out.println("1~99사이 정수 입력: ");
        int num = sc.nextInt();

        int tenNum = num / 10;
        int oneNum = num % 10;
        int clap = 0;

        if (tenNum == 3 || tenNum == 6 || tenNum == 9) {
            clap++;
        }
        if (oneNum == 3 || oneNum == 6 || oneNum == 9) {
            clap++;
        }
        if (clap == 2) {
            System.out.println("박수짝짝");
        } else {
            System.out.println("박수짝");
        }

        //3.
        for (int i = 0; i< 5; i++) {
            for (int j = 3; j >= 0 ; j--) {
                if (i > j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int h = 0; h < 5; h++) {
                if (i >= h) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
