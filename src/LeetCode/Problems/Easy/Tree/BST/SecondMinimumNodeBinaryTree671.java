package LeetCode.Problems.Easy.Tree.BST;

import java.util.Collections;
import java.util.HashSet;

public class SecondMinimumNodeBinaryTree671 {
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

        public int findSecondMinimumValue() {
            return findSecondMinimumValue(this);
        }

        public int findSecondMinimumValue(TreeNode n) {
            HashSet<Integer> bstValues = new HashSet<>();
            preOrder(n,bstValues);
            int max=Collections.max(bstValues);
            bstValues.remove(max);
            return bstValues.size()>0?Collections.max(bstValues):-1;
        }
        public void preOrder(TreeNode n,HashSet<Integer> bstValues){
            if(n==null) return;
            bstValues.add(n.val);
            preOrder(n.left,bstValues);
            preOrder(n.right,bstValues);
        }
    }
    public static TreeNode preOrderToTree(Object[] root){
        TreeNode x[] = new TreeNode[root.length];
        for(int i=0;i<root.length;i++){
            if(root[i]!=null)
                x[i]= new TreeNode((int)root[i]);
            else
                x[i]=null;
        }
        for(int i=0;i<root.length;i++){
            if(i*2+2<x.length){
                x[i].left=x[i*2+1];
                x[i].right=x[i*2+2];
            }else {
                break;
            }
        }
        System.out.println(x[0]);
        return x[0];
    }

    public static void main(String[] args) {
        Object root[] = new Object[] {2,2,5,null,null,5,7};
        System.out.println(preOrderToTree(root).findSecondMinimumValue());


    }
}
