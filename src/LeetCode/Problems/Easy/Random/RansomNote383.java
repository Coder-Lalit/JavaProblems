package LeetCode.Problems.Easy.Random;

import java.util.ArrayList;
import java.util.List;

public class RansomNote383 {
    public static boolean canConstruct(String r, String m) {
        if(r.length()>m.length()) return false;
        List<Character> chars = new ArrayList<>();
        for(int i=0;i<m.length();i++){
            chars.add(m.charAt(i));
        }
        for(int i=0;i<r.length();i++){
            if(chars.contains(r.charAt(i))){
                chars.remove((Character) r.charAt(i));
            }else{
                return false;
            }
        }
        return true;
    }
    public static boolean canConstruct2(String r, String m) {
        if(r.length()>m.length()) return false;
        StringBuilder m2= new StringBuilder(m);
        for(int i=0;i<r.length();i++){
            int x=m2.indexOf(r.charAt(i)+"");
            if(x!=-1){
                m2.deleteCharAt(x);
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("aab","baa"));
    }
}
