package LeetCode.Problems.AugustLeetCodingChallenge2021;

public class RangeSumQueryImmutable {

    static class NumArray {

        int [] myNums;
        public NumArray(int[] nums) {
            myNums=new int [nums.length+1];
            myNums[0]=0;
            for(int i=0;i<nums.length;i++){
                myNums[i+1]=myNums[i]+nums[i];
            }
        }

        public int sumRange(int left, int right) {
            return myNums[right+1]-myNums[left];
        }
    }

    public static void main(String[] args) {
        NumArray n = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(n.sumRange(0,2));
        System.out.println(n.sumRange(2,5));
        System.out.println(n.sumRange(0,5));
        System.out.println(n.sumRange(4,5));
    }
}
