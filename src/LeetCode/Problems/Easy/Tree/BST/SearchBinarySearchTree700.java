package LeetCode.Problems.Easy.Tree.BST;

public class SearchBinarySearchTree700 {
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

        public TreeNode searchBST(TreeNode root, int val) {
            if(root == null) return null;
            if(root.val == val) return root;
            if(root.val > val)
                return searchBST(root.left, val);
            else
                return searchBST(root.right, val);
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
        int nu=0;
        for(int i=0;i<root.length;i++){
            if((i-nu)*2+2<x.length){
                if(x[i]!=null){
                    x[i].left=x[(i-nu)*2+1];
                    x[i].right=x[(i-nu)*2+2];
                }else{
                    nu++;
                }
            }else {
                break;
            }
        }
        System.out.println(x[0]);
        return x[0];
    }

    public static void main(String[] args) {
        Object root[] = new Object[] {18,2,22,null,null,null,63,null,84,null,null};
        TreeNode n = preOrderToTree(root);
        System.out.println(n.searchBST(n,63).val);
    }

}
