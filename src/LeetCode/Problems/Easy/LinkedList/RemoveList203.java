package LeetCode.Problems.Easy.LinkedList;

public class RemoveList203 {
    public static void main(String args[]) {
        removeElements(new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(1)))), 1).print();
    }


    public static ListNode removeElements(ListNode head, int val) {
        ListNode prv = head;
        ListNode cur = head;
        while (cur != null) {
            if (prv.val == val) {
                prv = prv.next;
                head=prv;
            } else {
                if (cur.val == val) {
                    prv.next = cur.next;
                } else {
                    prv = cur;
                }
            }
            cur = cur.next;
        }
        return head;
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
