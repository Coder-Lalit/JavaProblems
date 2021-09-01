package LeetCode.Problems.Easy.ArrayAndList;

import java.util.HashMap;

public class ContainsDuplicate217 {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int []{1,2,3,4}));
    }
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            else{
                map.put(nums[i],1);
            }
        }
        return false;
    }
}
