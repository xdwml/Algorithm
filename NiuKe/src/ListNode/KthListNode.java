package ListNode;

import org.junit.Test;
//输入一个链表，输出该链表中倒数第k个结点。链表中倒数第k个节点也就是正数第(L-K+1)个节点
public class KthListNode {
    //时间复杂度O(n),一次遍历即可
    public ListNode KthListNode(ListNode head,int k){
        if(head==null || k<=0){
            return null;
        }
        ListNode fast=head;
        ListNode slow=head;
        int count=0;
        int index=k;
        while (fast!=null){
            fast=fast.next;
            count++;
            if(index<1){
                slow=slow.next;
            }
            index--;
        }
        if(count<k){
            return null;
        }
        return slow;

    }
    @Test
    public void test(){
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        ListNode list=KthListNode(head,5);
        System.out.println(list);
    }

}
