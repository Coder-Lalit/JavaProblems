package LeetCode.Problems.Easy.LinkedList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LinkedListCycle {

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
            while (l!=null){
                System.out.println(l.val);
                l=l.next;
            }
        }
    }
    
    public static void main(String args []){
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3)));
        System.out.println(l1.next.next.val);
        l1.next.next.next=l1.next;
        //l1.print();
        System.out.println(hasCycle(l1));

    }

    public static boolean hasCycle(ListNode head) {
        List<ListNode> listNodes = new ArrayList<>();
        if(head==null) return false;
        while(head !=null){
            if(listNodes.contains(head.next)){
                return true;
            }
            listNodes.add(head);
            head=head.next;
        }
        return false;
    }
    
}
