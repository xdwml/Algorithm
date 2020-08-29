package ListNode;

import org.junit.Test;
//输入两个单调递增的链表，输出两个链表合成后的链表
public class mergeTwoListNode {
    public ListNode mergeTwoListNode(ListNode list1,ListNode list2){
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode head=new ListNode(-1);
        ListNode cur=head;
        while (list1!=null && list2!=null){
            if(list1.val<=list2.val){
                cur.next=list1;
                list1=list1.next;
                cur=cur.next;
            }else {
                cur.next=list2;
                list2=list2.next;
                cur=cur.next;
            }
        }

        cur.next=(list1!=null)?list1:list2;
        return head.next;
    }
    @Test
    public void test(){
        ListNode head=new ListNode(1);
        head.next=new ListNode(3);
        head.next.next=new ListNode(6);
        ListNode head2=new ListNode(2);
        head2.next=new ListNode(3);
        head2.next.next=new ListNode(5);
        ListNode list=mergeTwoListNode(head,head2);
        while (list!=null) {
            System.out.print(list.val+" ");
            list=list.next;
        }
    }
}
