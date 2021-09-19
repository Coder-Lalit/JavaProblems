package LeetCode.Problems.Easy.ArrayAndList;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class MostVisitedSectorInACircularTrack1560 {
    public List<Integer> mostVisited(int n, int[] rounds) {
        int ans [] = new int [n+1];
        int st = rounds[0];
        for(int i=1; i<rounds.length;i++){
            while(st!=rounds[i]){
                ans[st]++;
                st++;
                if(st>n) st=1;
            }
        }
        ans[st]++;

        List <Integer> ansList = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i=0 ;i<ans.length;i++){
            if(max < ans[i]){
                max=ans[i];
                ansList.clear();
                ansList.add(i);
            }else if(max==ans[i]){
                ansList.add(i);
            }
        }
        return ansList;
    }


    @Test
    public void test(){
        for(int x : mostVisited(4,new int[]{1,3,1,2})){
            System.out.println(x);
        }
    }

}
