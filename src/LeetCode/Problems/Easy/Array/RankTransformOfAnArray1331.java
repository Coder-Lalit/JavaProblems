package LeetCode.Problems.Easy.Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class RankTransformOfAnArray1331 {
    public int[] arrayRankTransform1(int[] arr) {
        HashMap<Integer,Integer> rankMap = new HashMap<>();
        int[] clone = arr.clone();
        Arrays.sort(clone);
        int r=1;
        for(int i=0;i<clone.length;i++){
            if(!rankMap.containsKey(clone[i])){
                rankMap.put(clone[i],r);
                r++;
            }
        }
        for(int i=0; i<arr.length;i++){
            arr[i]=rankMap.get(arr[i]);
        }

        return arr;
    }

    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer> rankMap = new HashMap<>();
        int[] clone = arr.clone();
        Arrays.sort(clone);
        int r=1;
        for(int i=0;i<clone.length;i++){
            if(!rankMap.containsKey(clone[i])){
                rankMap.put(clone[i],r);
                r++;
            }
        }
        for(int i=0; i<arr.length;i++){
            arr[i]=rankMap.get(arr[i]);
        }

        return arr;
    }
}
