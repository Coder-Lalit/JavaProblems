package LeetCode.Problems.Easy.Array;

import java.util.Arrays;

public class MaximizeSumOfArrayAfterKNegations1005 {
    public static int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int c = 0;
        while (k != 0 && nums[c] < 0 && c < nums.length) {
            if (nums[c] < 0) {
                nums[c] = -nums[c];
                c++;
            }
            k--;
        }
        Arrays.sort(nums);
        if(k%2!=0){
            nums[0]=-nums[0];
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(largestSumAfterKNegations(new int[]{4,2,3},1));
        System.out.println(largestSumAfterKNegations(new int[]{1, 3, 2, 6, 7, 9}, 3));
        System.out.println(largestSumAfterKNegations(new int[]{2,-3,-1,5,-4}, 2));
    }
}
