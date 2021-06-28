package LeetCode.Problems.Easy.Array;

public class ReshapeMatrix566 {
    public static void main(String[] args) {
        int[][] ints = matrixReshape(new int[][]{{1, 2}, {3, 4}}, 1, 4);
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {

        if(!(mat.length*mat[0].length==r*c))
            return mat;
        else {
            int x=0, y=0;
            int [][]reshape = new int[r][c];
            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat[i].length;j++){
                    reshape[x][y]=mat[i][j];
                    if(y<c){
                       y++;
                    }else if(x<r){
                        x++;
                        y=0;
                    }
                }
            }
            return reshape;
        }
    }
}
