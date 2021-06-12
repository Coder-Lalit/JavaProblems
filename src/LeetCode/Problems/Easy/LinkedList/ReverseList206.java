package LeetCode.Problems.Easy.LinkedList;

public class ReverseList206 {
    public static void main(String args[]) {
        reverseList2(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))))).print();
    }


    public static ListNode reverseList(ListNode head) {
        ListNode rev= null;
        ListNode cur =head;
        ListNode prev = head;
        while(cur!=null){
            if(cur.next==null){
                if(rev==null){
                    rev =cur;
                }
                cur.next=prev;
                prev.next=null;
                cur=head;
            }
            prev=cur;
            cur =cur.next;
        }
        return rev;
    }
    public static ListNode reverseList2(ListNode head) {
        ListNode cur =head;
        ListNode pre = null;
        while(cur!=null){
            ListNode tempNext = cur.next;
            cur.next=pre;
            pre=cur;
            cur=tempNext;
        }
        return pre;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public void print() {
            ListNode l = this;
            while (l != null) {
                System.out.print(l.val + " ");
                l = l.next;
            }
        }
    }
}
