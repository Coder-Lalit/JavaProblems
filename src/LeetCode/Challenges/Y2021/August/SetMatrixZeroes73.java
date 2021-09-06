package LeetCode.Challenges.Y2021.August;

import java.util.ArrayList;
import java.util.List;

public class SetMatrixZeroes73 {
    public void setZeroes(int[][] matrix) {
        List<int[]> zeroPos = new ArrayList<>();
        for(int i=0; i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    zeroPos.add(new int[]{i,j});
                }
            }
        }
        for(int [] x: zeroPos){
            makeHorizonZero(x[0],matrix);
            makeVerticalZero(x[1],matrix);
        }

        return;
    }
    void makeHorizonZero(int i, int [][] mat){
        for(int j=0; j<mat[0].length;j++){
            mat[i][j]=0;
        }
    }

    void makeVerticalZero(int j,int[][] mat){
        for(int i=0; i<mat.length;i++){
            mat[i][j]=0;
        }
    }
}
