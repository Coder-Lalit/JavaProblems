package LeetCode.Problems.Easy.ArrayAndList.TwoDArray;

import java.util.Arrays;
import java.util.HashMap;

public class RankTransformMatrix {

    public static int[][] matrixRankTransform(int[][] mat) {
        int[][] ans = new int[mat.length][mat[0].length];

        for (int i = 0; i < mat.length; i++) {
            int[] clone = mat[i].clone();
            Arrays.sort(clone);

            HashMap<Integer, Integer> map = new HashMap<>();
            int c=1;
            for (int j = 0; j < clone.length; j++) {
                if (!map.containsKey(clone[j])) {
                    map.put(clone[j], c++);
                }
            }
            for (int k = 0; k < mat[i].length; k++) {
                ans[i][k] = map.get(mat[i][k]);
            }
        }
        while (rowCheck(ans, mat) || colCheck(ans, mat)) {
            colCheck(ans, mat);
            rowCheck(ans, mat);
        }

        return ans;
    }

    static boolean rowCheck(int ans[][], int mat[][]) {
        boolean rowCheck = false;
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                for (int k = 0; k < ans[0].length; k++) {
                    if (mat[i][j] < mat[i][k] && ans[i][j] >= ans[i][k]) {
                        ans[i][k] = ans[i][j] + 1;
                        rowCheck = true;
                        break;
                    } else if (mat[i][j] == mat[i][k] && ans[i][j] != ans[i][k]) {
                        if (ans[i][j] > ans[i][k]) {
                            ans[i][k] = ans[i][j];
                        } else {
                            ans[i][j] = ans[i][k];
                        }
                        rowCheck = true;
                        break;
                    }
                }
            }
        }
        return rowCheck;
    }

    static boolean colCheck(int ans[][], int mat[][]) {
        boolean colCheck = false;
        for (int i = 0; i < ans[0].length; i++) {
            for (int j = 0; j < ans.length; j++) {
                for (int k = 0; k < ans.length; k++) {
                    if (mat[j][i] < mat[k][i] && ans[j][i] >= ans[k][i]) {
                        ans[k][i] = ans[j][i] + 1;
                        colCheck = true;
                        break;
                    }  else if (mat[j][i] == mat[k][i] && ans[j][i] != ans[k][i]) {
                        if (ans[j][i] > ans[k][i]) {
                            ans[k][i] = ans[j][i];
                        } else {
                            ans[j][i] = ans[k][i];
                        }
                        colCheck = true;
                        break;
                    }
                }
            }
        }
        return colCheck;
    }

    static void print2D(int[][] ans, int [][] mat) {
        for (int i=0;i<ans.length;i++) {
            for (int j=0;j<ans[0].length;j++) {
                System.out.print("|"+mat[i][j]+"("+ans[i][j]+")|\t");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        //int [][] input = new int[][]{{20,-21,14},{-19,4,19},{22,-47,24},{-19,4,19}};
        //int [][] input = new int[][]{{7,3,6},{1,4,5},{9,8,2}};
        //int [][] input = new int[][]{{-37,-50,-3,44},{-37,46,13,-32},{47,-42,-3,-40},{-17,-22,-39,24}};
        //int[][] input = new int[][]{{-2, -35, -32, -5, -30, 33, -12}, {7, 2, -43, 4, -49, 14, 17}, {4, 23, -6, -15, -24, -17, 6}, {-47, 20, 39, -26, 9, -44, 39}, {-50, -47, 44, 43, -22, 33, -36}, {-13, 34, 49, 24, 23, -2, -35}, {-40, 43, -22, -19, -4, 23, -18}};
        int[][] input = new int[][]{
                {-32,15,38,17,-44,43,42,-47,-44,-41},
                {34,-43,-24,7,-10,-43,36,-5,-22,37},
                {4,-13,-38,49,16,-21,30,13,-20,47},
                {2,-35,32,11,26,-31,40,31,-46,-7},
                {4,19,18,-27,16,43,-10,-11,44,39},
                {18,9,48,-29,30,5,8,-13,-42,-43},
                {48,47,30,29,24,-29,22,-31,12,-37},
                {38,-23,44,-13,-46,37,-12,31,14,-31},
                {-28,23,-50,-23,12,23,18,-11,-44,31},
                {-10,37,16,11,-18,17,40,-41,26,-31}
        };

        print2D(matrixRankTransform(input),input);
    }
}
