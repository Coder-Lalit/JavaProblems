package LeetCode.Problems.Easy.ArrayAndList;

public class SortArrayByParity905 {

    public static int[] sortArrayByParity(int[] nums) {
        int l = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                if (l == i) {
                    l++;
                } else {
                    int temp = nums[l];
                    nums[l] = nums[i];
                    nums[i] = temp;
                    l++;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] ints = sortArrayByParity(new int[]{2, 6, 1, 3, 4});
        for (int x : ints) {
            System.out.println(x);
        }

    }
}
