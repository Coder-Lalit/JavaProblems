package LeetCode.Problems.Easy.Tree;

import com.sun.tools.corba.se.idl.toJavaPortable.Helper;

import java.util.Stack;

public class InvertBinaryTree226 {
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

    public static TreeNode invertTree(TreeNode p) {
        if (p == null) {
            return null;
        }
        TreeNode right = invertTree(p.right);
        TreeNode left = invertTree(p.left);
        p.left = right;
        p.right = left;
        return p;
    }


    public static void main(String[] args) {

        TreeNode q = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7, new TreeNode(6), new TreeNode(8)));
        q.preOrder();
        invertTree(q).preOrder();

    }
}
