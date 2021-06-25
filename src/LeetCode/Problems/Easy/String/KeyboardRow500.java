package LeetCode.Problems.Easy.String;

import java.util.ArrayList;
import java.util.List;

public class KeyboardRow500 {
    public static void main(String[] args) {
        KeyboardRow500 a = new KeyboardRow500();
        for (String x : a.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"})) {
            System.out.println(x);
        }
    }

    public String[] findWords(String[] words) {
        List<String> list=new ArrayList<>();
        String f_row = "qwertyuiop";
        String s_row = "asdfghjkl";
        String t_row = "zxcvbnm";
        for (String s1 : words) {
            char[] chars = s1.toLowerCase().toCharArray();
            boolean found = true;
            if (f_row.contains(chars[0] + "")) {
                for (char c : chars) {
                    if (!f_row.contains(c + "")) {
                        found = false;
                        break;
                    }
                }
            } else if (s_row.contains(chars[0] + "")) {
                for (char c : chars) {
                    if (!s_row.contains(c + "")) {
                        found = false;
                        break;
                    }
                }

            } else if (t_row.contains(chars[0] + "")) {
                for (char c : chars) {
                    if (!t_row.contains(c + "")) {
                        found = false;
                        break;
                    }
                }
            }
            if(found)
                list.add(s1);
        }

        String[] res=new String[list.size()];
        return list.toArray(res);
    }
}
