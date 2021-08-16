package LeetCode.Problems.Easy.Array;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfThreeSortedArrays1213 {
    public static List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> ans = new ArrayList<>();
        int i=0,j=0,k=0;
        while(i < arr1.length && j < arr2.length && k < arr3.length){
            if(arr1[i]==arr2[j] && arr2[j]==arr3[k]){
                ans.add(arr1[i]);
                i++;
                j++;
                k++;
            }else{
                int max = arr1[i] > arr2[j] ? arr1[i]>arr3[k] ? arr1[i]: arr3[k] : arr2[j]>arr3[k] ?arr2[j]: arr3[k];
                while(i< arr1.length && arr1[i]<max) i++;
                while(j< arr2.length && arr2[j]<max) j++;
                while(k< arr3.length && arr3[k]<max) k++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(arraysIntersection(new int[]{1,2,3,4,5},new int[]{1,2,5,7,9},new int[]{1,3,4,5,8}));
        System.out.println(arraysIntersection(new int[]{197,418,523,876,1356},new int[]{501,880,1593,1710,1870},new int[]{521,682,1337,1395,1764}));
    }

}
