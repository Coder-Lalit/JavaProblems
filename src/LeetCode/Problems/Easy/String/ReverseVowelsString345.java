package LeetCode.Problems.Easy.String;

import java.util.ArrayList;
import java.util.List;

public class ReverseVowelsString345 {

    public static void main(String[] args) {
        System.out.println(reverseVowels("helailo"));
    }

    public static String reverseVowels(String s) {
        List<Character> vowels = new ArrayList<Character>() {{
            add('a');
            add('e');
            add('i');
            add('o');
            add('u');
        }};

        if (s.length() < 1)
            return s;
        StringBuilder sT = new StringBuilder(s);
        int l = 0;
        boolean lv = false;
        int r = s.length() - 1;
        boolean rv = false;
        while (l < r) {
            if (!lv && !vowels.contains(s.toLowerCase().charAt(l))) {
                l++;
            } else {
                lv = true;
            }
            if (!rv && !vowels.contains(s.toLowerCase().charAt(r))) {
                r--;
            } else {
                rv = true;
            }
            if (lv && rv) {
                Character c = sT.charAt(l);
                sT.setCharAt(l, sT.charAt(r));
                sT.setCharAt(r, c);
                l++;
                r--;
                lv = false;
                rv = false;
            }
        }
        return sT.toString();

    }
}
