package _240430_.basic;

public class Basic2_3 {
    // 2. ConcatString 클래스를 하나 만들고 String 타입의 값 2개를 매개변수로 받아서 문자열 결합을 진행하고
    // 결합된 문자열을 리턴하는 메소드를 구현하세요.

    public String ConcastString(String str, String str2) {
        return str + str2;
    }

    // 3. 2번에서 만든 메소드를 오버로딩해서 String 타입의 값 2개와 int 타입의 값 1개를 매개변수로 받아서
    // 문자열 결합을 진행하고 결합된 문자열을 리턴하는 메소드를 구현하세요.

    public String ConcastString(String str, String str2, int a) {
        return new String(str + str2 + a);
    }
}
