package LeetCode.Problems.Easy.Tree.BST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class MinimumAbsoluteDifferenceBST530 {
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

        int min= Integer.MAX_VALUE;
        int last;
        public int getMinimumDifference(TreeNode root) {
            last=root.val;
            helper(root);
            return min;
        }

        public void helper(TreeNode r){
            if(r==null) return;
            helper(r.left);
            if (r.val != last) {
                int diff = Math.abs(r.val - last);
                min = diff < min ? diff : min;
                last = r.val;
            }
            helper(r.right);
        }
    }
    public static void main(String[] args) {
        //TreeNode t = new TreeNode(1,new TreeNode(2,new TreeNode(4),new TreeNode(5)),new TreeNode(3));
        //TreeNode t = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        TreeNode t = new TreeNode(543, new TreeNode(384,null,new TreeNode(445)), new TreeNode(652,null,new TreeNode(699)));
        System.out.println(t.getMinimumDifference(t));
    }

}
