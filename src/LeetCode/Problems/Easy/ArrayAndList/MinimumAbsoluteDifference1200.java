package LeetCode.Problems.Easy.ArrayAndList;

import java.util.*;

public class MinimumAbsoluteDifference1200 {
    public static List<List<Integer>> minimumAbsDifference2(int[] arr) {
        Arrays.sort(arr);
        HashMap<Integer, List<List<Integer>>> ansMap = new HashMap<>();
        for (int i = 1; i < arr.length; i++) {
            ansMap.put(arr[i] - arr[i - 1], ansMap.getOrDefault(arr[i] - arr[i - 1], new ArrayList<List<Integer>>()));
            List<Integer> temp = new ArrayList<Integer>();
            temp.add(arr[i - 1]);
            temp.add(arr[i]);
            ansMap.get(arr[i] - arr[i - 1]).add(temp);
        }

        return ansMap.get(Collections.min(ansMap.keySet()));
    }

    public static List<List<Integer>> minimumAbsDifference3(int[] arr) {
        Arrays.sort(arr);
        int[] temp = new int[arr.length - 1];
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            temp[i - 1] = arr[i] - arr[i - 1];
            min = Math.min(min, temp[i - 1]);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == min) {
                List<Integer> tempList = new ArrayList<>();
                tempList.add(arr[i]);
                tempList.add(arr[i + 1]);
                ans.add(tempList);
            }
        }
        return ans;
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            map.put(arr[i] - arr[i - 1], map.getOrDefault(arr[i] - arr[i - 1], new ArrayList<>()));
            map.get(arr[i] - arr[i - 1]).add(i - 1);
            min = Math.min(min, arr[i] - arr[i - 1]);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int i : map.get(min)) {
            List<Integer> tempList = new ArrayList<>();
            tempList.add(arr[i]);
            tempList.add(arr[i + 1]);
            ans.add(tempList);
        }


        return ans;
    }

    public static void main(String[] args) {
        System.out.println(minimumAbsDifference(new int[]{4, 2, 1, 3}));
    }
}
