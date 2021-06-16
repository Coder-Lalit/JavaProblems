package LeetCode.Problems.Easy.Random;

public class MoveZeroes283 {
    public static void main(String[] args) {
        moveZeroes(new int []{0,1,0,3,12});

    }

    public static void moveZeroes(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
            else{
                if(count>0){
                     nums[i-count]=nums[i];
                     nums[i]=0;
                }
            }
        }
        for (int i=0;i<nums.length;i++){
            System.out.println(nums[i]+" ");
        }
        System.out.println("==================");
    }
}
