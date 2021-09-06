package LeetCode.Challenges.Y2021.August;

public class MaximumProductOfSplittedBinaryTree1339 {

    public static long maxProd=0;
    //Definition for a binary tree node.
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
    }

    static void printPreOrder(TreeNode n){
        if(n==null) return;
        System.out.print(n.val +" ");
        printPreOrder(n.left);
        printPreOrder(n.right);
    }

    public static int maxProduct(TreeNode root) {
        helper(root);
        return (int) max(root,root.val) % 1000000007;
    }

    static void helper(TreeNode n) {
        if (n.left != null) helper(n.left);
        if (n.right != null) helper(n.right);
        if (n.left != null && n.right != null) n.val += n.left.val + n.right.val;
        else if (n.left != null) n.val += n.left.val;
        else if(n.right != null) n.val += n.right.val;
    }

    static long max(TreeNode n,int total){
        if(n==null) return maxProd;
        maxProd = Math.max(maxProd,n.val * (total-n.val));
        max(n.left,total);
        max(n.right,total);
        return maxProd;
    }


    public static void main(String[] args) {
        TreeNode n = new TreeNode(1,new TreeNode(2,new TreeNode(4),new TreeNode(5)),new TreeNode(3,new TreeNode(6),null));
        System.out.println(maxProduct(n));
    }


}
