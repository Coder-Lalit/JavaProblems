package LeetCode.Problems.Easy.Tree;

import java.util.ArrayList;
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

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        helper(root, "", paths);
        return paths;
    }

    public static void helper(TreeNode root, String path, List<String> paths) {
        if (root != null) {
            path += root.val;
            if (root.left != null || root.right != null) {
                path += "->";
                helper(root.left, path, paths);
                helper(root.right, path, paths);
            }else {
                paths.add(path);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode t = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3));
        //TreeNode t = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        System.out.println(binaryTreePaths(t).toString());
    }
}
