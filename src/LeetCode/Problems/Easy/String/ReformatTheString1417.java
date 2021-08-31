package LeetCode.Problems.Easy.String;

import java.util.Arrays;

public class ReformatTheString1417 {
    public static String reformat1(String s) {
        if(s.length()==1) return s;
        char [] chars = s.toCharArray();
        Arrays.sort(chars);
        StringBuilder ans = new StringBuilder();
        int i=0;
        int n = s.length();
        int dig=0,chs= 0;
        while(i<n-i){
            if(Character.isDigit(chars[i])) dig++;
            else chs++;
            ans.append(chars[i]);
            if(i!=n-1-i){
                ans.append(chars[n-1-i]);
                if(Character.isDigit(chars[n-1-i])) dig++;
                else chs++;
            }
            i++;
        }
        if(Math.abs(dig-chs)>1) return "";
        if(!Character.isDigit(ans.charAt(n-1)) && !Character.isDigit(ans.charAt(n-2))){
            char d =ans.charAt(n-1);
            return ans.deleteCharAt(n-1).reverse().append(d).toString();
        }
        return ans.toString();
    }

    public static String reformat(String s) {
        if(s.length()==1) return s;
        char [] chars = s.toCharArray();
        char [] ans = new char[chars.length];
        int d=0, c=1;
        boolean sw= false;
        Arrays.sort(chars);
        for(int i =0;i<chars.length;i++){

            if(Character.isDigit(chars[i])){
               ans[d]=chars[i];
               d+=2;
            }else{
                sw =true;
                if(c<chars.length){
                    ans[c]=chars[i];
                    c++;
                }else{
                    return chars[i]+new String(ans).trim();
                }

            }
            if( ((chars.length-i-1)> i+2 || (chars.length-i-1) < i-1)){
                return "";
            }
        }

        return new String(ans);
    }

    public static void main(String[] args) {
        System.out.println(reformat("abcd123"));
    }
}
