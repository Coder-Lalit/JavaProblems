package LeetCode.Problems.Easy.String;

import java.util.*;

public class FindCommonCharacters1002 {
    public static List<String> commonChars1(String[] words) {
        int a [] = new int [26];
        for(String w : words){
            for(char c : w.toCharArray()){
                a[c-'a']++;
            }
        }
        List<String> ans = new ArrayList<>();
        for(int i=0;i<26;i++){
            while(a[i]/words.length != 0){
                ans.add((char)('a'+i)+"");
                a[i]-=words.length;
            }
        }

        return ans;
    }

    public static List<String> commonChars(String[] words) {
        HashMap<Character,Integer> map = new HashMap<>();
        List<String> ans = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(i==0){
                for(char c : words[i].toCharArray()){
                    map.put(c,map.getOrDefault(c,0)+1);
                }
            }else{
                HashMap<Character,Integer> tempMap=new HashMap<>();
                for(Character ch: map.keySet()){
                    StringBuilder s = new StringBuilder(words[i]);
                    int c=0,oc =0;
                    while(s.indexOf(ch+"",c)!=-1){
                        oc++;
                        c=s.indexOf(ch+"",c)+1;
                    }
                    if(oc>0){
                        tempMap.put(ch,Integer.min(map.get(ch),oc));
                        if(i==words.length-1){
                            for(int x=0; x<tempMap.get(ch);x++){
                                ans.add(ch+"");
                            }
                        }
                    }
                }
                map=tempMap;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(commonChars(new String[]{"acabcddd","bcbdbcbd","baddbadb","cbdddcac","aacbcccd","ccccddda","cababaab","addcaccd"}));
        System.out.println(commonChars(new String[]{"bella","label","roller"}));
        //System.out.println("bcbdbcbd".indexOf("b",1));
    }
}
