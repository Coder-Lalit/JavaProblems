package LeetCode.Problems.Easy.Tree.BST;

import java.util.Stack;

public class SumRootToLeafBinaryNumbers1022 {
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
        int sum;
        public  void preOrder(TreeNode n,String s) {
            if (n == null) return;
            s+=String.valueOf(n.val);
            if(n.left==null && n.right==null){
                System.out.println("s value "+s);
                System.out.println("Decimal : "+Integer.parseInt(s,2));
                sum+=Integer.parseInt(s,2);
                System.out.println("Sum of leaf :"+sum);
            }
            preOrder(n.left,s);
            preOrder(n.right,s);
        }
    }




    public static void main(String[] args) {
        //TreeNode t = new TreeNode(1,new TreeNode(2,new TreeNode(4),new TreeNode(5)),new TreeNode(3));
        TreeNode t = new TreeNode(1, new TreeNode(0,new TreeNode(0),new TreeNode(1)), new TreeNode(1,new TreeNode(0),new TreeNode(1)));
        System.out.println("Pre");
        t.preOrder(t,"");
    }
}
