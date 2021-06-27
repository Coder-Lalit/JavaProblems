package LeetCode.Problems.Easy.Tree;

import java.util.Stack;

public class DiameterBinaryTree543 {
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
        int max= Integer.MIN_VALUE;
        public int diameterOfBinaryTree(TreeNode n) {
            if (n == null) return 0;
            depth(n);
            return max;
        }

        public int depth(TreeNode n) {
            if(n==null) return 0;

            int l = depth(n.left);
            int r = depth(n.right);

            max = max < l+r?l+r:max;
            return Integer.max(l,r)+1;
        }

    }




    public static void main(String[] args) {
        //TreeNode t = new TreeNode(1,new TreeNode(2,new TreeNode(4),new TreeNode(5)),new TreeNode(3));
        TreeNode t = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        System.out.println(t.diameterOfBinaryTree(t));

    }
}
