package LeetCode.Problems.Easy.LinkedList;

public class RemoveDuplicatesFromSortedList {
    public static void main(String args[]) {
        deleteDuplicates(new ListNode(1,new ListNode(1,new ListNode(2)))).print();
    }


    public static ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while(cur!=null && cur.next!=null){
            if(cur.val==cur.next.val){
                cur.next = cur.next.next;
            }
            else{
                cur=cur.next;
            }
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

        public void print(){
            ListNode l= this;
            while(l!=null){
                System.out.println(l.val);
                l=l.next;
            }
        }
    }
}
