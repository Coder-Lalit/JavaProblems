package LeetCode.Problems.Easy.Random;

public class FactorialTrailingZeroes172 {
    public static void main(String[] args) {
        System.out.println(trailingZeroes2(30));
    }

    public static int trailingZeroes(int n) {
        int res =0;
        while(n/5!=0){
            res+=n/5;
            n=n/5;
        }
        return res;
    }

    public static int trailingZeroes2(int n) {
        if(n==0){
            return 0;
        }else{
            n=n/5;
            return (n+trailingZeroes(n));
        }
    }
}
