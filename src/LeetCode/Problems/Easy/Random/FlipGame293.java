package LeetCode.Problems.Easy.Random;

import java.util.ArrayList;
import java.util.List;

public class FlipGame293 {
    public static void main(String[] args) {
        System.out.println(generatePossibleNextMoves("----++"));
    }

    public static List<String> generatePossibleNextMoves(String c) {
        List<String> res = new ArrayList<>();
        if(c.length()<2){
            return res;
        }
        for(int i=0;i<c.length()-1;i++){
            if(c.charAt(i)=='+'&& c.charAt(i+1)=='+'){
                StringBuilder flipString = new StringBuilder(c);
                flipString.setCharAt(i, '-');
                flipString.setCharAt(i+1, '-');
                res.add(flipString.toString());
                //res.add(c.substring(0,i)+"--"+c.substring(i+2,c.length()));
            }
        }
        return res;
    }
}
