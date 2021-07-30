package LeetCode.Problems.Easy.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumEvenNumbersAfterQueries985 {
    public static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int sum = 0;
        int res[] = new int[queries.length];
        for (int x : nums) {
            if (x % 2 == 0) {
                sum += x;
            }
        }

        for (int i = 0; i < queries.length; i++) {
            int[] y = queries[i];
            if (nums[y[1]] % 2 == 0) {
                if ((nums[y[1]] + y[0]) % 2 == 0)
                    sum += y[0];
                else
                    sum -= nums[y[1]];
            }else{
                if ((nums[y[1]] + y[0]) % 2 == 0)
                    sum += nums[y[1]] + y[0];
            }

            nums[y[1]] = nums[y[1]] + y[0];
            res[i] = sum;

        }

        return res;
    }

    public static void main(String[] args) {
        //Input: nums = [1,2,3,4], queries = [[1,0],[-3,1],[-4,0],[2,3]]
        //        Output: [8,6,2,4]
        for (int x : sumEvenAfterQueries(new int[]{1, 2, 3, 4}, new int[][]{{1, 0}, {-3, 1}, {-4, 0}, {2, 3}})) {
            System.out.println(x);
        }

        List<Integer> a = new ArrayList<>();
        Collections.reverse(a);
    }
}
