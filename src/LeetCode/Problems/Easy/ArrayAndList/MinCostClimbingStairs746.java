package LeetCode.Problems.Easy.ArrayAndList;

public class MinCostClimbingStairs746 {
    public static int minCostClimbingStairs(int[] cost) {
        if(cost.length==3){
            return cost[0]+cost[2]<cost[1]?cost[0]+cost[2]:cost[1];
        }
        int sum=0;
        int i = cost[cost.length-2]<=cost[cost.length-1]?cost.length-2:cost.length-1;
        sum+=cost[i];
        while(i>2){
            if(cost[i-1]<=cost[i-2]){
                i--;
            }else {
                i-=2;
            }
            sum+=cost[i];
        }
        return sum;
    }

    public static int minCostClimbingStairs2(int[] cost) {
        int first = 0;
        int second = 0;
        for(int i=2; i < cost.length+1; i++)
        {
            int temp  = Math.min(first + cost[i-2], second + cost[i-1] );
            first = second;
            second = temp;
        }

        return second;
    }

    public static void main(String[] args) {
        System.out.println("\n"+minCostClimbingStairs(new int [] {1,100,1,1,1,100,1,1,100,1}));
        System.out.println("\n"+minCostClimbingStairs(new int [] {0,1,1,1}));
        System.out.println(minCostClimbingStairs(new int [] {10,15,3}));
        System.out.println(minCostClimbingStairs(new int [] {10,15,20}));
        System.out.println(minCostClimbingStairs(new int [] {10,12,20,12,12,50}));
    }
}
