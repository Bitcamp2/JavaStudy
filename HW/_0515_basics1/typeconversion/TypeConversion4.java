package _0515_basics1.typeconversion;

import java.util.Scanner;

public class TypeConversion4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter double: ");
        double dNum = sc.nextDouble();

        double result = Math.pow(dNum, 2);

        String resultStr =  Double.toString(result);
        System.out.println(resultStr);
    }
}
