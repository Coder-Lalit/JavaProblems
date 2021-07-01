package LeetCode.Problems.Easy.Array;

public class CanPlaceFlowers605 {

    public static void main(String[] args) {
        //System.out.println(canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
        //System.out.println(canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
        System.out.println(canPlaceFlowers(new int[]{1, 0, 1, 0, 1, 0, 1}, 1));
    }

    public static boolean canPlaceFlowers(int[] f, int n) {
        if (n == 0)
            return true;
        if (f.length == 1 ) {
            if(f[0] == 1)
                return false;
            else {
                if (n==1)
                    return true;
            }
        }

        for (int i = 0; i < f.length; i++) {
            if (i == 0) {
                if (f[i + 1] == 0 && f[i] == 0) {
                    f[i] = 1;
                    n--;
                }
            } else if (i + 1 == f.length) {
                if (f[i] == 0 && f[i - 1] == 0) {
                    f[i] = 1;
                    n--;
                }
            } else {
                if (f[i - 1] == 0 && f[i] == 0 && f[i + 1] == 0) {
                    f[i] = 1;
                    n--;
                }
            }
            if (n == 0) {
                return true;
            }
        }
        return false;
    }
}
