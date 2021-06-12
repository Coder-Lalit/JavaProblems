package LeetCode.Problems.Easy.String;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges228 {
    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[]{0,1,2,4,5,7}).toString());
        System.out.println(summaryRanges(new int[]{0,2,3,4,6,8,9}).toString());
        System.out.println(summaryRanges(new int[]{1}).toString());
        System.out.println(summaryRanges(new int[]{}).toString());
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> res= new ArrayList<>();
        if(nums.length==0){
            return res;
        }
        if(nums.length==1){
            res.add(String.valueOf(nums[0]));
            return res;
        }
        else{
            int cur =nums[0];
            int prv =nums[0];
            int count=0;
            for(int i=1;i<nums.length;i++){
                if(nums[i]-prv !=1){
                    res.add(format(cur,cur+count));
                    cur=nums[i];
                    count=0;
                }
                else{
                    count++;
                }
                if(i==nums.length-1){
                    res.add(format(cur,cur+count));
                }
                prv=nums[i];
            }

        }
        return res;
    }

    public static String format(int x,int y){
        if(x==y)
            return String.valueOf(x);
        else
            return x+"->"+y;
    }
}
