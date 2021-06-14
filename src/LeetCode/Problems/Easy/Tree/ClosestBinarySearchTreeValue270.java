package LeetCode.Problems.Easy.Tree;

import java.util.Stack;

public class ClosestBinarySearchTreeValue270 {
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
                while(cur !=null){
                    stack.push(cur);
                    cur = cur.left;
                }
                cur = stack.pop();
                System.out.println(cur.val);
                cur= cur.right;
            }
        }
    }

    public static void main(String[] args) {
        //TreeNode t = new TreeNode(4,new TreeNode(2,new TreeNode(1),new TreeNode(3)),new TreeNode(5));
        TreeNode t = new TreeNode(8, new TreeNode(1),null);
        System.out.println(closestValue(t,3.0));
    }
    public static int closestValue(TreeNode root, double target) {
        return helper(root,target).val;
    }

    public static TreeNode helper(TreeNode root,double target){
        if(root==null) return root;
        if(root.val==target) return root;
        if(root.left !=null && root.val>target ){
            TreeNode x=helper(root.left,target);
            root = Math.abs(x.val-target)<Math.abs(root.val-target)?x:root;
        }

        if(root.right !=null && root.val<target ){
            TreeNode y= helper(root.right,target);
            root = Math.abs(y.val-target) < Math.abs(root.val-target)?y:root;
        }

        if(root.left==null || root.right==null)
            return root;
        return root;
    }
}
