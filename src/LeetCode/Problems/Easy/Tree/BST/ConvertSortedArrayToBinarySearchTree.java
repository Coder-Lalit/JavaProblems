package LeetCode.Problems.Easy.Tree.BST;

import java.util.Stack;

public class ConvertSortedArrayToBinarySearchTree {
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
                System.out.print(cur.val+" ");
                cur= cur.right;
            }
            System.out.println("");
        }
    }

    public static TreeNode  sortedArrayToBST(int[] nums) {
        return helper(0,nums.length-1,nums);
    }

    public static TreeNode helper(int l, int r,int nums [] ){
        if(l>r) return null;
        int m = (l+r)/2;
        TreeNode root = new TreeNode(nums[m]);
        root.left = helper(l,m-1,nums);
        root.right = helper(m+1,r,nums);
        return root;
    }

    public static void main(String[] args) {
        sortedArrayToBST(new int[]{-10, -3, 0, 5, 9}).preOrder();


    }
}
