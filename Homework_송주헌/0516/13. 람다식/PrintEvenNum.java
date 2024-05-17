package homework_01;

public class PrintEvenNum {

	public static void main(String[] args) {
        printEven(new PrintNumber() {
            @Override
            public void printEvenNum(int[] intArr) {
                for(int i = 0; i < intArr.length; i++) {
                    if(intArr[i] % 2 == 0)
                        System.out.println(intArr[i]);
                } 
            }
        });
    }
    
    public static void printEven(PrintNumber printNumber) {
        int[] intArray = {1,2,3,4,5};
        printNumber.printEvenNum(intArray);
    }
}

