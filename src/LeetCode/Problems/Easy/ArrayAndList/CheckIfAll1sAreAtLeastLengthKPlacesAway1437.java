package LeetCode.Problems.Easy.ArrayAndList;

public class CheckIfAll1sAreAtLeastLengthKPlacesAway1437 {
    public static boolean kLengthApart(int[] nums, int k) {
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (index != -1 && !(i - 1 - index >= k)) return false;
                index = i;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //System.out.println(kLengthApart(new int[]{1, 0, 0, 0, 1, 0, 0, 1}, 2));
        System.out.println(kLengthApart(new int[]{1, 0, 0, 1, 0, 1}, 2));
        System.out.println(kLengthApart(new int[]{1, 1, 1, 1, 1}, 0));
        System.out.println(kLengthApart(new int[]{0, 1, 0, 1}, 1));
    }
}
