package LeetCode.Problems.Easy.ArrayAndList;

import java.util.ArrayList;
import java.util.List;

public class SumOfAllSubsetXORTotals1863 {
    public static void main(String[] args) {
        //System.out.println(subsets(new int []{1,2,3}).toString());
        //subsetXORSum(new int []{1,2,3});
        System.out.println(Math.log(2000));
    }

    public static int subsetXORSum(int[] nums) {
        if(nums.length==0) return 0;
        int s=0;
        for(int i= 0; i< Math.pow(2,nums.length);i++){
            int p=0;
            for(int j=0;j<nums.length;j++){
                if((i & (1<<j)) > 0){
                    p ^=nums[j];
                }
            }
            s+=p;
        }
        return s;
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList();
        output.add(new ArrayList<Integer>());

        for (int num : nums) {
            List<List<Integer>> newSubsets = new ArrayList();
            for (List<Integer> curr : output) {
                newSubsets.add(new ArrayList<Integer>(curr){{add(num);}});
            }
            for (List<Integer> curr : newSubsets) {
                output.add(curr);
            }
        }
        return output;
    }
}
