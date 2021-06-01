package LeetCode.Problems.Easy;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(String.format("Reverse of %s is %s",a,reverse(a)));
    }

    public static int reverse(int x) {
        long rev = 0;
        if(x==0){
            rev=0;
        }
        else{
            while(x/10!=0 ){
                rev = rev*10+x%10;
                x=x/10;
            }
            rev=rev*10+x;
        }
        if(rev > (Integer.MAX_VALUE-1) || rev < Integer.MIN_VALUE ){
            rev =0;
        }

        return (int)rev;
    }
}
