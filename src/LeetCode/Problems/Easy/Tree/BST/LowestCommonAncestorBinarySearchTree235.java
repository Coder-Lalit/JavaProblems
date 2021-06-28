package LeetCode.Problems.Easy.Tree.BST;

public class LowestCommonAncestorBinarySearchTree235 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){this.val=x;}
        TreeNode(int x, TreeNode l,TreeNode r){
            this.val=x;
            this.left=l;
            this.right=r;
        }
    }

    public static void main(String[] args) {
        TreeNode a= new TreeNode(6,
                new TreeNode(2,
                        new TreeNode(0),
                        new TreeNode(4,
                                new TreeNode(3),
                                new TreeNode(5)
                        )
                ),
                new TreeNode(8,
                        new TreeNode(7),
                        new TreeNode(9)
                )
        );

        TreeNode p = a.left.left;
        TreeNode q= a.left.right;
        System.out.println(lowestCommonAncestor(a,p,q).val);
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        if(root==p || root==q) return root;
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left!=null && right!=null ) return root;
        if(left==null && right==null ) return null;
        return left !=null?left:right;
    }
}
