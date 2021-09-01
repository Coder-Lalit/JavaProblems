package LeetCode.Problems.Easy.ArrayAndList;

public class MaxConsecutiveOnes485 {
    public static void main(String[] args) {
        int nums []=new int[]{1};
        int s=-1;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                s=s==-1?i:s;
            }else if (s!=-1){
                max=max < (i-s)?i-s:max;
                s=-1;
            }
        }
        if(s!=-1){
            max=max < (nums.length-s)?nums.length-s:max;
        }
        System.out.println(max);
    }
}
