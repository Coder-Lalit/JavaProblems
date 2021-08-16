package LeetCode.Problems.Easy.String;

public class MaximumNumberOfBalloons1189 {
    public static int maxNumberOfBalloons(String text) {
        int [] chars = new int [26];
        for(char c : text.toCharArray()){
            chars[c-'a']++;
        }
        int min=Integer.MAX_VALUE;
        for(char c : new char[]{'b','a','l','o','n'}){
            if(chars[c-'a']==0) return 0;
            if(c=='l' || c=='o') min=Math.min(chars[c-'a']/2,min);
            min=Math.min(chars[c-'a'],min);
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(maxNumberOfBalloons("leetcode"));
    }
}
