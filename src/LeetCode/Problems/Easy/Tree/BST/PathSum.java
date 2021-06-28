package LeetCode.Problems.Easy.Tree.BST;

public class PathSum {
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

    public static boolean hasPathSum(TreeNode root,int targetSum) {
        if(root==null) return false;
        targetSum = targetSum - root.val;

        if(root.left==null && root.right==null && targetSum==0)
            return true;
        return hasPathSum(root.left,targetSum)||hasPathSum(root.right,targetSum);
    }



    public static void main(String[] args) {
        TreeNode t = new TreeNode(3,new TreeNode(9),new TreeNode(20,new TreeNode(15),new TreeNode(7)));
        //TreeNode t = new TreeNode(1,null,new TreeNode(2));
        System.out.println(hasPathSum(t,12));
        System.out.println(hasPathSum(t,30));
        System.out.println(hasPathSum(t,38));
    }
}
