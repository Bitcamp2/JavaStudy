package hw12.base01;

import java.util.Scanner;

public class NumberMain {
    public static void main(String[] args) {

        // 1. 매개변수로 받아온 정수배열에서 짝수만 찾아서 출력하는 printEvenNum을 람다식으로 구현하세요.
        // PrintNumber 함수형 인터페이스 생성, printEnvenNum(int[] numArr) 추상 메소드로 선언.
        int[] intArr = new int[10];
        // 임의 배열 생성
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i;
        }

        // intArr배열을 numArr라는 변수명으로 람다식 실행
        printEvenNum(intArr, arr -> {
            for (int i : arr) {
                if (i != 0 && i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        });
    }

    public static void printEvenNum(int[] arr, PrintNumber printNumber) {
        printNumber.printEnvenNum(arr);
    }
}









































//        printNum(numArr -> {
//            int[] intArr = new int[10];
//            int index = 0;
//            for (int i =0; i < numArr.length; i++) {
//                if (numArr[i] % 2 == 0 && numArr[i] != 0) {
//                    intArr[index++] = numArr[i];
//                }
//            }
//            return intArr;
//        });
//
//    }
//
//    public static void printNum(PrintNumber printNumber) {
//
//        int[] intArr = new int[10];
//        for (int i = 0; i < intArr.length; i++) {
//            intArr[i] = i;
//        }
//
//        int[] evenArr = printNumber.printEvenNum(intArr);
//
//        for (int i : evenArr) {
//            if(i != 0){
//                System.out.print(i + " ");
//            }
//        }
//    }

