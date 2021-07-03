package LeetCode.Problems.Easy.Tree.BST;

import java.util.ArrayList;
import java.util.List;

public class TwoSumIVBST653 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode() {
        }

        public boolean findTarget(TreeNode root, int k) {
            List<Integer> a = new ArrayList<>();
            preOrder(root,a);
            for(int i=0; i<a.size();i++){
                if(a.contains(k-a.get(i)) && k-a.get(i)!=a.get(i)){
                    return true;
                }
            }
            return false;
        }
        public List<Integer> preOrder(TreeNode n, List<Integer> a ){
            if(n==null) return a;
            a.add(n.val);
            preOrder(n.left,a);
            preOrder(n.right,a);
            return a;
        }
    }

    public static void main(String[] args) {
        TreeNode r = new TreeNode(5,new TreeNode(3,new TreeNode(2),new TreeNode(4)),new TreeNode(6,null,new TreeNode(7)));
        System.out.println(r.findTarget(r,9));
    }
}
