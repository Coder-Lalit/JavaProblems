package LeetCode.Problems.Easy.String;

import org.testng.collections.Lists;

import java.util.ArrayList;
import java.util.List;

public class ShortestCompletingWord748 {
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        List<Character> l = new ArrayList<>();
        String res="";
        for(char x : licensePlate.toLowerCase().toCharArray()){
            if(x>='a' && x<='z'){
                l.add(x);
            }
        }

        for(String word : words){
            List<Character> lp = new ArrayList<>();
            lp.addAll(l);
            for(char c : word.toCharArray()){
                lp.remove((Character)c);
                if(lp.size()==0){
                    res= !res.equals("") && res.length() <= word.length()? res:word;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        //System.out.println(shortestCompletingWord("s",new String[]{"looks","pest","stew","show"}));
        System.out.println(shortestCompletingWord("Ah71752",
         new String[] {"suggest","letter","of","husband","easy","education","drug","prevent","writer","old"}));
    }
}
