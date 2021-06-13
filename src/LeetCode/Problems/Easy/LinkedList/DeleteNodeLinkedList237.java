package LeetCode.Problems.Easy.LinkedList;

public class DeleteNodeLinkedList237 {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int x){this.val=x;}
        ListNode(int x,ListNode n){
            this.val=x;
            this.next=n;
        }
        public void print(){
            ListNode n = this;
            while(n !=null){
                System.out.print(n.val+" ");
                n=n.next;
            }
            System.out.println("");
        }
    }

    public static void deleteNode(ListNode node) {
        ListNode n=node.next;
        node.val= n.val;
        node.next=n.next;
    }

    public static void main(String[] args) {
        ListNode d = new ListNode(4, new ListNode(5));
        ListNode a = new ListNode(1,new ListNode(2,new ListNode(3,d)));
        a.print();
        deleteNode(d);
        a.print();
    }
}
