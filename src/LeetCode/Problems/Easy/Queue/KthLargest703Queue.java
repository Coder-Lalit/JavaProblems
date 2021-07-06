package LeetCode.Problems.Easy.Queue;

import java.util.PriorityQueue;

public class KthLargest703Queue {
    public static class KthLargest{
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int kthMax;
        public KthLargest(int k, int[] nums) {
            kthMax=k;
            for(int i =0;i<nums.length;i++){
                pq.add(nums[i]);
            }
            while(pq.size()>k){
                pq.remove();
            }
        }

        public int add(int val) {
            if(pq.size()<kthMax){
                pq.add(val);
            }else{
                pq.add(val);
                pq.remove();
            }
            return pq.peek();
        }
    }

    public static void main(String[] args) {
//        KthLargest k = new KthLargest(2, new int[]{0});
//        System.out.println(k.add(-1));
//        System.out.println(k.add(1));
//        System.out.println(k.add(-2));
//        System.out.println(k.add(-4));
//        System.out.println(k.add(3));

        KthLargest k = new KthLargest(3, new int[]{4,5,8,2});
        System.out.println(k.add(3));
        System.out.println(k.add(5));
        System.out.println(k.add(10));
        System.out.println(k.add(9));
        System.out.println(k.add(4));
    }
}
