package ListNode;

import org.junit.Test;

public class reveristNode {
    public ListNode reverListNode(ListNode listNode){
        ListNode pre=null;
        ListNode cur=listNode;
        ListNode next=null;
        while (cur!=null){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;

    }

    @Test
    public void test(){
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        ListNode list=reverListNode(head);
        while (list!=null){
            System.out.print(list.val+"-->");
            list=list.next;
        }
    }

}
