package hw10.basic;

import java.util.HashMap;
import java.util.Map;

import static hw10.basic.GenericCla.printArr;

public class BasicMain {
    public static void main(String[] args) {

        // base02
        System.out.println(GenericCla.add("bobaesj", "sjsjsjsj"));
        System.out.println(GenericCla.add(1, 1.3));

        // base04
        // 제네릭타입으로 배열 생성해야함
        Integer[] intArr1 = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        printArr(intArr1);
        System.out.println();

        // base05
        int[] intArr2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.println(GenericCla.getMin(intArr2));

        // base06
        Map<String, Integer> map = new HashMap<>();
        map.put("bobaesjbobaesjbobaesj", 1111111111);
        map.put("bobaesj", 1111111222);
        map.put("bobj", 1111333);
        GenericCla.printOverTen(map);

        // base07
        notifyFood("한국");
        notifyFood("중국");
        notifyFood("일본");
        notifyFood("미국");
    }

    //7. KOR, CHI, JAP, USA 네 개의 상수를 갖는 enum을 생성하고 첫 번째 값은 "나라 한글명"이고 두 번째 값은 "대표음식"으로 지정한다.
    // public void notifyFood(String country) 메소드를 만들고 country 값과 동일한 한글명인 나라의 음식을
    // 다음과 같이 출력하도록 구현하세요.
    // country에 "중국"이 들어오면 "중국의 대표음식은 짜장면입니다."라고 나오도록 하세요.
    // (각 국의 음식은 한국=불고기, 중국=짜장면, 일본=초밥, 미국=햄버거)
    public static void notifyFood(String country) {

        if (Country.KOR.getCountryName().equals(country)) {
            System.out.println(Country.KOR.getCountryName() +"의 대표음식은 " + Country.KOR.getFood() + "입니다.");
        } else if (Country.CHI.getCountryName().equals(country)) {
            System.out.println(Country.CHI.getCountryName() +"의 대표음식은 " + Country.CHI.getFood() + "입니다.");
        } else if (Country.JAP.getCountryName().equals(country)) {
            System.out.println(Country.JAP.getCountryName() +"의 대표음식은 " + Country.JAP.getFood() + "입니다.");
        } else if (Country.USA.getCountryName().equals(country)) {
            System.out.println(Country.USA.getCountryName() +"의 대표음식은 " + Country.USA.getFood() + "입니다.");
        }
    }
}
