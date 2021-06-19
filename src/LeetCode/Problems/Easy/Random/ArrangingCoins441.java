package LeetCode.Problems.Easy.Random;

public class ArrangingCoins441 {
    public static void main(String[] args) {
        int n=5;
        int c=0,s=2;
        while(n>0){
            n-=s;
            c++;
            s++;
        }
        System.out.println(c);
    }
}
