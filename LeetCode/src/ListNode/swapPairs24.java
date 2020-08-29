package ListNode;

import org.junit.Test;

//给定一个链表，两两交换其中相邻的节点，并返回交换后的链表
public class swapPairs24 {
    //迭代法
    /*public ListNode swapPairs(ListNode head) {
        ListNode list=new ListNode(-1);
        list.next=head;
        ListNode pre=list;
        while(pre.next!=null && pre.next.next!=null){
            ListNode l1=pre.next;
            ListNode l2=pre.next.next;
            ListNode next=l2.next;
            l1.next=next;
            l2.next=l1;
            pre.next=l2;
            pre=l1;
        }
        return list.next;
    }*/
    //递归法
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        //节点交换
        ListNode first=head;
        ListNode second=head.next;
        //交换
        first.next=swapPairs(second.next);
        second.next=first;
        return second;
    }
    @Test
    public void Test(){
        ListNode listNode=new ListNode(1);
        listNode.next=new ListNode(2);
        listNode.next.next=new ListNode(3);
        listNode.next.next.next=new ListNode(4);
        listNode.next.next.next.next=new ListNode(5);
        ListNode pre=listNode;
        while (pre!=null) {
            System.out.print(pre.val+" ");
            pre=pre.next;
        }
        System.out.println();
        ListNode list=swapPairs(listNode);
        while (list!=null) {
            System.out.print(list.val+" ");
            list=list.next;
        }
    }

}
