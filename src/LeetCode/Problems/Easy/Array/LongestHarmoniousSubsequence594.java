package LeetCode.Problems.Easy.Array;

import java.util.HashMap;
import java.util.Set;

public class LongestHarmoniousSubsequence594 {
    public static void main(String[] args) {
        LongestHarmoniousSubsequence594 l = new LongestHarmoniousSubsequence594();
        System.out.println(l.findLHS(new int[] {1,3,2,2,5,2,3,7}));
    }
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x: nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        if(map.keySet().size()==1){
            return 0;
        }
        int max=0;
        for(Integer k : map.keySet()){
            if(map.containsKey(k-1)){
                max= Integer.max(max,map.get(k)+map.get(k-1));
            }
        }
        return max;
    }
}
