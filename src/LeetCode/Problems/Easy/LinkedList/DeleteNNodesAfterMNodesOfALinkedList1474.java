package LeetCode.Problems.Easy.LinkedList;

public class DeleteNNodesAfterMNodesOfALinkedList1474 {

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
    }

    public static ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode ans = head;
        while (head!=null){
            int c=1;
            while(head!=null && c<m ){
                c++;
                head=head.next;
            }
            c=0;
            ListNode temp = head;
            while(head!=null && c<n){
                c++;
                head=head.next;
            }
            if(temp != null) temp.next = head!=null? head.next:head;
            if(head != null) head = head.next;
        }
        return ans;
    }


    public static void main(String[] args) {
        ListNode myNode = new ListNode(1,new ListNode(2,new ListNode(3,
                new ListNode(4,new ListNode(5,new ListNode(6,
                        new ListNode(7,new ListNode(8,new ListNode(9,
                                new ListNode(10,new ListNode(11,new ListNode(12, new ListNode(13)))))))))))));
        ListNode listNode = deleteNodes(myNode, 2, 3);
        while(listNode!=null){
            System.out.println(listNode.val);
            listNode=listNode.next;
        }
    }


}
