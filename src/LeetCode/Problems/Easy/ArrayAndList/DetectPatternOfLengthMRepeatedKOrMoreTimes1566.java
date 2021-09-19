package LeetCode.Problems.Easy.ArrayAndList;

public class DetectPatternOfLengthMRepeatedKOrMoreTimes1566 {
    public static boolean containsPattern(int[] arr, int m, int k) {
        int c = 0;
        for (int i = 0; i < arr.length - m; i++) {
            int j = i + m;
            int x=0;
            while (i < j && i+m < arr.length) {
                if (arr[i] != arr[i + m]) {
                    break;
                }
                x++;
                i++;
            }

            if (x==m) {
                c++;
                i--;
            }
            else c = 0;
            if (c + 1 == k) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsPattern(new int[]{2,1,1,2,2,1,2,2,1,2}, 1, 3));
//        System.out.println(containsPattern(new int[]{2,2}, 1, 2));
//        System.out.println(containsPattern(new int[]{1, 2, 4, 4, 4, 4}, 1, 3));
//        System.out.println(containsPattern(new int[]{2,2,1,2,2,1,1,1,2,1}, 2, 2));
//        System.out.println(containsPattern(new int[]{1, 2, 2, 2, 1, 2, 2, 2}, 1, 3));
//        System.out.println(containsPattern(new int[]{1, 2, 1, 2, 1, 1, 1, 3}, 2, 2));
//        System.out.println(containsPattern(new int[]{1, 2, 3, 1, 2}, 2, 2));
//        System.out.println(containsPattern(new int[]{2, 2, 2, 2}, 2, 3));
    }
}
