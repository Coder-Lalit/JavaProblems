package LeetCode.Problems.Easy.ArrayAndList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class IntersectionTwoArrays_349_350 {
    public static void main(String[] args) {
       int [] arr= interSectionMulti(new int []{4,7,6,9,7,6,7},new int []{5,0,0,6,1,6,2,2,4});
       for(int i: arr){
           System.out.print(i+" ");
       }
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length < nums2.length) {
            return intersection(nums2, nums1);
        }
        int c = 0;
        HashSet<Integer> n1 = new HashSet<>();
        HashSet<Integer> n2 = new HashSet<>();
        while (c < nums1.length) {
            n1.add(nums1[c]);
            if (c < nums2.length) {
                n2.add(nums2[c]);
            }
            c++;
        }
        n1.retainAll(n2);

        int [] res = new int[n1.size()];
        int x=0;
        for(Integer i:n1){
            res[x]=i;
            x++;
        }
        return res;
    }

    public static int[] interSectionMulti(int[] nums1, int[] nums2) {
        if (nums1.length < nums2.length) {
            return interSectionMulti(nums2, nums1);
        }
        int c = 0;
        List<Integer> n1= new ArrayList<>();
        while (c < nums1.length) {
            n1.add(nums1[c]);
            c++;
        }

        List<Integer> r = new ArrayList<>();
        for(Integer i:nums2){
            if(n1.contains(i)){
                r.add(i);
                n1.remove(i);
            }
        }
        int [] res = new int[r.size()];
        int x=0;
        for(Integer i:r){
            res[x]=i;
            x++;
        }

        return res;
    }
}
