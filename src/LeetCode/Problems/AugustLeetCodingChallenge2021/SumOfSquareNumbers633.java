package LeetCode.Problems.AugustLeetCodingChallenge2021;

import java.util.ArrayList;
import java.util.List;

public class SumOfSquareNumbers633 {
    public static boolean judgeSquareSum(int c) {
        double sqrt = Math.sqrt(c);
        if(sqrt % 1==0.0){
            return true;
        }
        List<Integer> square = new ArrayList<>();
        for(int i=1;i<=sqrt+1;i++){
            square.add(i*i);
            if(square.contains(c-(i*i))){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(judgeSquareSum(Integer.MAX_VALUE));
    }
}
