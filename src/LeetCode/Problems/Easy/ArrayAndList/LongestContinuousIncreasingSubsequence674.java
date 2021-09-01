package LeetCode.Problems.Easy.ArrayAndList;

public class LongestContinuousIncreasingSubsequence674 {
    public static int findLengthOfLCIS(int[] nums) {
        int l= Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int c=i;
            while(i+1<nums.length && nums[i+1]>nums[i]){
                i++;
            }
            l=Integer.max(l,i-c+1);
        }
        return l;
    }

    public static void main(String[] args) {
        System.out.println(findLengthOfLCIS(new int[] {1,3,5,4,7}));
        System.out.println(findLengthOfLCIS(new int[] {2,2,2,2}));
    }
}
