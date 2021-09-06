package LeetCode.Challenges.Y2021.August;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsetsII99 {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i =0; i< Math.pow(2,nums.length);i++){
            List<Integer> a = new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if((i & (1<<j)) > 0  ){
                    a.add(nums[j]);
                }

            }
            Collections.sort(a);
            if(!ans.contains(a))
                ans.add(a);
        }
        return ans;
    }

    public static void main(String[] args) {
        for(List<Integer> x : subsetsWithDup(new int[]{1,9,8,3,-1,0})){
            System.out.println(x.toString());
        }
    }
}
