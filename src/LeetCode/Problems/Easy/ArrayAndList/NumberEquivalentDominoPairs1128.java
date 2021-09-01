package LeetCode.Problems.Easy.ArrayAndList;

import java.util.*;

public class NumberEquivalentDominoPairs1128 {
    public static int numEquivDominoPairs2(int[][] d) {
        int pair=0;
        for (int i=0;i< d.length-1;i++ ){
            Arrays.sort(d[i]);
        }

        return pair;
    }

    public static void main(String[] args) {
        //System.out.println(numEquivDominoPairs(new int[][]{{1,2},{2,1},{3,4},{5,6}}));
        //System.out.println(numEquivDominoPairs(new int[][]{{1,2},{1,2},{1,1},{1,2},{2,2}}));
    }
}
