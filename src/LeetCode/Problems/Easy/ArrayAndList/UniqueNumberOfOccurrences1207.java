package LeetCode.Problems.Easy.ArrayAndList;

import java.util.*;

public class UniqueNumberOfOccurrences1207 {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x: arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        List<Integer> values = new ArrayList<>();
        for(int x: map.values()) values.add(x);
        Collections.sort(values);

        for(int i=1; i< values.size();i++){
            if(values.get(i)==values.get(i-1)) return false;
        }

        return true;

    }

    static boolean isUnique(int[] array) {
        if (array.length <= 1)
            return true;
        Arrays.sort(array);
        int slow = 0;
        int fast = 1;
        int count = 1;
        while (fast < array.length) {
            if (array[fast] == array[fast - 1])
                count++;
            else {
                array[slow] = count;
                slow++;
                count = 1;
            }
            fast++;
        }
        array[slow++] = count;
        while (slow < array.length) {
            array[slow++] = -1;
        }

        Arrays.sort(array);
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1] && array[i] != -1)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isUnique(new int[]{-3,0,1,-3,1,1,1,-3,10,0}));
    }
}
