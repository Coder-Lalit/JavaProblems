package LeetCode.Challenges.Y2021.August;

public class CountGoodNodesInBinaryTree1448 {
    private static int count = 0;
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


    public static int goodNodes(TreeNode root) {
        count=0;
        dfs(root,Integer.MIN_VALUE);
        return count;
    }

    static void dfs(TreeNode n, int max) {
        if (n.val >= max) count++;
        if (n.left != null) dfs(n.left, Integer.max(n.val, max));
        if (n.right != null) dfs(n.right, Integer.max(n.val, max));
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(3, new TreeNode(1, new TreeNode(3), null), new TreeNode(4, new TreeNode(1), new TreeNode(5)));
        TreeNode n2 = new TreeNode(3, new TreeNode(3, new TreeNode(4), new TreeNode(2)), null);
        TreeNode n3 = new TreeNode(2, null, new TreeNode(4, new TreeNode(10), new TreeNode(8,new TreeNode(4),null)));
        TreeNode n4 = new TreeNode(9, null, new TreeNode(3, new TreeNode(6), null));
        TreeNode n5 = new TreeNode(2,
                new TreeNode(4, new TreeNode(4), null)
                , new TreeNode(4,
                new TreeNode(1, new TreeNode(5, null, new TreeNode(5, new TreeNode(4), new TreeNode(4))), null),
                new TreeNode(3)));
        System.out.println(goodNodes(n1));
        System.out.println(goodNodes(n2));
        System.out.println(goodNodes(n3));
        System.out.println(goodNodes(n4));
        System.out.println(goodNodes(n5));

    }
}
