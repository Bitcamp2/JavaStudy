package _0515_basics1.typeconversion;

public class TypeConversion5 {
    public static void main(String[] args) {

        int iNum = 10;
        long lNum = 20;

        long lNum2 = lNum;
        lNum = iNum;
        iNum = (int)lNum2;

        System.out.println(iNum + "," + lNum);

    }
}
