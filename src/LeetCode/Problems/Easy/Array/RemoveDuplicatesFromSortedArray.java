package LeetCode.Problems.Easy.Array;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,4,5};
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {
        int rD = nums[0];
        int count=1;
        for(int i=1; i<nums.length;i++){
            if(rD!=nums[i]){
                rD=nums[i];
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}
