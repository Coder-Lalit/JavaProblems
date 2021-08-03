package LeetCode.Problems.AugustLeetCodingChallenge2021;

import java.util.HashMap;

public class TwoSum1 {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            map.put(nums[i], i);
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && i!=map.get(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] x = twoSum(new int[]{3, 2, 4}, 6);
        System.out.print(x[0] + " " + x[1]);
    }
}

