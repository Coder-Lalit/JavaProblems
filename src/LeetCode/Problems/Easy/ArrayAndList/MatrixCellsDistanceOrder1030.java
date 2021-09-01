package LeetCode.Problems.Easy.ArrayAndList;

import java.util.*;

public class MatrixCellsDistanceOrder1030 {
    public static int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        HashMap<Integer, List<int[]>> map = new HashMap<>();
        int max =0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int x = Math.abs(i - rCenter) + Math.abs(j - cCenter);
                map.put(x, map.getOrDefault(x, new ArrayList<>()));
                map.get(x).add(new int[]{i, j});
                max= x > max ? x:max;
            }
        }
        int ans[][] = new int[rows * cols][1];
        int a = 0;
        int c =0;
        while(c<=max){
            for(int []y : map.get(c)){
                ans[a]=y;
                a++;
            }
            c++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] ints = allCellsDistOrder(2, 2, 0, 1);
        for (int[] x : ints) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println("");
        }
    }
}
