package LeetCode.Problems.Easy.Random;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {
    public static void main(String[] args) {
        System.out.println(findMissingRanges(new int[]{0, 1, 3, 50, 75}, 0, 99));
        //System.out.println(findMissingRanges(new int[] {},1,1));
        //System.out.println(findMissingRanges(new int[]{}, 1, 1));
    }

    public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> res = new ArrayList<>();
        int prv = lower - 1;
        for (int i = 0; i <= nums.length; i++) {
            int cur = i!=nums.length? nums[i]:upper+1;
            if(cur-(prv+1) >=1){
                res.add(format(prv + 1, cur-1));
            }
            prv = cur;
        }
        return res;
    }

    public static String format(int x, int y) {
        if (x == y) {
            return String.valueOf(x);
        } else {
            return x  + "->" + y;
        }
    }
}
