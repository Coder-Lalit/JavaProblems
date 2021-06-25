package LeetCode.Problems.Easy.Random;

public class SqrtX {
    public static void main(String[] args) {
        //System.out.println(mySqrt(8));
        //System.out.println(mySqrt(4));
        System.out.println(mySqrt(12));
        //System.out.println(mySqrt(99));
//        System.out.println(mySqrt(1));
//        System.out.println(mySqrt(2147483647));
//        System.out.println(mySqrt2(2147483647));
    }

    public static int mySqrt(int x) {
        int r =x/2;
        int l=  2;
        long n;
        if(x<2) return 1;
        while (l<=r){
            int m = l+(r-l)/2;
            long nSquare = (long)m*m;
            if(x>nSquare) l=m+1;
            else if(x<nSquare) r=m-1;
            else return m;
        }
        return r;
    }

    public static int mySqrt2(int x) {
        if (x < 2) return x;

        long num;
        int pivot, left = 2, right = x / 2;
        while (left <= right) {
            pivot = left + (right - left) / 2;
            num = (long)pivot * pivot;
            if (num > x) right = pivot - 1;
            else if (num < x) left = pivot + 1;
            else return pivot;
        }

        return right;
    }
}
