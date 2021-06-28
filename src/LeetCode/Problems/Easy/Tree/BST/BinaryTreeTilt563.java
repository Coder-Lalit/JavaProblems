package LeetCode.Problems.Easy.Tree.BST;

public class BinaryTreeTilt563 {
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
        int tiltSum =0;
        public int findTilt(TreeNode root) {
            if(root==null) return 0;
            int l =sum(root.left,0);
            int r =sum(root.right,0);
            tiltSum += Math.abs(l-r);
            findTilt(root.left);
            findTilt(root.right);
            System.out.println(root.val+"--"+ tiltSum);
            return tiltSum;
        }

        public int sum(TreeNode n, int total){
            if(n==null) return 0;
            return sum(n.left,total)+ sum(n.right,total)+n.val;
        }

    }


    public static void main(String[] args) {
        TreeNode t = new TreeNode(4,new TreeNode(2,new TreeNode(3),new TreeNode(5)),new TreeNode(9,null,new TreeNode(7)));
        System.out.println(t.findTilt(t));

    }
}
