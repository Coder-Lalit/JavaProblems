package LeetCode.Problems.Easy.Bits;

public class ReverseBits190 {
    public static int reverseBits(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans <<= 1;
            System.out.println(ans<<=1);
            ans = ans | (n & 1);
            n >>= 1;
            System.out.println(n>>=1);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(reverseBits(Integer.MAX_VALUE));
    }
}
