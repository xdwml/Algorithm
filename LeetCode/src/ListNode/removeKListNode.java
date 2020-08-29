package ListNode;

import org.junit.Test;
//给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
public class removeKListNode {
    public ListNode removeKListNode(ListNode listNode,int k){
        ListNode head=new ListNode(-1);
        head.next=listNode;
        ListNode fast=listNode;
        ListNode slow=listNode;
        int len=0;
        while (fast!=null){
            len++;
            fast=fast.next;
        }
        len=len-k;
        while (len>0){
            slow=slow.next;
            len--;
        }
        slow.next=slow.next.next;
        return head.next;

    }
    @Test
    public void test(){
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        ListNode list=removeKListNode(head,3);
        while (list!=null) {
            System.out.print(list.val+" ");
            list=list.next;
        }
    }
}
