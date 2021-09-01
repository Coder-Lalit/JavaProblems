package LeetCode.Problems.Easy.ArrayAndList;

public class RangeAdditionII598 {
    public static void main(String args[]){
        System.out.println(maxCount(3,3,new int[][] {{2,2},{3,3}}));
    }

    public static int maxCount(int m, int n, int[][] ops) {
        for(int i=0;i<ops.length;i++){
            m=m<ops[i][0]?m:ops[i][0];
            n=n<ops[i][1]?n:ops[i][1];
        }
        return m*n;
    }
}
