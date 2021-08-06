package LeetCode.Problems.Easy.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class HighFive1086 {
    public static int[][] highFive(int[][] items) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for(int [] x : items){
            map.put(x[0],map.getOrDefault(x[0],new ArrayList<Integer>()));
            map.get(x[0]).add(x[1]);
        }

        int [][] res = new int [map.keySet().size()][2];
        int c=0;
        for(Integer x : map.keySet()){
            Collections.sort(map.get(x));
            Collections.reverse(map.get(x));
            int sum = 0;
            for(int i =0; i<5;i++){
                sum+=map.get(x).get(i);
            }
            res[c][0]=x;
            res[c][1]=sum/5;
            c++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] input= new int[][]{{1,100},{7,100},{1,100},{7,100},{1,100},{7,100},{1,100},{7,100},{1,100},{7,100}};
        //Output: {{1,100},{7,100}}
        for(int [] x : highFive(input)){
            System.out.println(x[0]+","+x[1]);
        }
    }
}
