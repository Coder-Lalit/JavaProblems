package LeetCode.Problems.Easy.ArrayAndList;

import java.util.Arrays;

public class CountingElements1426 {
    public static int countElements(int[] arr) {
        Arrays.sort(arr);
        int ans = 0;
        int c = 1;
        int p = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == p) c++;
            else {
                if (arr[i] == p + 1) ans += c;
                c = 1;
                p = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        System.out.println(countElements(new int[]{1, 3, 2, 3, 5, 0}));
        System.out.println(countElements(new int[]{1, 1, 3, 3, 5, 5, 7, 7}));
        System.out.println(countElements(new int[]{1, 1, 2, 2}));
    }
}
