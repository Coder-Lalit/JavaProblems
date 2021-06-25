package LeetCode.Problems.Easy.Array;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement496 {
    public static void main(String[] args) {
        NextGreaterElement496 a = new NextGreaterElement496();
        for (int i : a.nextGreaterElement2(new int[]{2, 4}, new int[]{1, 3, 4, 2})) {
            System.out.println(i);
        }

        for (int i : a.nextGreaterElement2(new int[]{1, 3, 5, 2, 4}, new int[]{6, 5, 4, 3, 2, 1, 7})) {
            System.out.println(i);
        }

    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i < nums2.length; i++) {
            if (nums2[i] > nums2[i - 1])
                map.put(nums2[i - 1], nums2[i]);
            else {
                int j = i + 1;
                while (j < nums2.length) {
                    if (nums2[j] > nums2[i - 1]) {
                        map.put(nums2[i - 1], nums2[j]);
                        break;
                    }
                    j++;
                }
                if (j == nums2.length) {
                    map.put(nums2[i - 1], -1);
                }

            }

            if (i == nums2.length - 1)
                map.put(nums2[i], -1);
        }
        System.out.println(map.toString());

        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }

        return res;
    }


    public int[] nextGreaterElement2(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums2.length; i++) {
            if(stack.empty()){
                stack.push(nums2[i]);
            }else{
                while(!stack.empty()){
                    if(nums2[i]>stack.peek())
                        map.put(stack.pop(),nums2[i]);
                    else
                        break;
                }
                stack.push(nums2[i]);
            }
            if(i==nums2.length-1 && !stack.empty()){
                while(!stack.empty()){
                    map.put(stack.pop(),-1);
                }
            }
        }
        System.out.println(map.toString());

        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }

        return res;
    }
}
