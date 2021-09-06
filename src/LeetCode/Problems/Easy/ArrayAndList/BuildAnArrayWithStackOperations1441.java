package LeetCode.Problems.Easy.ArrayAndList;

import java.util.ArrayList;
import java.util.List;

public class BuildAnArrayWithStackOperations1441 {
    public static List<String> buildArray(int[] target, int n) {
        int i =1;
        List<String> ans = new ArrayList<>();
        for(int x : target){
            while(i <x){
                ans.add("Push");
                ans.add("Pop");
                i++;
            }
            ans.add("Push");
            i=x+1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(buildArray(new int[]{1,3},3).toString());
    }
}
