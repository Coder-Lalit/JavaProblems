package LeetCode.Problems.Easy.Tree.BST;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees872 {

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

        public void preOrder(TreeNode n) {
            if (n == null) return;
            System.out.print(n.val + " ");
            preOrder(n.left);
            preOrder(n.right);
        }

        public void getLeaf(TreeNode n,List<Integer> leafList ) {
            if (n == null) return;
            if(n.left==null && n.right==null) leafList.add(n.val);
            getLeaf(n.left,leafList);
            getLeaf(n.right,leafList);
        }

        public boolean leafSimilar(TreeNode a, TreeNode b){
            List<Integer> aLeafList = new ArrayList<>();
            List<Integer> bLeafList = new ArrayList<>();
            getLeaf(a,aLeafList);
            getLeaf(b,bLeafList);

            if(aLeafList.size()==bLeafList.size()){
                for(int i=0;i<aLeafList.size();i++){
                    if(aLeafList.get(i)!=bLeafList.get(i)){
                        return false;
                    }
                }
            }else{
                return false;
            }

            return true;
        }
    }

    public static void main(String[] args) {
        TreeNode t = new TreeNode(1, new TreeNode(4), new TreeNode(6, new TreeNode(5), null));
        TreeNode t2 = new TreeNode(1, new TreeNode(4), new TreeNode(5));

        System.out.println(t.leafSimilar(t,t2));
    }
}
