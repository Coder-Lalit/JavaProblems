package LeetCode.Problems.Easy.Random;

import java.util.HashMap;

public class Hexspeak1271 {
    public static String toHexspeak(String num) {
        StringBuilder s= new StringBuilder(Long.toHexString(Long.parseLong(num)).toUpperCase());
        HashMap<Character,Character> map = new HashMap<>();
        map.put('0','O');
        map.put('1','I');
        map.put('A','A');
        map.put('B','B');
        map.put('C','C');
        map.put('D','D');
        map.put('E','E');
        map.put('F','F');



        for (int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                s.setCharAt(i,map.get(s.charAt(i)));
            }else{
                return "ERROR";
            }
        }
        return s.toString();
    }

    public static void main(String[] args) {
        //System.out.println(toHexspeak("257"));
        //System.out.println(toHexspeak("3"));
        System.out.println(toHexspeak("65450"));
    }
}
