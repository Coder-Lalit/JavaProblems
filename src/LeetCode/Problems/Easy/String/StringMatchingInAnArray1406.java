package LeetCode.Problems.Easy.String;

import java.util.ArrayList;
import java.util.List;

public class StringMatchingInAnArray1406 {
    public static List<String> stringMatching(String[] words) {
        List<String> res = new ArrayList<>();
        for(int i =0; i<words.length-1;i++){
            if(res.contains(words[i])) continue;
            for(int j=i+1;j<words.length;j++ ){
                String temp = isSubString(words[i],words[j]);
                if(!temp.isEmpty() && !res.contains(temp)){
                    res.add(temp);
                }
            }
        }
        return res;
    }

    private static String isSubString(String word1, String word2) {
        if(word1.length()<word2.length()) return isSubString(word2,word1);
        while(word1.indexOf(word2)!=-1){
            return word2;
        }
        return "";
    }

    public static void main(String[] args) {
        String [] input1 = new String[]{"mass","as","hero","superhero"};
        String [] input2 = new String[]{"leetcode","et","code"};
        String [] input3 = new String[]{"blue","green","bu"};
        for(String x : stringMatching(input3)){
            System.out.println(x);
        }
        for(String x : stringMatching(input2)){
            System.out.println(x);
        }
        for(String x : stringMatching(input1)){
            System.out.println(x);
        }
    }
}
