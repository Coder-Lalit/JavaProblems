package LeetCode.Problems.Easy.Random;

public class climbStairs {
    public static void main(String[] args) {
        for(int i=1;i<12;i++){
            System.out.println("Stair count :"+i+" Step Count :"+climbStairs(i));
        }
    }

    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
