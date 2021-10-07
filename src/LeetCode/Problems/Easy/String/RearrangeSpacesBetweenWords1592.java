package LeetCode.Problems.Easy.String;

import java.util.ArrayList;
import java.util.List;

public class RearrangeSpacesBetweenWords1592 {
    public static String reorderSpaces(String text) {
        if(!text.contains(" ")) return text;
        int sp = 0;
        boolean ch = false;
        int st = -1;
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            if (ch && text.charAt(i) == ' ') {
                stringList.add(text.substring(st, i));
            }
            if (text.charAt(i) == ' ') {
                sp++;
                ch = false;
            } else {
                if (!ch) st = i;
                ch = true;

            }
        }
        if(ch){
            stringList.add(text.substring(st));
        }

        StringBuilder ans = new StringBuilder();
        int nSpace = sp / (stringList.size() - 1);
        int ex = sp % (stringList.size() - 1);
        for (int j = 0; j < stringList.size() - 1; j++) {
            ans.append(stringList.get(j));
            int i = 0;
            while (i++ < nSpace) {
                ans.append(" ");
            }
        }
        ans.append(stringList.get(stringList.size() - 1));
        int i = 0;
        while (i++ < ex) {
            ans.append(" ");
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String[] input = {"  this   is  a sentence ",
                " practice   makes   perfect",
                "hello   world",
                "  walks  udp package   into  bar a",
                "a"};
        for(String in : input){
            System.out.println(reorderSpaces(in));
        }
    }
}
