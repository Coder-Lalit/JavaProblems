package LeetCode.Problems.Easy.LinkedList;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode l2 = new ListNode(2, new ListNode(4, new ListNode(5)));
        mergeTwoLists(l1, l2).print();
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

        public void print(){
            ListNode l = this;
            while (l.next!=null){
                System.out.println(l.val);
                l=l.next;
            }
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode start = new ListNode();
        ListNode l3 = start;
        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    l3.next = l1;
                    l1 = l1.next;
                } else {
                    l3.next = l2;
                    l2 = l2.next;
                }
            } else if (l1 == null) {
                l3.next = l2;
                l2 = l2.next;
            } else if (l2 == null) {
                l3.next = l1;
                l1 = l1.next;
            }
            l3=l3.next;
        }
        return start.next;
    }


}
