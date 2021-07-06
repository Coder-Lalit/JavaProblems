package LeetCode.Problems.Easy.Array;

import java.util.Arrays;

public class KthLargest703 {
    public static class KthLargest {
        int max[];
        public KthLargest(int k, int[] nums) {
            max = new int[k];
            for (int i = 0; i < max.length; i++) {
                max[i] = Integer.MIN_VALUE;
            }
            Arrays.sort(nums);
            for(int i=nums.length-1; i >=0;i--){
                if(k>0){
                    max[k-1]=nums[i];
                    k--;
                }else{
                    break;
                }

            }
        }

        public int add(int val) {
            if (val < max[0]) return max[0];
            else {
                max[0] = val;
                for (int i = 1; i < max.length; i++) {
                    if (max[i] < val) {
                        max[i - 1] = max[i];
                        max[i] = val;
                    }
                }
                return max[0];
            }
        }
    }

    public static void main(String[] args) {
        KthLargest k = new KthLargest(2, new int[]{0});
        System.out.println(k.add(-1));
        System.out.println(k.add(1));
        System.out.println(k.add(-2));
        System.out.println(k.add(-4));
        System.out.println(k.add(3));
    }

}
