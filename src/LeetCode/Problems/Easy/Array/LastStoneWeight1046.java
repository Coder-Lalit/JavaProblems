package LeetCode.Problems.Easy.Array;

import java.util.Arrays;

public class LastStoneWeight1046 {
    public static int lastStoneWeight(int[] stones) {
        if(stones.length==1){
            return stones[0];
        }
        Arrays.sort(stones);
        while(stones[stones.length-2]!=0){
            if(stones[stones.length-2] == stones[stones.length-1])
            {
                stones[stones.length-2] =0;
                stones[stones.length-1] =0;
            }else{
                stones[stones.length-1] = stones[stones.length-1]-stones[stones.length-2];
                stones[stones.length-2] =0;
            }
            Arrays.sort(stones);
        }
        return stones[stones.length-1];
    }

    public static void main(String[] args) {
        System.out.println(lastStoneWeight(new int[]{2,7,4,1,8,1}));
    }
}
