package ListNode;

import org.junit.Test;
//给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。
public class sumTwoListNode {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre=new ListNode(-1);
        ListNode head=pre;
        int carry=0;
        while (l1!=null || l2 !=null){
            int x=(l1!=null)?l1.val:0;
            int y=(l2!=null)?l2.val:0;
            int sum=carry+x+y;
            carry=sum/10;

            head.next=new ListNode(sum%10);
            head=head.next;
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
        }
        if(carry>0){
            head.next=new ListNode(carry);
        }
        return pre.next;
    }
    @Test
    public void test(){
        ListNode l1=new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(3);
        ListNode l2=new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);
        ListNode listNode=addTwoNumbers(l1,l2);
        while (listNode!=null){
            System.out.print(listNode.val+" ");
            listNode=listNode.next;
        }

    }
}
