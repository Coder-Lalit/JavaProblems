package LeetCode.Problems.Easy.Random;

import java.util.HashMap;

public class PalindromePermutation266 {
    public static void main(String[] args) {
        System.out.println(canPermutePalindrome("aab"));
        System.out.println(canPermutePalindrome("aabb"));
        System.out.println(canPermutePalindrome("ab"));
    }

    public static boolean canPermutePalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        int odd=0;
        for(Integer v: map.values()){
            odd +=v%2!=0?1:0;
        }
        return odd<=1;
    }
}
