package LeetCode.Problems.Easy.ArrayAndList;

import java.util.Arrays;

public class SpecialArrayWithXElementsGreaterThanOrEqualX1608 {

    public static int specialArray(int[] nums) {
        Arrays.sort(nums);
        for(int i =1; i<=nums.length;i++){
            for(int j =0; j<nums.length;j++){
                if(i <= nums[j]){
                    if (i == nums.length-j){
                        return i;
                    }else{
                        break;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(specialArray(new int[]{3,5}));
    }


}
