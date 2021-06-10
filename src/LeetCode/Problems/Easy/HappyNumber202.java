package LeetCode.Problems.Easy;

public class HappyNumber202 {
    public static void main(String[] args) {

    }

    public static boolean happyNumber(int n){
        int sum=0;
        while(n/10!=0){
            sum+=Math.pow(n%10,2);
        }
        if(sum==1){
            return true;
        }
        else if(sum==n){
            return false;
        }
    }
}
