package LeetCode.Problems.Easy.ArrayAndList;

import java.util.Arrays;

public class MaximumUnitsOnATruck1710 {
    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->{
            return b[1]-a[1];
        });

        for (int a[]: boxTypes)
            System.out.println(Arrays.toString(a));

        int i=0;
        int x=0;
        int t =0;
        while(i<truckSize){
            if(boxTypes[x][0]<(truckSize-i)){
                i+=boxTypes[x][0];
                t+=boxTypes[x][0] * boxTypes[x][1];
                x++;
            }else{
                t+=(truckSize-i) * boxTypes[x][1];
                break;
            }
        }
        return t;
    }

    public static void main(String[] args) {
        System.out.println(maximumUnits(new int[][]{{5,10},{2,5},{4,7},{3,9}},10));
    }
}
