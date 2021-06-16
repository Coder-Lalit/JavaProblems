package LeetCode.Problems.Easy.Random;

public class NimGame292 {
    public static void main (String [] args){
        //heap of n remove max of 3 stone alternatively
        System.out.println(canWinNim(10));
    }
    public static boolean canWinNim(int n) {
        return n%4!=0 ;
    }
}
