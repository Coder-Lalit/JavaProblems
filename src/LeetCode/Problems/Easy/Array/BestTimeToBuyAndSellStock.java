package LeetCode.Problems.Easy.Array;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int []{-1,8,6,7,9,1,8}));
        //System.out.println(maxProfitMulti(new int[]{7, 1, 5, 6, 3, 6, 4}));
    }

    public static int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                max = Integer.max(prices[j] - prices[i], max);
            }
        }
        return max;
    }

    public static int maxProfit1(int[] prices) {
        int max = 0;
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            if (prices[i] - min > max) {
                max = prices[i] - min;
            }
        }
        return max;
    }

    public static int maxProfitMulti(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            if (prices[i] - min > max) {
                maxProfit += prices[i] - min;
                max = 0;
                min = prices[i];
            }
        }
        return maxProfit;
    }
}
