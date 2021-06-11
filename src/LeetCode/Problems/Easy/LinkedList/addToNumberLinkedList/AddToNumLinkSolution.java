package LeetCode.Problems.Easy.LinkedList.addToNumberLinkedList;

public class AddToNumLinkSolution {

    public static void main(String[] args) {
        ListNode[] l1 = new ListNode[3];
        ListNode[] l2 = new ListNode[3];

        l1[2] = new ListNode(3);
        l1[1] = new ListNode(4, l1[2]);
        l1[0] = new ListNode(2, l1[1]);

        l2[2] = new ListNode(4);
        l2[1] = new ListNode(6, l2[2]);
        l2[0] = new ListNode(5, l2[1]);

        ListNode a = addTwoNumbers(l1[0], l2[0]);
        while (a != null) {
            System.out.println(a.val);
            a = a.next;
        }

    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0, rem = 0;
        ListNode result = new ListNode(0);
        ListNode curr = result;
        while (l1 != null || l2 != null) {
            int a = l1 != null ? l1.val : 0;
            int b = l2 != null ? l2.val : 0;
            int sum = a + b + carry;
            carry = sum > 9 ? 1 : 0;
            rem = sum % 10;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
            curr.next = new ListNode(rem);
            curr = curr.next;
        }
        if(carry>0){
            curr.next = new ListNode(1);
        }
        return result.next;
    }
}