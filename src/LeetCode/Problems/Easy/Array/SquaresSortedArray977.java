package LeetCode.Problems.Easy.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SquaresSortedArray977 {
    public int[] sortedSquares(int[] nums) {


        int a [] = new int[nums.length];



        for(int i=0;i<nums.length;i++){
            a[i]=nums[i]*nums[i];
        }
        Arrays.sort(a);
        return a;
    }
}
