package LeetCode.Problems.Easy.String;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz412 {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%15==0){
                res.add("FizzBuzz");
            }else if(i%3==0){
                res.add("Fizz");
            }else if(i%5==0){
                res.add("Buzz");
            }else{
                res.add(Integer.toString(i));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        FizzBuzz412 c = new FizzBuzz412();
        System.out.println(c.fizzBuzz(10).toString());
    }
}
