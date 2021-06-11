package LeetCode.Problems.Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HappyNumber202 {
    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }

    public static boolean isHappy(int n){
        List<Integer> list=new ArrayList<>();
        while (!list.contains(n)){
            list.add(n);
            n=nextNum(n);
            System.out.println(list.toString());
        }
        return n==1?true:false;
    }

    public static int nextNum(int n){
        int sum=0;
        while(n!=0){
            sum+=Math.pow(n%10,2);
            n=n/10;
        }
        return sum;
    }
}
