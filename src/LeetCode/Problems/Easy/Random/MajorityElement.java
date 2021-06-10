package LeetCode.Problems.Easy.Random;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println( majorityElement(new int []{1,8,8,8,9,8,1}));
        System.out.println( majorityElement(new int []{1,8,7,8,8,6,8}));
    }

    public static int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

}
