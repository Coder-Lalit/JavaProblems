package LeetCode.Problems.Easy.ArrayAndList;

public class WaterBottles1518 {

    public static int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        while (numBottles >= numExchange){
            ans += numBottles/numExchange;

            numBottles = numBottles/numExchange + numBottles%numExchange;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(numWaterBottles(9,3));
    }
}
