package LeetCode.Problems.Easy.Tree.NAry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumDepthNAryTree {
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


        public int maxDepth(Node r) {
            int max =0;
            if(r==null) return 0;
            else if(r.children == null) return 1;
            else{
                max=0;
                for(Node x : r.children){
                    max=Integer.max(maxDepth(x),max);
                }
            }
            return max+1;
        }
    }

    public static void main(String[] args) {
        List<Node> _56=new ArrayList<Node>(){{
            add(new Node(5));
            add(new Node(6));
        }};
        List<Node> _324=new ArrayList<Node>(){{
            add(new Node(3,_56));
            add(new Node(2));
            add(new Node(4));
        }};
        Node _1=new Node(1,_324);

        System.out.println(_1.maxDepth(_1));



    }



}
