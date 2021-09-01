package LeetCode.Problems.Easy.ArrayAndList;

public class MaximumAverageSubarrayI643 {
    public static void main(String[] args) {
        //System.out.println(findMaxAverage2(new int []{-1},1));
        System.out.println(findMaxAverage2(new int []{1,12,-5,-6,50,3},4));
        //System.out.println(findMaxAverage2(new int []{4,0,4,3,3},5));
        //System.out.println(findMaxAverage2(new int []{7,4,5,8,8,3,9,8,7,6},7));
        //System.out.println(findMaxAverage2(new int []{9,7,3,5,6,2,0,8,1,9},6));
    }
    public static double findMaxAverage(int[] nums, int k) {
        double maxAvg=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-k+1;i++){
            double temp=0;
            for(int j=i; j<i+k;j++){
                temp+=nums[j];
            }
            maxAvg=Double.max(temp/k,maxAvg);
        }
        return maxAvg;
    }

    public static double findMaxAverage2(int nums[],int k){
        for(int i=1;i<nums.length;i++)
            nums[i]=nums[i]+nums[i-1];

        double max= nums[k-1];
        for(int i=0;i<nums.length-k;i++)
            max=Double.max(max,nums[i+k]-nums[i]);
        if(nums.length==k)
            max=nums[k-1];
        return max/k;
    }

    public static double findMaxAverage3(int nums[],int k){
        double max=0;
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
            if(i==k-1){
                max=nums[k-1];
            }else if(i>k){
                max=Double.max(max,nums[i+k]-nums[i]);
            }
        }
        return max/k;
    }
}
