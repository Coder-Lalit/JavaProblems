package LeetCode.Problems.Easy.Random;

import sun.font.DelegatingShape;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumber507 {
    public static void main(String[] args) {
        PerfectNumber507 p = new PerfectNumber507();
        System.out.println(p.checkPerfectNumber(2016));
    }
    public boolean checkPerfectNumber(int num) {
        int sum=1;
        for(int i =2;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
                System.out.println(i+" --> "+sum+" ");
            }
        }
        if(sum==num){
            return true;
        }
        return false;
    }
}
