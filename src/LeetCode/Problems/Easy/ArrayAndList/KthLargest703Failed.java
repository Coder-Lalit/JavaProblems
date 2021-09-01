package LeetCode.Problems.Easy.ArrayAndList;

import java.util.Arrays;

public class KthLargest703Failed {
    public static class KthLargest{
        int [] kthMax;
        public KthLargest(int k, int[] nums) {
            kthMax = new int[k];
            Arrays.sort(nums);
            int c=1;
            while(c<=k){
                kthMax[k-c]= nums[nums.length-c];
                c++;
            }
            System.out.println(kthMax);
        }

        public int add(int val) {
            if(val <kthMax[0]) return kthMax[0];
            else{
                kthMax[0]=val;
                for(int i=1; i<kthMax.length;i++){
                    if(kthMax[i]<val){
                        kthMax[i-1]=kthMax[i];
                        kthMax[i]=val;
                    }
                }
                return kthMax[0];
            }
        }
    }

    public static void main(String[] args) {
        KthLargest k = new KthLargest(3,new int[]{4,5,8,2});
        System.out.println(k.add(3));
        System.out.println(k.add(5));
        System.out.println(k.add(10));
        System.out.println(k.add(9));
        System.out.println(k.add(4));
    }

}
