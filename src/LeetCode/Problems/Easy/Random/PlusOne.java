package LeetCode.Problems.Easy.Random;

public class PlusOne {
    public static void main(String[] args) {
        System.out.println(plusOne(new int []{1,2,3}));
        System.out.println(plusOne(new int []{0}));
        System.out.println(plusOne(new int []{9,9,9}));
    }

    public static int[] plusOne(int[] digits){
        int i = digits.length-1;
        while(i>=0 && digits[i]+1==10){
            digits[i]=0;
            i--;
        }
        if(i!=-1){
            digits[i]=digits[i]+1;
        }else{
            int [] arr = new int[digits.length+1];
            arr[0]=1;
            return arr;
        }
        return digits;
    }
}
