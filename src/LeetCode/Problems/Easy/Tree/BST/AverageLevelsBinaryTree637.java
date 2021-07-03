package LeetCode.Problems.Easy.Tree.BST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AverageLevelsBinaryTree637 {
    public static class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.left = left;
            this.right = right;
            this.val = val;
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode() {
        }
    }

    public static List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        res.add((double) root.val);
        childNode(new ArrayList<TreeNode>() {{
            add(root);
        }}, res);
        return res;
    }

    public static void childNode(List<TreeNode> nodes, List<Double> res) {
        List<TreeNode> n = new ArrayList<>();
        double sum = 0;
        int count = 0;
        for (TreeNode x : nodes) {
            if (x.right != null) {
                n.add(x.right);
                sum += x.right.val;
                count++;
            }
            if (x.left != null) {
                n.add(x.left);
                sum += x.left.val;
                count++;
            }
        }
        if (n.size() != 0) {
            res.add(sum / count);
            childNode(n, res);
        }
    }

    public static void main(String[] args) {
        TreeNode n = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3));
        System.out.println(averageOfLevels(n).toString());
    }
}
