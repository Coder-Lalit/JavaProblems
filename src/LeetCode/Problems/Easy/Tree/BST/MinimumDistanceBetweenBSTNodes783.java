package LeetCode.Problems.Easy.Tree.BST;

public class MinimumDistanceBetweenBSTNodes783 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }

        TreeNode() {

        }


        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        Integer prev, ans;

        public int minDiffInBST(TreeNode root) {
            prev = null;
            ans = Integer.MAX_VALUE;
            dfs(root);
            return ans;
        }

        public void dfs(TreeNode node) {
            if (node == null) return;
            dfs(node.left);
            if (prev != null)
                ans = Math.min(ans, node.val - prev);
            prev = node.val;
            dfs(node.right);
        }
    }

    public static void main(String[] args) {
       //[90,69,null,49,89,null,52]
        TreeNode n = new TreeNode(90,new TreeNode(69,new TreeNode(49,null,new TreeNode(52)),new TreeNode(89)),null);
        n.minDiffInBST(n);
    }
}
