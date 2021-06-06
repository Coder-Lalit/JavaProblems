package LeetCode.Problems.Easy.Array;

public class ProblemFindMedianSortedArrays {
    public static void main(String[] args) {
        int[] num1 = {};
        int[] num2 = {1};
        System.out.println(findMedianSortedArrays(num1, num2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

            int i = 0, j = 0, k = 0, k1 = 0;
            int n1 = nums1.length;
            int n2 = nums2.length;
            double out = 0.0;
            k1 = (n1 + n2) / 2;

            int[] merge = new int[k1 + 1];

            while (i < n1 && j < n2 && k <= k1) {
                if (nums1[i] < nums2[j]) {
                    merge[k] = nums1[i];
                    k++;
                    i++;
                } else {
                    merge[k] = nums2[j];
                    k++;
                    j++;
                }
            }

            while (i < n1 && k <= k1) {
                merge[k] = nums1[i];
                k++;
                i++;
            }

            while (j < n2 && k <= k1) {
                merge[k] = nums2[j];
                k++;
                j++;
            }

            if ((n1 + n2) % 2 == 0) {
                out = ((merge[k1] + merge[k1 - 1]) / 2.0);
            } else {
                out = merge[k1];
            }

            return out;
    }
}
