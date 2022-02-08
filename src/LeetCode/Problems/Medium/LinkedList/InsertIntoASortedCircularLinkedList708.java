package LeetCode.Problems.Medium.LinkedList;

public class InsertIntoASortedCircularLinkedList708 {
    public static void main(String args[]) {
        //Node listNode = new Node(3, new Node(4, new Node(1)));
        Node listNode = new Node(1, new Node(3, new Node(5)));
        listNode.next.next.next=listNode;
        listNode.print();
        listNode.insert(listNode,0);
        listNode.print();
    }







    public static class Node {
        int val;
        Node next;

        Node() {
        }

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        public void print() {
            Node l = this;
            while (l != null) {
                System.out.print(l.val + " ");
                l = l.next;
                if(l==this) break;
            }
            System.out.println("");
        }

        public Node insert(Node head, int insertVal) {
            Node ans = head;
            Node n = new Node(insertVal);
            if(head==null){
                n.next = n;
                return n;
            }
            else if(head==head.next){
                head.next = n;
                n.next=head;
                return ans;

            }else{
                head = getStartNode(head);
                Node temp = head;
                Node prv = null;
                while(head.val < insertVal){
                    prv = head;
                    head = head.next;
                    if(head == temp){
                        break;
                    }
                }
                if(prv!=null){
                    Node nxt = prv.next;
                    prv.next=n;
                    n.next=nxt;
                }else{
                    while(head.next != temp){
                        head=head.next;
                    }
                    head.next=n;
                    n.next=temp;
                }
                return ans;
            }
        }
        public Node getStartNode(Node head){
            Node temp = head;
            while (head.next.val > head.val){
                head=head.next;
                if(head==temp) return head;
            }
            return head.next;
        }
    }
}
