package LeetCode.Problem.Easy;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
    public static int romanToInt(String s) {
        HashMap<Character,Integer> rS = new HashMap<Character, Integer>(){{
            put('M',1000);
            put('D',500);
            put('C',100);
            put('L',50);
            put('X',10);
            put('V',5);
            put('I',1);
        }};
        int temp =0;
        if(s.length()==1){
            temp= rS.get(s.charAt(0));
        }
        else{
            int i=s.length()-2;
            temp=rS.get(s.charAt(i+1));
            while (i>=0){
                int c=rS.get(s.charAt(i));
                int n=rS.get(s.charAt(i+1));
                if(c>=n){
                    temp+=c;
                }
                else {
                    temp-=c;
                }
                i--;
            }
        }
        return temp;
    }
}
