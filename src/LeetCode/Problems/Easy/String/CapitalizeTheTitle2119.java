package LeetCode.Problems.Easy.String;

import java.util.HashSet;
import java.util.Set;

public class CapitalizeTheTitle2119 {
    public static void main(String[] args) {
        System.out.println(capitalizeTitle("Hello lalit"));
    }

    public static String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder(title.toLowerCase());
        int st =0;
        int i=0;
        while(i<sb.length()){
            int c=0;
            while( i<sb.length() && sb.charAt(i)!=' '){
                c++;
                i++;
            }

            if(c>2)
                sb.setCharAt(st,(char)(sb.charAt(st)-32));
            st = ++i;
        }
        return sb.toString();
    }
}
