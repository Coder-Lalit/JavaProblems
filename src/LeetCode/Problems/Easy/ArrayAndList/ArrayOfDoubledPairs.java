package LeetCode.Problems.Easy.ArrayAndList;

import java.util.*;

public class ArrayOfDoubledPairs {
    public static boolean canReorderDoubled(int[] arr) {
        HashMap<Double,Integer> map = new HashMap<>();
        for(int x: arr){
            map.put((double)x,map.getOrDefault((double)x,0)+1);
        }
        Arrays.sort(arr);
        for(int y : arr){
            Double x = (double)y;
            if(map.get(x)>0){
                if(map.containsKey(2*x) && map.get(2*x)>0){
                    map.put(x*2,map.get(x*2)-1);
                }else if(map.containsKey(x/2) && map.get(x/2)>0){
                    map.put(x/2,map.get(x/2)-1);
                }else {
                    return false;
                }
                map.put(x,map.get(x)-1);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(canReorderDoubled(new int[]{3,1,3,6}));
        System.out.println(canReorderDoubled(new int[]{2,1,2,6}));
        System.out.println(canReorderDoubled(new int[]{4,-2,2,-4}));
        System.out.println(canReorderDoubled(new int[]{0,0}));
        System.out.println(canReorderDoubled(new int[]{-5,-2}));
        System.out.println(canReorderDoubled(new int[]{-4,-6,-1,-2,-1,-1,-3,-8}));
        System.out.println(canReorderDoubled(new int[]{1,2,4,8}));
        System.out.println(canReorderDoubled(new int[]{-5,-8}));
        System.out.println(canReorderDoubled(new int[]{1,2,1,-8,8,-4,4,-4,2,-2}));
    }


}
