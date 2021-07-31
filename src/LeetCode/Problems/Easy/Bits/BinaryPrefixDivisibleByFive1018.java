package LeetCode.Problems.Easy.Bits;

import java.util.ArrayList;
import java.util.List;

public class BinaryPrefixDivisibleByFive1018 {
    public static List<Boolean> prefixesDivBy5(int[] nums) {
        int cur = 0;
        ArrayList<Boolean> res = new ArrayList<>();

        for(int i = 0 ; i < nums.length ; i++){
            cur = (2 * cur + nums[i]) % 5;
            if(cur == 0)
                res.add(true);
            else
                res.add(false);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(prefixesDivBy5(new int[]{1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1}));
    }
}
