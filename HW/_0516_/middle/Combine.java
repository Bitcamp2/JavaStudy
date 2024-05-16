package _0516_.middle;

import static _0516_.middle.BuilderUtils.appendSb;
import static _0516_.middle.BuilderUtils.reverseSb;

public class Combine {
    public static void main(String[] args) {

        // 1번
//        StringBuilderUtils utils = ((sb1, sb2) -> {
//            StringBuilder combined = new StringBuilder(sb1).append(sb2);
//            return combined.reverse();
//        });

        StringBuilder sb1 = new StringBuilder("나는");
        StringBuilder sb2 = new StringBuilder("문어");

        // 1번
//        StringBuilder result = utils.combineStrBuilder(sb1, sb2);
//             System.out.println(result.toString());
        // 2번
        StringBuilder result = combineStrBuilder(sb1, sb2);

        System.out.println(result.toString());


    }
    public static StringBuilder combineStrBuilder (StringBuilder sb1, StringBuilder sb2) {

        appendSb(sb1, sb2);
        reverseSb(sb1);
        return sb1;
    }
}
