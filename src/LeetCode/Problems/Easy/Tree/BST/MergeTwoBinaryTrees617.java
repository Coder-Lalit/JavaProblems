package LeetCode.Problems.Easy.Tree.BST;

public class MergeTwoBinaryTrees617 {
    public static class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.left = left;
            this.right = right;
            this.val = val;
        }

        public TreeNode mergeTrees(TreeNode n1, TreeNode n2) {
            TreeNode n2l, n1l, n2r, n1r;
            int val = 0;
            if (n1 == null && n2 == null) {
                return null;
            } else if (n1 == null) {
                val = n2.val;
                n2l = n2.left;
                n2r = n2.right;
                n1l = null;
                n1r = null;

            } else if (n2 == null) {
                val = n1.val;
                n1l = n1.left;
                n1r = n1.right;
                n2l = null;
                n2r = null;
            } else {
                val = n1.val + n2.val;
                n1l = n1.left;
                n1r = n1.right;
                n2l = n2.left;
                n2r = n2.right;
            }
            return new TreeNode(val, mergeTrees(n1l, n2l), mergeTrees(n1r, n2r));
        }

        public void preorder(TreeNode n) {
            if (n == null) return;
            System.out.println(n.val);
            preorder(n.left);
            preorder(n.right);
        }
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(2, new TreeNode(1, null, new TreeNode(4)), new TreeNode(3, null, new TreeNode(7)));
        TreeNode n2 = new TreeNode(1, new TreeNode(3, new TreeNode(5), null), new TreeNode(2));
        n1.preorder(n1.mergeTrees(n1, n2));
    }
}
