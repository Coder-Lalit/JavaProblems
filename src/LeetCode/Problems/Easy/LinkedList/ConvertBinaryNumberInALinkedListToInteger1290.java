package LeetCode.Problems.Easy.LinkedList;

public class ConvertBinaryNumberInALinkedListToInteger1290 {
    public static void main(String args[]) {
        System.out.println(getDecimalValue(new ListNode(1, new ListNode(1, new ListNode(0, new ListNode(1))))));
    }

    public static int getDecimalValue(ListNode head) {
        int res = 0;
        while (head != null) {
            res = (res << 1) + head.val;
            head = head.next;
        }

        return res;
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
