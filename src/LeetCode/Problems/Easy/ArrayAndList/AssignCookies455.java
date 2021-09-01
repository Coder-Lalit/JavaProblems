package LeetCode.Problems.Easy.ArrayAndList;

import java.util.Arrays;

public class AssignCookies455 {
    public static void main(String[] args) {
        AssignCookies455 a = new AssignCookies455();
        System.out.println(a.findContentChildren(new int[]{1,2},new int[]{}));
    }
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int max=0;
        int j=0;
        for(int i =0; i<g.length && j<s.length;i++){
            if(g[i]<=s[j]){
                max++;
                j++;
            }else{
                j++;
                while(j<s.length){
                    if(g[i]<=s[j]){
                        max++;
                        j++;
                        break;
                    }else{
                        j++;
                    }
                }
            }
        }
        return max;
    }
}
