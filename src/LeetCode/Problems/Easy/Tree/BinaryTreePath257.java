package LeetCode.Problems.Easy.Tree;

import java.util.List;
import java.util.Stack;

public class BinaryTreePath257 {
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

    public static String binaryTreePaths(TreeNode root) {
        StringBuffer res= new StringBuffer();
        if(root==null) return " ";
        res.append(binaryTreePaths(root.left)+" ");
        res.append(binaryTreePaths(root.right)+" ");
        res.append(String.valueOf(root.val));
        return res.toString();
    }

    public static void main(String[] args) {
        TreeNode t = new TreeNode(1,new TreeNode(2,new TreeNode(4),new TreeNode(5)),new TreeNode(3));
        //TreeNode t = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        System.out.println(binaryTreePaths(t));
    }
}
