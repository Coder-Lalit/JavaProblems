package LeetCode.Problems.Easy.Array;

public class RangeAdditionII598 {
    public static void main(String args[]){
        System.out.println(maxCount(3,3,new int[][] {{2,2},{3,3}}));
    }

    public static int maxCount(int m, int n, int[][] ops) {
        int x=Integer.MAX_VALUE,y=Integer.MAX_VALUE;
        for(int i=0;i<ops.length;i++){
           x=x<ops[i][0]?x:ops[i][0];
           y=y<ops[i][1]?y:ops[i][1];
        }
        return x*y;
    }
}
