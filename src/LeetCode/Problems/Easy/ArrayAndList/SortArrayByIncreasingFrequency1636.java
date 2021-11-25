package LeetCode.Problems.Easy.ArrayAndList;

import java.util.*;

public class SortArrayByIncreasingFrequency1636 {
    public static int[] frequencySort(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList(map.entrySet());
        Collections.sort(list, (a,b) -> a.getValue() == b.getValue() ? b.getKey() - a.getKey() : a.getValue() - b.getValue());
        System.out.println(list.toString());
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : list) {

            int count = entry.getValue();
            int key = entry.getKey();

            for (int i=0; i<count; i++) {
                nums[index++] = key;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(frequencySort(new int[]{8,-1,1,-6,4,5,-6,1,4,1})));
    }
}
