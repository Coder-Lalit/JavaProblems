package LeetCode.Problems.Easy.Array;

import java.util.HashSet;

public class LargestTriangleArea812 {
    public double largestTriangleArea(int[][] points) {
        double lArea = Double.MIN_VALUE;
        for(int i=0;i<points.length-2;i++){
            for(int j=i+1;j<points.length-1;j++){
                for(int k=j+1;k<points.length;k++){
                    lArea = Math.max(lArea,areaOfTriangle(points[i],points[j],points[k]));
                }
            }
        }
        return lArea;
    }

    double areaOfTriangle(int[]x,int[]y,int [] z){
        return (double) 0.5 * Math.abs(x[0]*(y[1] - z[1]) + y[0]*(z[1] - x[1] )+ z[0]*(x[1] - y[1]));
    }


    public static void main(String[] args) {
        LargestTriangleArea812 l = new LargestTriangleArea812();
        System.out.println(l.largestTriangleArea(new int[][] {{0,0},{0,1},{1,0},{0,2},{2,0}}));
    }
}
