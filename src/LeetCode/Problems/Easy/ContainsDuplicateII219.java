package LeetCode.Problems.Easy;

public class ContainsDuplicateII219 {
    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int []{1,2,3,1,2,3},2));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            int x= i-k<0?0:i-k;
            int y= (i+k)<(nums.length-1)?i+k:nums.length-1;
            while(x<=y){
                if(nums[i]==nums[x] && x!=i)
                    return true;
                x++;
            }
        }
        return false;
    }
}
