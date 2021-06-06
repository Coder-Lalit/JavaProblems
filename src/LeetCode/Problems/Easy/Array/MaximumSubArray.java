package LeetCode.Problems.Easy.Array;

public class MaximumSubArray {
    public static void main(String[] args) {
        System.out.println(maximumSubArray2(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(maximumSubArray2(new int[]{-2,-1,-3,-4,-1,-2,-1,-5,-4}));
    }

    public static int maximumSubArray(int [] nums){
        int maxSubArray=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int temp=0;
            for(int j=i;j<nums.length;j++){
                temp+=nums[j];
                maxSubArray = Integer.max(maxSubArray,temp);
            }
        }
        return maxSubArray;
    }

    public static int maximumSubArray2(int [] nums){
        int curSubArray=nums[0];
        int maxSubArray=nums[0];
        for(int i=1;i<nums.length;i++){
            curSubArray = Integer.max(curSubArray+nums[i],nums[i]);
            maxSubArray = Integer.max(curSubArray,maxSubArray);
        }
        return maxSubArray;
    }

}
