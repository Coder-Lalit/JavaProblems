package LeetCode.Problems.AugustLeetCodingChallenge2021;

public class FindMinimumInRotatedSortedArray153 {
    public static int findMin(int[] nums) {
        if(nums.length==1) return nums[0];
        if(nums[nums.length-1]>nums[0]) return nums[0];
        int i=1;
        while (i < nums.length) {
            if(nums[i-1]>nums[i]) break;
            i++;
        }
        return nums[i];
    }

    public static void main(String[] args) {
        System.out.println(findMin(new int[]{4, 5, 6, 7,-1, 0, 1, 2}));
        System.out.println(findMin(new int[]{1,2,3,4}));
        System.out.println(findMin(new int[]{1}));
        System.out.println(findMin(new int[]{2,1}));
    }


}
