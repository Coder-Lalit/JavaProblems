package LeetCode.Problem.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RegularExpressionMatching {
    // "a", "a.","a.*", "a.*a" , "*.a"
    //"mi ss i ss i p pi"
    //"mi s* i s* p*."

    public static void main(String[] args) {
//        System.out.println(isMatch("aa","a")+" Ex:false");
//        System.out.println(isMatch("aa", "a*")+" Ex:true");
//        System.out.println(isMatch("ab", ".*")+" Ex:true");
//        System.out.println(isMatch("aab", "c*a*b")+" Ex:true");
//        System.out.println(isMatch("mississippi", "mis*is*p*.")+" Ex:false");
//        System.out.println(isMatch("mississippi", "mis*is*ip*.") + " Ex:true");
//        System.out.println(isMatch("aa", "aa") + " Ex:true");
//        System.out.println(isMatch("ab", ".*c") + " Ex:false");
//        System.out.println(isMatch("aaa", "a*a") + " Ex:true");
        System.out.println(isMatch("aaabaass", "ab*a*c*a") + " Ex:true");
    }

    public static boolean isMatch(String s, String p) {
        boolean isMatch = true;
        int count=0;
        List<String> arr = new ArrayList<>();
        while(count<p.length()){
            if(count+1<p.length() && p.charAt(count+1)=='*'){
                arr.add(p.charAt(count)+"*");
                count++;
            }
            else{
                arr.add(String.valueOf(p.charAt(count)));
            }
            count++;
        }
        System.out.println(arr.toString());
        return isMatch;
    }

}
