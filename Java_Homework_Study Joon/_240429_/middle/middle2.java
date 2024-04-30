package _240429_.middle;

public class middle2 {
    public static void main(String[] args) {

        //3. while문을 이용해서 1부터 10까지 중에 짝수만 출력하세요.

        for( int i =1; i<10; i++){
        while(i % 2 == 0){
            System.out.println(i);
            if (i <10)
                break;

            }
        }
    }
}
