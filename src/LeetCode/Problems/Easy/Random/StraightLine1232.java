package LeetCode.Problems.Easy.Random;

public class StraightLine1232 {
    public static boolean checkStraightLine(int[][] c) {
        double s = (double)(c[1][1]-c[0][1])/(double)(c[1][0]-c[0][0]);
        double [][] ans = new double[c.length][c.length];
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c.length && i!=j ;j++){
                ans[i][j]=(double)(c[i][1]-c[j][1])/(double)(c[i][0]-c[j][0]);
            }
        }
        for(double[] x : ans){
            for(double y : x){
                System.out.print(y+ " ");
            }
            System.out.println();
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkStraightLine(new int[][]{{0,0},{0,1},{0,-1}}));
        //System.out.println(checkStraightLine(new int[][]{{1,1},{2,2},{2,0}}));
    }
}
