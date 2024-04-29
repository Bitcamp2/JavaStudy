package middle;

import java.util.Random;

public class middle4 {
    public static void main(String[] args) {

        int[] numArr = new int[20];

        Random random = new Random();

        for(int i=0;i<numArr.length;i++)
            numArr[i] = random.nextInt(101);

        System.out.println("<홀수번째>");

        for(int i=1;i<numArr.length;i+=2)
            System.out.println(i+"번째: "+numArr[i]);
         System.out.println("<짝수번째>");
         for(int i=numArr.length-2;i>=0;i-=2)
                 System.out.println(i+"번째: "+numArr[i]);

    }
}
