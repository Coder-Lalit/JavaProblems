package LeetCode.Problems.Easy.Array;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame682 {
    public static int calPoints(String[] ops) {
        List<Integer> rec= new ArrayList<>();
        int sum=0;
        int index=0;
        for(String s : ops ){
            switch(s){
                case "C":
                    sum-=rec.get(index-1);
                    rec.remove(index-1);
                    index--;
                    break;
                case "D":
                    rec.add(2*rec.get(index-1));
                    index++;
                    sum+=rec.get(index-1);
                    break;
                case "+":
                    rec.add(rec.get(index-1)+rec.get(index-2));
                    index++;
                    sum+=rec.get(index-1);
                    break;
                default:
                    rec.add(Integer.parseInt(s));
                    sum+=Integer.parseInt(s);
                    index++;
                    break;
            }

        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println(calPoints(new String[]{"5","2","C","D","+"}));
    }
}
