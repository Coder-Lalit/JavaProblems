package LeetCode.Problems.Easy.ArrayAndList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GroupAnagrams49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        List<String> used = new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            used.add(strs[i]);
            List<String> tAns = new ArrayList<>();
            tAns.add(strs[i]);
            for(int j=i+1;j<strs.length;j++ ){
                if(!used.contains(strs[j])){
                    if(isAnagrams(strs[i],strs[j])){
                        tAns.add(strs[j]);
                        used.add(strs[j]);
                    }
                }
            }
            Collections.sort(tAns);
            if(!ans.contains(tAns))
                ans.add(tAns);
        }
        return ans;
    }

    static boolean isAnagrams(String a ,String b){
        int temp [][] = new int [2][26];
        for(char ch: a.toCharArray()){
            temp[0][ch-'a']++;
        }
        for(char ch: b.toCharArray()){
            temp[1][ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(temp[0][i]!=temp[1][i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"bat","eat","tea","tan","ate","nat"}).toString());
    }
}
