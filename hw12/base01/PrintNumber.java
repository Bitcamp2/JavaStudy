package hw12.base01;

// 1. PrintNumber 함수형 인터페이스 생성
@FunctionalInterface
public interface PrintNumber {

    // 2. printEvenNum(int[] numArr, 추상메소드로 선언
    void printEnvenNum(int[] numArr);
}
