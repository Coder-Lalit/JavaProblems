package LeetCode.Problems.Easy.Tree.BST;

import java.util.Stack;

public class IncreasingBinaryTree897 {
    static TreeNode  cur;

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public TreeNode increasingBST(TreeNode root) {
            TreeNode ans = new TreeNode(0);
            cur = ans;
            inorder(root);
            return ans.right;
        }

        public void inorder(TreeNode node) {
            if (node == null) return;
            inorder(node.left);
            node.left = null;
            cur.right = node;
            cur = node;
            inorder(node.right);
        }


    }

    public static void main(String[] args) {
        //TreeNode t = new TreeNode(1,new TreeNode(2,new TreeNode(4),new TreeNode(5)),new TreeNode(3));
        TreeNode t = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));

        TreeNode treeNode = t.increasingBST(t);
        while(treeNode != null){
            System.out.println(treeNode.val);
            treeNode=treeNode.right;
        }
    }
}
