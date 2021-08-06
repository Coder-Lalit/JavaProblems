package LeetCode.Problems.AugustLeetCodingChallenge2021;

import java.util.ArrayList;
import java.util.List;

public class NaryTreeLevelOrderTraversal429 {
    static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }

        public List<List<Integer>> levelOrder(Node root) {
            List<List<Integer>> ans = new ArrayList<>();
            if(root==null) return ans;
            ans.add(new ArrayList<Integer>(){{add(root.val);}});
            List<Node> temp = root.children;
            while(temp.size()!=0){
                List<Integer> subAns = new ArrayList<>();
                List<Node> temp2 = new ArrayList<>();
                for(Node n : temp){
                    subAns.add(n.val);
                    if(n.children !=null)
                        temp2.addAll(n.children);
                }
                ans.add(subAns);
                temp=temp2;
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        List<Node> threeNodes = new ArrayList<>();
        threeNodes.add(new Node(5));
        threeNodes.add(new Node(6));
        Node three = new Node(3,threeNodes);
        List<Node> oneNodes = new ArrayList<>();
        oneNodes.add(new Node(2));
        oneNodes.add(new Node(4));
        oneNodes.add(three);
        Node n = new Node(1,oneNodes);

        for(List<Integer> x : n.levelOrder(n) ){
            System.out.println(x.toString());
        }
    }


}
