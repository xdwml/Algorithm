package Top100;

import org.junit.Test;

public class removeNthFromEnd {
    //方法1：两次遍历算法
    /*public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode list=new ListNode(-1);
        list.next=head;
        int len=0;
        ListNode pre=list;
        while (pre!=null){
            len++;
            pre=pre.next;
        }
        len=len-n;
        pre=list;
        while (len>0){
            len--;
            pre=pre.next;
        }
        pre.next=pre.next.next;
        return list.next;
    }*/
    //方法2：一次遍历法，双指针
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode list=new ListNode(-1);
        list.next=head;
        ListNode fast=list;
        ListNode slow=list;
        for(int i=1;i<=n+1;i++){

            fast=fast.next;
        }
        while (fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return list.next;
    }
    @Test
    public void Test(){
        ListNode listNode=new ListNode(1);
        listNode.next=new ListNode(2);
        listNode.next.next=new ListNode(3);
        listNode.next.next.next=new ListNode(4);
        listNode.next.next.next.next=new ListNode(5);
        ListNode list=removeNthFromEnd(listNode, 2);
        while (list!=null) {
            System.out.print(list.val+" ");
            list=list.next;
        }

    }

}
