package LeetCode.Problems.Easy.Array;

import java.util.ArrayList;
import java.util.List;

public class Shift2DGrid1260 {
    public static void shiftGrid(int[][] grid, int k) {
        k = k % grid[0].length;

        int order []= new int[grid[0].length];
        order[0]= k;
        for(int i=1;i<grid[0].length;i++){
            order[i]=(order[i-1]+k)%grid[0].length;
        }

        for (int x:order){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        shiftGrid(new int[][]{{3,8,1,9},{19,7,2,5},{4,6,11,10},{12,0,21,13}},4);
    }
}
