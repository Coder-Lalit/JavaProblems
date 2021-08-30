package LeetCode.Problems.Easy.Array;

import java.util.*;

public class CreateTargetArrayIntheGivenOrder1389 {
    public static int[] createTargetArray(int[] nums, int[] index) {
//        int[] target = new int[nums.length];
//        Arrays.fill(target, -1);
//        for(int i = 0; i < nums.length; i++){
//            if(target[index[i]] == -1){
//                target[index[i]] = nums[i];
//            }
//            else{
//                for(int j =nums.length-1; j > index[i]; j--){
//                    target[j] = target[j-1];
//                }
//                target[index[i]] = nums[i];
//            }
//        }
//        return target;

        ArrayList<Integer> list= new ArrayList<>();
        int[] res = new int[index.length];
        for(int i=0; i<index.length; i++){
            list.add(index[i], nums[i]);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        createTargetArray(new int []{1,2,3}, new int[]{2,1,0});
    }
}
