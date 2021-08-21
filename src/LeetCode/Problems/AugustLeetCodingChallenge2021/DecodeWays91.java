package LeetCode.Problems.AugustLeetCodingChallenge2021;

import java.util.ArrayList;
import java.util.List;

public class DecodeWays91 {
    public static int numDecodings1(String s) {
        int ans = 1;
        int withOutZero = 0;
        int prv = 0;

        for (char c : s.toCharArray()) {
            if (c == '0' && withOutZero >= 1) {
                ans *= fact(withOutZero - 1);
                withOutZero = 0;
            } else if ((prv * 10 + Integer.valueOf(c + "") > 26)) {
                ans *= fact(withOutZero);
                withOutZero = 0;
            } else if (c != '0') {
                withOutZero++;
            } else {
                return 0;
            }
            prv = Integer.valueOf(c + "");
        }
        if (withOutZero != 0) ans *= fact(withOutZero);
        return ans;
    }

    public static int numDecodings(String s) {
        if (s.charAt(0) == '0') {
            return 0;
        }

        int n = s.length();
        int twoBack = 1;
        int oneBack = 1;
        for (int i = 1; i < n; i++) {
            int current = 0;
            if (s.charAt(i) != '0') {
                current = oneBack;
            }
            int twoDigit = Integer.parseInt(s.substring(i - 1, i + 1));
            if (twoDigit >= 10 && twoDigit <= 26) {
                current += twoBack;
            }

            twoBack = oneBack;
            oneBack = current;
        }
        return oneBack;
    }

    static int fact(int n) {

        if (n <= 1) {
            return 1;
        }
        if (n == 2) {
            return 1 + fact(1);
        }

        return fact(n - 1) + fact(n - 2);
    }

    public static void main(String[] args) {
//        System.out.println(numDecodings("11106"));
//        System.out.println(numDecodings("12"));
//        System.out.println(numDecodings("226"));
//        System.out.println(numDecodings("06"));
//        System.out.println(numDecodings("0"));
//        System.out.println(numDecodings("10"));
//        System.out.println(numDecodings("27"));
        System.out.println(numDecodings("1201234"));
        //System.out.println(fact(5));
    }

}
