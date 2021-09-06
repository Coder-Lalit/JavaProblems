package LeetCode.Problems.Easy.Tree.BST;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FindAllTheLonelyNodes1469 {
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

    public static void postOrder(TreeNode n) {
        if (n == null) return;
        postOrder(n.left);
        postOrder(n.right);
        System.out.print(n.val + " ");
    }

    public static List<Integer> getLonelyNodes(TreeNode root) {
       return helper(root,new ArrayList<>());
    }

    static List<Integer> helper(TreeNode n, List<Integer> ans){
        if(n==null) return ans;
        if(n.right ==null && n.left !=null) ans.add(n.left.val);
        if(n.left ==null && n.right !=null) ans.add(n.right.val);
        helper(n.left,ans);
        helper(n.right,ans);
        return ans;

    }

    public static void main(String[] args) {
        //TreeNode t = new TreeNode(1,new TreeNode(2,new TreeNode(4),new TreeNode(5)),new TreeNode(3));
        TreeNode t = new TreeNode(1, new TreeNode(2,null,new TreeNode(4)), new TreeNode(3, new TreeNode(5),null));
        System.out.println(getLonelyNodes(t));
    }
}
