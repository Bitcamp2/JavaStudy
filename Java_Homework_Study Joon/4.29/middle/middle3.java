package middle;

public class middle3 {
    public static void main(String[] args) {

        int sum = 0;

         for(int i = 0; i <= 1000; i++) {
              if( i % 2 == 0 &&  i % 7 == 0 ) {
                  System.out.println(i);
                  sum += i;
            }
        }
         System.out.println("합 :" + sum );
    }
}
