package LeetCode.Problems.Easy.String;

import java.util.ArrayList;
import java.util.List;

public class PositionsLargeGroups830 {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        char ch=s.charAt(0);
        int st=0;
        for(int i=1;i<s.length();i++){
            if(ch!=s.charAt(i)){
                if(i-st>=3){
                    List<Integer> a = new ArrayList<Integer>();
                    a.add(st);
                    a.add(i-1);
                    res.add(a);
                }
                st=i;
                ch=s.charAt(i);
            }else if(i==s.length()-1 && i-st>=2){
                List<Integer> a = new ArrayList<Integer>();
                a.add(st);
                a.add(i);
                res.add(a);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        PositionsLargeGroups830 p = new PositionsLargeGroups830();
        System.out.println(p.largeGroupPositions("xaaa").toString());
    }
}
