package LeetCode.Problems.Easy.Random;

import java.util.ArrayList;
import java.util.List;

public class StrobogrammaticNumber246 {
    public static void main(String[] args) {
        System.out.println(isStrobogrammatic("1"));
        System.out.println(isStrobogrammatic("69"));
        System.out.println(isStrobogrammatic("639"));
    }

    public static boolean isStrobogrammatic(String num) {
        int count = 0;
        boolean res = true;
        List<Character> chars = new ArrayList<Character>() {{
            add('1');
            add('8');
            add('6');
            add('9');
            add('0');
        }};
        Character f = num.charAt(0);
        if (num.length() == 1) {
            res = f == '0' || f == '1' || f == '8' ? true : false;
        } else {
            while (res && count < (num.length() - count)) {
                Character c = num.charAt(count);
                Character n = num.charAt(num.length() - count - 1);
                System.out.print(c + " ");
                System.out.print(n + " ");
                System.out.println();
                if (chars.contains(c) && chars.contains(n)) {
                    if (c == '6') {
                        res = n == '9' ? true : false;
                    } else if (c == '9') {
                        res = n == '6' ? true : false;
                    } else {
                        res = c == n ? true : false;
                    }
                }
                else {
                    res=false;
                }
                count++;
            }
        }
        return res;
    }
}
