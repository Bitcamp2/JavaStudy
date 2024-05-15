package _0515_basics1.typeconversion;

import java.util.Scanner;

public class TypeConversion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter double: ");
        double dNum = sc.nextDouble();

        int iNum = (int) dNum;
        System.out.println(iNum);
    }
}
