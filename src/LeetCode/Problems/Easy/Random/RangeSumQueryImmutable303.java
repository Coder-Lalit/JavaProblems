package LeetCode.Problems.Easy.Random;

public class RangeSumQueryImmutable303 {
    final int [] num;
    public RangeSumQueryImmutable303(int[] nums) {
        this.num = nums;
    }

    public int sumRange(int left, int right) {
        int x=0;
        while (left<=right) {
            x+=num[left];
            left++;
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
    }
}
