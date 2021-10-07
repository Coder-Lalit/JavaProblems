package LeetCode.Problems.Easy;

import java.util.Arrays;

public class SumOfAllOddLengthSubarrays1588 {

    public static int sumOddLengthSubarrays1(int[] arr) {
        int sumArr [] = new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            sumArr[i+1]+=sumArr[i]+arr[i];
        }
        System.out.println(Arrays.toString(sumArr));
        int i=1;
        int sum =0;
        while(i<sumArr.length){
            for(int j=i;j<sumArr.length;j++){
                sum+=sumArr[j]-sumArr[j-i];
            }
            i+=2;
        }
        return sum;
    }

    public static int sumOddLengthSubarrays(int[] arr) {
        int i =0;
        int sum=0;
        int mf = arr.length % 2 ==0 ? arr.length/2:arr.length/2+1;
        while (i<mf){
            if(i!=arr.length-1-i){
                sum+= (arr[i] + arr[arr.length-1-i]) * (mf+i);
            }else{
                sum+= (arr[i]) * (mf+i);
            }
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOddLengthSubarrays(new int[]{1,4,2,5,3}));
        System.out.println(sumOddLengthSubarrays(new int[]{1,2}));
    }
}
