package LeetCode.Problems.Easy.ArrayAndList;

import java.util.Arrays;

public class ArrayPartitionI561 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i+=2){
            sum+=Integer.min(nums[i],nums[i+1]);
        }
        return sum;
    }
}
