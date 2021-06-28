package LeetCode.Problems.Easy.Tree.BST;

import java.util.Stack;

public class SubtreeofAnotherTree572 {
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

        public TreeNode find(TreeNode node,int f){
            if(node != null){
                if(node.val==f){
                    return node;
                } else {
                    TreeNode foundNode = find(node.left,f);
                    if(foundNode == null) {
                        foundNode = find(node.right,f);
                    }
                    return foundNode;
                }
            } else {
                return null;
            }
        }

        public boolean compare(TreeNode p, TreeNode q){
            if (p == null && q == null) return true;
            if (p == null && q != null) return false;
            if (p != null && q == null) return false;
            if (p.val != q.val) return false;
            return compare(p.left,q.left) && compare(p.right,q.right);
        }

        public boolean isSubtree(TreeNode root, TreeNode subRoot) {
            if(root==null || subRoot==null) return false;
            return compare(find(root,subRoot.val),subRoot);
        }

    }


    public static void main(String[] args) {
        //TreeNode t = new TreeNode(1,new TreeNode(2,new TreeNode(4),new TreeNode(5)),new TreeNode(3));
        TreeNode sub = new TreeNode(4,new TreeNode(1),new TreeNode(2));
        TreeNode t = new TreeNode(3, sub, new TreeNode(5));
        //System.out.println(t.find(t,4));
        System.out.println(t.isSubtree(t,sub));
    }
}
