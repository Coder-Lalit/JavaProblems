package LeetCode.Problems.Easy.Array.TwoDArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuckyNumbersInAMatrix1380 {
    public static List<Integer> luckyNumbers1(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int min[] = new int[matrix.length];

        for(int i=0; i<matrix.length;i++){
            int[] clone = matrix[i].clone();
            Arrays.sort(clone);
            min[i]=clone[0];
        }

        for(int i=0; i<matrix[0].length;i++){
            int max = Integer.MIN_VALUE;
            int r =0;
            int c =0;
            for(int j=0;j<matrix.length;j++){
                if(max < matrix[j][i]){
                    max = matrix[j][i];
                    r=j;
                }

            }
            if(max == min[r]){
                ans.add(max);
            }
        }
        return ans;
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int min[] = new int[matrix.length];
        for(int i=0; i<matrix[0].length;i++){
            int max = Integer.MIN_VALUE;
            int r =0;
            for(int j=0;j<matrix.length;j++){
                if(max < matrix[j][i]){
                    max = matrix[j][i];
                    r=j;
                }

            }
            if(min[r]==0){
                int minR = Integer.MAX_VALUE;
                for(int j=0;j<matrix[0].length;j++){
                    if(minR > matrix[r][j]){
                        minR = matrix[r][j];
                    }

                }
                min[r]=minR;
            }
            if(max == min[r]){
                ans.add(max);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] ints = {{3, 7, 8}, {9, 11, 13}, {15, 16, 17}};
        for(int x: luckyNumbers(ints)){
            System.out.println(x);
        }
    }
}
