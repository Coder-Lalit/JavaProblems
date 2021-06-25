package LeetCode.Problems.Easy.Tree;

import org.testng.collections.Lists;

import java.util.*;
import java.util.stream.Collectors;

public class FindModeBinarySearchTree501 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public int[] findMode(TreeNode root) {
            HashMap<Integer, Integer> helper = helper(root, new HashMap<>());
            Integer max = Collections.max(helper.values());
            List<Integer> collect = helper.entrySet().stream()
                    .filter(e -> e.getValue() == max)
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toList());
            return collect.stream().mapToInt(i->i).toArray();
        }

        public HashMap<Integer,Integer> helper(TreeNode r, HashMap<Integer,Integer> map){
            if(r==null) return map;
            if(map.containsKey(r.val)){
                map.put(r.val,map.get(r.val)+1);
            }else{
                map.put(r.val,1);
            }
            helper(r.left,map);
            helper(r.right,map);
            return map;
        }
    }




    public static void main(String[] args) {
        //TreeNode t = new TreeNode(1,new TreeNode(2,new TreeNode(4),new TreeNode(5)),new TreeNode(3));
        TreeNode t = new TreeNode(1, null, new TreeNode(2, new TreeNode(2), null));
        for(int i :t.findMode(t)){
            System.out.println(i);
        }
    }
}
