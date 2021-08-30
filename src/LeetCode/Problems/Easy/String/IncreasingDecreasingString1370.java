package LeetCode.Problems.Easy.String;

import java.util.*;

public class IncreasingDecreasingString1370 {
    public static String sortString1(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Character> cList = new ArrayList<>(map.keySet());
        Collections.sort(cList);

        StringBuilder res = new StringBuilder();
        int c=0;
        while(c< s.length()){
            for(char ch : cList){
                if(map.get(ch)>0 && c< s.length()){
                    res.append(ch);
                    c++;
                    map.put(ch,map.get(ch)-1);
                }
            }
            for(int i=cList.size()-1;i>=0 ;i--){
                if(map.get(cList.get(i))>0 && c< s.length()){
                    res.append(cList.get(i));
                    c++;
                    map.put(cList.get(i),map.get(cList.get(i))-1);
                }
            }
        }
        return res.toString();
    }

    public static String sortString(String s) {
        int cArray [] = new int[26];
        for(char ch : s.toCharArray()){
            cArray[ch-'a']++;
        }

        StringBuilder res = new StringBuilder();
        int c=0;
        while(c< s.length()){
            for(int i =0; i< 26;i++){
                if(c > s.length()) break;
                if(cArray[i]>0){
                    res.append((char)(i+'a'));
                    c++;
                    cArray[i]--;
                }
            }
            for(int i=25;i>=0 ;i--){
                if(c > s.length()) break;
                if(cArray[i]>0){
                    res.append((char)(i+'a'));
                    c++;
                    cArray[i]--;
                }
            }
        }
        return res.toString();
    }




    public static void main(String[] args) {
        System.out.println(sortString("bbabaaabbbbcccc"));
    }
}
