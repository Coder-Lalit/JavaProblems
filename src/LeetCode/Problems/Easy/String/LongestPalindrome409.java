package LeetCode.Problems.Easy.String;

import java.util.HashMap;

public class LongestPalindrome409 {

    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        int max=0;
        boolean odd=false;
        for(Integer i : map.values()){
            if(i%2==1){
                max+=i-1;
                odd=true;
            }else{
                max+=i;
            }
        }
        return odd?max+1:max;
    }

    public int longestPalindrome2(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int max=0;
        boolean odd=false;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
                if(map.get(s.charAt(i))%2==0){
                    max+=2;
                    odd=false;
                }else{
                    odd=true;
                }

            }else{
                map.put(s.charAt(i),1);
                odd=true;
            }
        }
        return odd?max+1:max;
    }

    public static void main(String[] args) {
        LongestPalindrome409 l = new LongestPalindrome409();
        l.longestPalindrome("aaaaAaaaAbba");
    }
}
