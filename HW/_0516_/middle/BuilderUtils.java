package _0516_.middle;

public class BuilderUtils {

    public static StringBuilder appendSb (StringBuilder sb1, StringBuilder sb2) {

        sb1.append(sb2);
        return sb1;
    }
    public static StringBuilder reverseSb (StringBuilder sb) {

        sb.reverse();

        return sb;
    }

}
