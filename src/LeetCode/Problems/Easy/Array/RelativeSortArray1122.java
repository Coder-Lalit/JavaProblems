package LeetCode.Problems.Easy.Array;

import java.util.*;
import java.util.stream.Collectors;

public class RelativeSortArray1122 {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : arr1){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int c=0;
        for(int x : arr2){
            for(int i=0; i < map.get(x);i++){
                arr1[c]=x;
                c++;
            }
            map.remove(x);
        }

        if(!map.isEmpty()){
            ArrayList<Integer> integers = new ArrayList<>(map.keySet());
            Collections.sort(integers);

            for(int x : integers){
                for(int i=0; i < map.get(x);i++){
                    arr1[c]=x;
                    c++;
                }
                map.remove(x);
            }
        }

        return arr1;
    }

    public static void main(String[] args) {
        relativeSortArray(new int[]{2,3,1,3,2,4,6,7,9,2,19},new int[]{2,1,4,3,9,6});
    }
}
