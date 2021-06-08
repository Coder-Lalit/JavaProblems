package LeetCode.Problems.Easy;

import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1,2}));
    }

    public static int singleNumber(int[] nums) {
        if(nums.length==1) return nums[0];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int a: nums) {
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }else{
                map.put(a,1);
            }
        }
        return map.entrySet().stream().filter(a->a.getValue().intValue()==1).findFirst().get().getKey();
    }
}
