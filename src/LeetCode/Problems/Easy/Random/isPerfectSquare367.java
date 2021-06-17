package LeetCode.Problems.Easy.Random;

public class isPerfectSquare367 {
    public static void main(String[] args) {
        //System.out.println(isPerfectSquare(1));
        System.out.println(isPerfectSquare(808201));
    }


    public static boolean isPerfectSquare(int num) {
        if (num < 2) return true;
        long l=2;
        long r=num/2;
        long m = 0;
        while(l<=r){
            m=l+(r-l)/2;
            System.out.println(l+"--"+m+"--"+r);
            if(m*m==num)
                return true;
            if(m*m>num){
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return false;
    }
}
