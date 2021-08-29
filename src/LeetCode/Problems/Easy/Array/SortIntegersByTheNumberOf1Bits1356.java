package LeetCode.Problems.Easy.Array;

import java.util.Arrays;

public class SortIntegersByTheNumberOf1Bits1356 {
    public static int[] sortByBits(int[] arr) {
        int [][] pair = new int [arr.length][2];

        for(int i=0;i<arr.length;i++){
            pair[i][0]=arr[i];
            pair[i][1]=Integer.bitCount(arr[i]);
        }

        Arrays.sort(pair,(a,b)->{
            if(a[1]!=b[1]) return a[1]-b[1];
            else return a[0]-b[0];
        });
        for(int i=0;i<arr.length;i++){
            arr[i]= pair[i][0];
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        //int[] arr = {1024,512,256,128,64,32,16,8,4,2,1};
        for(int x: sortByBits(arr)){
            System.out.print(x+" ");
        }
    }
}
