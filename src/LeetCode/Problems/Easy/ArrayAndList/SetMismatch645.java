package LeetCode.Problems.Easy.ArrayAndList;

import java.util.HashMap;

public class SetMismatch645 {
    public static void main(String[] args) {
        findErrorNums(new int []{1,1});
    }
    public static int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int d=-1;
        int m=-1;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])==2){
                d=nums[i];
            }
        }
        for(int i=1;i<nums.length;i++){
            if(!map.containsKey(i)){
                m=i;
                break;
            }
        }
        return new int []{d,m};

    }
}
