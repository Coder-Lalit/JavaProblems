package LeetCode.Problems.Easy.Tree.BST;

import java.util.Stack;

public class SumLeftLeaves404 {
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

        public int sumOfLeftLeaves() {
            return helper(this,false);
        }

        public int helper(TreeNode r,boolean isLeft){
            if(r==null) return 0;
            if(r.left==null && r.right==null){
                return isLeft?r.val:0;
            }
            return helper(r.left,true)+helper(r.right,false);

        }
    }



    public static void main(String[] args) {
        TreeNode t = new TreeNode(1,new TreeNode(2,new TreeNode(4),new TreeNode(5)),new TreeNode(3,new TreeNode(6),null));
        //TreeNode t = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        System.out.println(t.sumOfLeftLeaves());
    }
}
//            1
//        2       3
//    4       5 6    null