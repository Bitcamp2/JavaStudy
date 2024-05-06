package hw04;

public class ArrayUtility2 {

    static int[] concat(int[] s1, int[] s2) {
        int[] conArr = new int[s1.length + s2.length];

        for (int i = 0; i < s1.length; i++) {
            conArr[i] = s1[i];
        }

        for (int i = 0; i < s2.length; i++) {
            conArr[s1.length + i] = s2[i];
        }

        return conArr;
    }

    static int[] remove(int[] s1, int[] s2) {
        int[] rmArr = new int[s1.length];
        int index = 0;

        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i] == s2[j]) {
                    rmArr[index] = 0;
                    i--;
                    break;
                } else if (s1[i] != s2[i]) {
                    rmArr[index] = s1[i];
                }
            }
            index++;
        }
        return rmArr;
    }
}
