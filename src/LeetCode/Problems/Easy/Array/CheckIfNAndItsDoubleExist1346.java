package LeetCode.Problems.Easy.Array;

import java.util.Arrays;
import java.util.HashMap;

public class CheckIfNAndItsDoubleExist1346 {
    public static boolean checkIfExist(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x: arr){
            map.put(x,map.getOrDefault(x,0)+1);
            if(x==0) {
                if(map.get(0)>1) return true;
            }
            else{
                if(map.containsKey(x*2)) return true;
                if(x%2==0 && map.containsKey(x/2)) return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        //System.out.println(checkIfExist(new int []{-2,0,10,-19,4,6,-8}));
        System.out.println(checkIfExist(new int []{-20,8,-6,-14,0,-19,14,4}));
    }
}
