package hw09;

import java.util.HashMap;
import java.util.Map;

public class Base01 {
    public static void main(String[] args) {

        //  1. Map<String, Integer>을 하나 생성하여 key는 알파벳(대소문자 구분)
        //  value는 해당 알파벳의 유니코드 값을 Integer형태로 저장하세요.
        //  A(65) ~ Z(90), a(97) ~ z(122)

        //  Map 객체 생성
        //  Key - 알파벳, Value - 유니코드
        Map<String, Integer> alpha = new HashMap<>();

        char chUpperAlpha = 65; // 대문자 A
        char chLowerAlpha = 97; // 소문자 a

        for (int i = 0; i <= 32; i++) {
            if (chUpperAlpha >= 65 && chUpperAlpha <= 90) {
                alpha.put(String.valueOf(chUpperAlpha), (int) chUpperAlpha);
                chUpperAlpha++;
            } else if (chLowerAlpha >= 97 && chLowerAlpha <= 122) {
                alpha.put(String.valueOf(chLowerAlpha), (int) chLowerAlpha);
                chLowerAlpha++;
            }
        }
        System.out.println(alpha);
    }
}
