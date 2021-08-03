package LeetCode.Problems.Easy.String;

import jdk.nashorn.internal.runtime.regexp.RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OccurrencesAfterBigram1078 {
    public static String[] findOcurrences(String text, String first, String second) {
        String ans = "";
        Pattern p = Pattern.compile("(?<=\\s|^)"+first+"(\\s)"+second+"(\\s)(.*?)(\\s|$)");
        Matcher matcher = p.matcher(text);
        while (matcher.find()) {
            ans+=matcher.group(0).split(" ")[2]+" ";
        }

        return ans.trim().split(" ");
    }

    public static void main(String[] args) {
        for(String x : findOcurrences("aa good alice is a good girl she is a good student aa good","a","good")){
            System.out.println(x);
        }
    }

}
