package ListNode;

import org.junit.Test;

import java.util.LinkedList;

public class reverseList206 {
    //头插法
    /*public ListNode reverseList(ListNode head) {
        if(head==null) return head;
        ListNode pre=null;
        ListNode next=head.next;
        while(next!=null){
            head.next=pre;
            pre=head;
            head=next;
            next=next.next;
        }
        head.next=pre;
        return head;
    }*/
    //递归法
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode next=head.next;
        ListNode newHead=reverseList(next);
        next.next=head;
        head.next=null;
        return newHead;
    }
    @Test
    public void Test(){
        ListNode listNode=new ListNode(0);
        listNode.next=new ListNode(2);
        listNode.next.next=new ListNode(3);
        listNode.next.next.next=new ListNode(4);
        listNode.next.next.next.next=new ListNode(5);

        ListNode list=reverseList(listNode);

        while (list!=null) {
            System.out.print(list.val+" ");
            list=list.next;
        }

    }
}
