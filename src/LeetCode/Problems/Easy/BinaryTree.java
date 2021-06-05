package LeetCode.Problems.Easy;

public class BinaryTree {
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

    public static void preOrder(TreeNode n) {
        if (n == null) return;
        System.out.print(n.val +" ");
        preOrder(n.left);
        preOrder(n.right);
    }

    public static void inOrder(TreeNode n) {
        if (n == null) return;
        inOrder(n.left);
        System.out.print(n.val +" ");
        inOrder(n.right);
    }

    public static void postOrder(TreeNode n) {
        if (n == null) return;
        postOrder(n.left);
        postOrder(n.right);
        System.out.print(n.val +" ");
    }

    public static void main(String[] args) {
        //TreeNode t = new TreeNode(1,new TreeNode(2,new TreeNode(4),new TreeNode(5)),new TreeNode(3));
        TreeNode t = new TreeNode(1,null,new TreeNode(2,new TreeNode(3),null));
        System.out.println("Pre");
        preOrder(t);
        System.out.println("\nIn");
        inOrder(t);
        System.out.println("\nPost");
        postOrder(t);
    }
}
