package LeetCode.Problems.Easy.Random;

public class PowerOfTwo231 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(-8));
    }

    public static boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
        while (n % 2 == 0) n /= 2;
        return n == 1;
    }
}
