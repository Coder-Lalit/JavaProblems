package LeetCode.Problems.Easy.Array;

import java.util.Arrays;
import java.util.HashMap;

public class RelativeRanks506 {
    public static void main(String[] args) {
        RelativeRanks506 r = new RelativeRanks506();
       for ( String s :r.findRelativeRanks(new int [] {10,3,8,9,4})){
            System.out.print(s+" ");
        }
    }
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer,String> map = new HashMap<>();
        int []temp = score.clone();
        Arrays.sort(temp);
        int i=1;
        while (temp.length>=i){
            if(i==1)
                map.put(temp[temp.length-i],"Gold Medal");
            else if(i==2)
                map.put(temp[temp.length-i],"Silver Medal");
            else if(i==3)
                map.put(temp[temp.length-i],"Bronze Medal");
            else{
                map.put(temp[temp.length-i],String.valueOf(i));
            }
            i++;
        }
        String []arr= new String[score.length];
        for(int j=0 ;j<score.length;j++){
            arr[j]=map.get(score[j]);
        }
        return arr;
    }
}
