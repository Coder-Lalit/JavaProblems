package LeetCode.Problems.Easy.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddArrayFormInteger989 {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int c=0;
        for(int i =num.length-1;i>=0;i--){
            int y =num[i]+k%10+c;
            if(y>9){
                ans.add(y%10);
                c=1;
            }else{
                ans.add(y);
                c=0;
            }
            k/=10;
        }
        while(k!=0){
            if(k%10+c>9){
                ans.add((k%10+c)%10);
                c=1;
            }else{
                ans.add(k%10+c);
                c=0;
            }
            k/=10;
        }

        if(c==1){
            ans.add(1);
        }

        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(addToArrayForm(new int[]{0},100000));
    }
}
