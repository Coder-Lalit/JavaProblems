package LeetCode.Problems.Easy.Tree.BST;

public class ConstructStringBinaryTree606 {
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

        public String tree2str() {
            return tree2str(this, new StringBuilder());
        }

        public String tree2str(TreeNode n, StringBuilder s) {
            if (n == null) return s.toString();
            s.append(n.val);
            if (n.right!=null || n.left!=null) {
                s.append("(").append(tree2str(n.left, new StringBuilder())).append(")");
                if(n.right!=null)
                    s.append("(").append(tree2str(n.right, new StringBuilder())).append(")");
            }


            return s.toString();
        }
    }

    public static void main(String arg[]) {
        TreeNode n = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3));
        System.out.println(n.tree2str());
    }


}
