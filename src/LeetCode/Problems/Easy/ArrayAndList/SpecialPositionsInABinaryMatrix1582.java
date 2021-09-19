package LeetCode.Problems.Easy.ArrayAndList;

import java.util.ArrayList;
import java.util.List;

public class SpecialPositionsInABinaryMatrix1582 {

    public int numSpecial(int[][] mat) {
        int res =0;
        List<Integer> colList = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            int c = 0;
            int col = -1;
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    c++;
                    col=j;
                }
                if (c == 2) break;
            }
            if (c == 1) {
                c=0;
                for(int k=0;k<mat.length;k++){
                    if (mat[k][col] == 1)c++;
                    if (c == 2) break;
                }
                if(c==1) res++;
            }
        }

        return res;
    }

}
