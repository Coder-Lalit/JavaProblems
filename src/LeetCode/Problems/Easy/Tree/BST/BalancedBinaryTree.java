package LeetCode.Problems.Easy.Tree.BST;

import java.util.Stack;

public class BalancedBinaryTree {
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

        public void preOrder() {
            if (this == null) return;
            Stack<TreeNode> stack = new Stack<>();
            TreeNode cur = this;
            while (cur != null || !stack.empty()) {
                while (cur != null) {
                    stack.push(cur);
                    cur = cur.left;
                }
                cur = stack.pop();
                System.out.print(cur.val + " ");
                cur = cur.right;
            }
            System.out.println("");
        }
    }

    public static boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        return Math.abs(maxHeight(root.left)-maxHeight(root.right)) <2
                && isBalanced(root.left)
                && isBalanced(root.right);
    }
    public static int maxHeight(TreeNode n){
        if(n==null) return 0;
        int lH = maxHeight(n.left);
        int rH = maxHeight(n.right);
        return Integer.max(lH,rH)+1;
    }

    public static void main(String[] args) {

    }
}
