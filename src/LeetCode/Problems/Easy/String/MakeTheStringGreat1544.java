package LeetCode.Problems.Easy.String;

import org.testng.annotations.Test;

public class MakeTheStringGreat1544 {
    public String makeGood2(String s) {
        return getMakeGood(s,0);
    }

    String getMakeGood(String s,int st){
        if(s.length() <2) return s;
        StringBuilder sb = new StringBuilder(s);
        while(st < sb.length()-1){
            if(Math.abs(sb.charAt(st)-sb.charAt(st+1)) == 32){
                sb.delete(st,st+2);
                break;
            }
            st++;
        }
        return st == s.length()-1 ? sb.toString() : st == 0 ? getMakeGood(sb.toString() ,0) : getMakeGood(sb.toString() ,st-1);

    }

    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder(s);
        int st=0;
        do{
            if(sb.length() <2) return sb.toString();
            if(Math.abs(sb.charAt(st)-sb.charAt(st+1)) == 32){
                sb.delete(st,st+2);
                if(st!=0) st--;
                continue;
            }
            st++;
        }while (st!=sb.length()-1);

        return sb.toString();

    }

    @Test
    public void test(){
        System.out.println(makeGood("leEeetcode"));
    }
}
