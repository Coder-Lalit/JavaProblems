package LeetCode.Problems.Easy.ArrayAndList;

import java.util.*;
import java.util.stream.Collectors;

public class DegreeOfArray697 {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.get(nums[i]).add(i);
            }else{
                map.put(nums[i],new ArrayList<>());
                map.get(nums[i]).add(i);
            }
        }

        int max = map.values().stream().max(Comparator.comparingInt(value -> value.size())).get().size();
        List<Integer> list = map.values().stream()
                .filter(v -> v.size() == max)
                .collect(Collectors.toList()).stream()
                .min(Comparator.comparingInt(value -> {
                    return value.get(max - 1) - value.get(0);
                })).get();

        return list.get(max-1)-list.get(0)+1;
    }

    public static void main(String[] args) {
        DegreeOfArray697 d = new DegreeOfArray697();
        System.out.println(d.findShortestSubArray(new int [] {1,2,2,3,1,4,2}));
    }
}
