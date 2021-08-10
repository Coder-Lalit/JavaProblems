package LeetCode.Problems.Easy.Random;

public class NthTribonacciNumber1137 {
    public static int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        return tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
    }


    public static int tribonacci2(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        int [] tri = new int[]{0,1,1};

        for(int i=3;i<=n;i++){
            int triSum = tri[0]+tri[1]+tri[2];
            tri[0]=tri[1];
            tri[1]=tri[2];
            tri[2]=triSum;
        }
        return tri[2];
    }

    public static void main(String[] args) {
        //System.out.println(tribonacci(37));
        System.out.println(tribonacci2(37));
    }
}
