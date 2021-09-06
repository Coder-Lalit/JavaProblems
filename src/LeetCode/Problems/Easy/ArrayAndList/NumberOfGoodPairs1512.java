package LeetCode.Problems.Easy.ArrayAndList;

import java.util.Arrays;

public class NumberOfGoodPairs1512 {
    public static int numIdenticalPairs(int[] nums) {
        Arrays.sort(nums);
        int ans =0;
        int prv= nums[0];
        int c=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==prv) c++;
            else{
                ans += (c-1)*(c)/2;
                prv=nums[i];
                c=1;
            }
        }
        if(c>1){
            ans += (c-1)*(c)/2;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(numIdenticalPairs(new int[]{1,2,3,1,1,3}));
    }
}
