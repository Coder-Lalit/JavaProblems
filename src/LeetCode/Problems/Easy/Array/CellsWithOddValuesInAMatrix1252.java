package LeetCode.Problems.Easy.Array;

public class CellsWithOddValuesInAMatrix1252 {
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] ans = new int [m][n];
        int r[] = new int [m];
        int c[] = new int [n];
        for(int[] x : indices){
            r[x[0]]++;
            c[x[1]]++;
        }

        for(int i =0; i<m ;i++){
            if(r[i]%2!=0){
                for(int j=0;j<n;j++){
                    ans[i][j]++;
                }
            }
        }

        for(int i =0; i<n ;i++){
            if(c[i]%2!=0){
                for(int j=0;j<m;j++){
                    ans[j][i]++;
                }
            }
        }
        int res =0;
        for(int [] x : ans){
            for(int y : x){
                System.out.print(y+" ");
                if(y%2!=0) res++;
            }
            System.out.println("");
        }
        return res;
    }

    public static void main(String[] args) {
        //oddCells(2,3,new int[][]{{0,1},{1,1}});
        oddCells(48,37,new int[][]{{40,5}});
    }
}
