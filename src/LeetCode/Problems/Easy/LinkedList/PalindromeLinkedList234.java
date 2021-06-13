package LeetCode.Problems.Easy.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList234 {

    public static void main(String[] args) {
        ListNode h = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(2,new ListNode(1)))));
        ListNode h1 = new ListNode(1,new ListNode(2,new ListNode(2,new ListNode(1))));
        //System.out.println(isPalindrome(h1));
        //System.out.println(isPalindrome2(h));
        //System.out.println(isPalindrome2(h1));
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        public ListNode() {
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

    public static boolean isPalindrome(ListNode head) {
        ListNode s2ndHalf =reverseList(endOfFirstHalf(head).next);
        boolean res =true;
        while(res && s2ndHalf!=null){
            if(head.val!=s2ndHalf.val)
                res=false;
            s2ndHalf=s2ndHalf.next;
            head=head.next;
        }
        return res;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode pre=null;
        ListNode cur=head;
        while(cur!=null){
            ListNode temp = cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        return pre;
    }

    public static ListNode endOfFirstHalf(ListNode head) {
        ListNode f = head;
        ListNode s = head;

        while(f.next!=null && f.next.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }

    public static boolean isPalindrome2(ListNode head) {
        ListNode f = head;
        ListNode s = head;
        boolean res=true;
        List<Integer> ints = new ArrayList<>();
        ints.add(s.val);
        while(f.next!=null && f.next.next!=null){
            s=s.next;
            ints.add(s.val);
            f=f.next.next;
        }
        s=ints.size()%2==0?s.next:s;
        int count=1;
        while(res && s!=null){
            if(s.val!=(int)ints.get(ints.size()-count))
                res =false;
            s=s.next;
            count++;
        }
        return res;
    }

}
