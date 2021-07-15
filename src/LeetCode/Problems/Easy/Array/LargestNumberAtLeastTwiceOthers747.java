package LeetCode.Problems.Easy.Array;

public class LargestNumberAtLeastTwiceOthers747 {
    public static int dominantIndex(int[] nums) {
        if(nums.length==1) return 0;
        int max1=-1;
        int max2=-1;
        int iM1=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max1){
                max2=max1;
                max1=nums[i];
                iM1=i;
            }else if(max2<nums[i]){
                max2=nums[i];
            }
        }

        return max1>= 2 * max2?iM1:-1;
    }

    public static void main(String[] args) {
        System.out.println(dominantIndex(new int[]{1,0}));
        System.out.println(dominantIndex(new int[]{3,6,1,0}));
    }
}
