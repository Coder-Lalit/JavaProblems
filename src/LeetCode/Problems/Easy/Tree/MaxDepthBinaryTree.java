package LeetCode.Problems.Easy.Tree;

public class MaxDepthBinaryTree {
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

    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int l_max = maxDepth(root.left);
        int r_max = maxDepth(root.right);
        return Integer.max(l_max,r_max)+1;
    }



    public static void main(String[] args) {
        TreeNode t = new TreeNode(3,new TreeNode(9),new TreeNode(20,new TreeNode(15),new TreeNode(7)));
        //TreeNode t = new TreeNode(1,null,new TreeNode(2));
        System.out.println(maxDepth(t));
    }
}
