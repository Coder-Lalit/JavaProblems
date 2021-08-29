package LeetCode.Problems.Easy.String;

import java.util.Arrays;
import java.util.HashMap;

public class HowManyNumbersAreSmallerThanTheCurrentNumber1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int clone[] = nums.clone();
        HashMap<Integer,Integer> map = new HashMap<>();
        Arrays.sort(clone);
        for(int i =0; i< clone.length;i++){
            if(!map.containsKey(clone[i])){
                map.put(clone[i],i);
            }
        }

        for(int i=0;i<nums.length;i++){
            nums[i]=map.get(nums[i]);
        }
        return nums;
    }
}
