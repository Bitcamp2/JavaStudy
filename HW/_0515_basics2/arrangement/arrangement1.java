package _0515_basics2.arrangement;

import java.util.Scanner;

public class arrangement1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
