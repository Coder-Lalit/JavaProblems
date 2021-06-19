package LeetCode.Problems.Easy.Array;

import java.util.*;

public class FindAllNumbersDisappearedArray448 {
    public static void main(String[] args) {
        FindAllNumbersDisappearedArray448 a = new FindAllNumbersDisappearedArray448();
        System.out.println(a.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}).toString());
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!res.contains(nums[i])){
                res.add(nums[i]);
            }
        }
        for(int i=1;i<=nums.length;i++){
            if(res.contains(i)){
                res.remove((Integer)i);
            }else {
                res.add(i);
            }
        }
        return res;
    }
}
