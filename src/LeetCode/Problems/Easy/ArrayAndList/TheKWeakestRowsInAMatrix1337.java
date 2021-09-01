package LeetCode.Problems.Easy.ArrayAndList;

import java.util.*;

public class TheKWeakestRowsInAMatrix1337 {
    public static int[] kWeakestRows(int[][] mat, int k) {
        List<int[]> rowRank = new ArrayList<>();

        for(int i=0; i<mat.length;i++){
            int sum=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1) sum++;
            }
            rowRank.add(new int[]{i,sum});
        }



        Comparator<int []> myComp = new Comparator<int []>() {
            @Override
            public int compare(int [] o1, int [] o2) {
                if(o1[1]!=o2[1]){
                    return o1[1]-o2[1];
                }else{
                    return o1[0]-o2[0];
                }
            }
        };

        Collections.sort(rowRank,myComp);

        int [] res = new int [k];
        for(int i=0; i<k;i++){
            res[i]=rowRank.get(i)[0];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] clone = kWeakestRows(new int[][]
                {{1, 1, 0, 0, 0},
                        {1, 1, 1, 1, 0},
                        {1, 0, 0, 0, 0},
                        {1, 1, 0, 0, 0},
                        {1, 1, 1, 1, 1}}, 3);

        for(int x: clone){
            System.out.println(x);
        }
    }
}
