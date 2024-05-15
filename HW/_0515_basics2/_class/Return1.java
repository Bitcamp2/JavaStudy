package _0515_basics2._class;

public class Return1 {

    public static String combineStrings(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
            String str1 = "나는";
            String str2 = "서준";

            String combinedString = combineStrings(str1, str2);
            System.out.println("결합된 문자열: " + combinedString);
        }

}
