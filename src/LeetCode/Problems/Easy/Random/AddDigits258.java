package LeetCode.Problems.Easy.Random;

public class AddDigits258 {
    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }
    public static int addDigits(int num) {
        while(num>=10){
            num=nextSum(num);
        }
        return num;
    }

    public static int nextSum(int x){
        int sum=0;
        while(x!=0){
            sum+=x%10;
            x=x/10;
        }
        return sum;
    }
}
