package ListNode;

import org.junit.Test;

public class getIntersectionNode160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1 = headA, l2 = headB;
        while (l1 != l2) {
            l1 = (l1 == null) ? headB : l1.next;
            l2 = (l2 == null) ? headA : l2.next;
        }
        return l1;
    }
    @Test
    public void Test(){
        ListNode listNode=new ListNode(0);
        listNode.next=new ListNode(2);
        listNode.next.next=new ListNode(3);
        listNode.next.next.next=new ListNode(4);
        listNode.next.next.next.next=new ListNode(5);

        ListNode listNode1=new ListNode(6);
        listNode1.next=new ListNode(9);
        listNode1.next.next=new ListNode(3);
        listNode1.next.next.next=new ListNode(4);
        listNode1.next.next.next.next=new ListNode(5);
        ListNode list=getIntersectionNode(listNode,listNode1);

        System.out.print(list.val);

    }

}
