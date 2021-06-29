package LeetCode.Problems.Easy.Tree.NAry;

import java.util.ArrayList;
import java.util.List;

public class NAryTreePreorderTraversal598 {
    static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }

        List<Integer> res = new ArrayList<>();

        public List<Integer> preorder(Node r) {
            if (r == null) return res;
            res.add(r.val);
            if (r.children == null) {
                return res;
            } else {
                for (Node x : r.children) {
                    preorder(x);
                }
            }
            return res;
        }

        public List<Integer> postorder(Node r) {
            if (r == null) return res;
            if (r.children == null) {
                res.add(r.val);
                return res;
            } else {
                for (Node x : r.children) {
                    postorder(x);
                }
            }
            res.add(r.val);
            return res;
        }
    }

    public static void main(String[] args) {
        List<Node> _56 = new ArrayList<Node>() {{
            add(new Node(5));
            add(new Node(6));
        }};
        List<Node> _324 = new ArrayList<Node>() {{
            add(new Node(3, _56));
            add(new Node(2));
            add(new Node(4));
        }};
        Node _1 = new Node(1, _324);

        System.out.println(_1.postorder(_1).toString());


    }


}
