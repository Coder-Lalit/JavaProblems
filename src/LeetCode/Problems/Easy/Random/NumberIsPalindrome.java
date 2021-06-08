package LeetCode.Problems.Easy.Random;

public class NumberIsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        int temp =0;
        int y=x;
        while(x/10 !=0){
            temp = temp*10+ x%10;
            x= x/10;
        }
        temp=temp*10+ x%10;
        return temp==y?true:false;
    }
}
