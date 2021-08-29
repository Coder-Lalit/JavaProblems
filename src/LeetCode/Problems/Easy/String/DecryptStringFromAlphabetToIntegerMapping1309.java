package LeetCode.Problems.Easy.String;

public class DecryptStringFromAlphabetToIntegerMapping1309 {
    public static String freqAlphabets(String s) {

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {

            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                res.append((char) ('a' + -1 + Integer.parseInt(s.charAt(i) + "" + s.charAt(i + 1))));
                i += 2;

            } else {
                res.append((char) ('a' + -1 + Integer.parseInt(s.charAt(i) + "")));
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(freqAlphabets("10#11#12"));
    }
}
