package _0516_.middle;

public class PrintMaxMinMId {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11};

        MaxMinMid getMaxRef = IntArrUtils::getMax;
        System.out.println("Max: " + getMaxRef.maxOrMinOrMid(numbers));


        MaxMinMid getMinRef = IntArrUtils::getMin;
        System.out.println("Min: " + getMinRef.maxOrMinOrMid(numbers));


        MaxMinMid getMidRef = IntArrUtils::getMid;
        System.out.println("Mid: " + getMidRef.maxOrMinOrMid(numbers));

    }

}
