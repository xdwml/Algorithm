package ReDo;

import org.junit.Test;
//合并两个有序链表
public class T16_Merge {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode head=new ListNode(0);
        ListNode cur=head;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                cur.next=list1;
                list1=list1.next;

            }else{
                cur.next=list2;
                list2=list2.next;
            }
            cur=cur.next;
        }
        cur.next=list1==null?list2:list1;
        return head.next;
    }
    @Test
    public void test(){
        ListNode listNode=new ListNode(1);
        listNode.next=new ListNode(3);
        listNode.next.next=new ListNode(4);
        listNode.next.next.next=new ListNode(6);

        ListNode listNode2=new ListNode(2);
        listNode2.next=new ListNode(4);
        listNode2.next.next=new ListNode(5);

        ListNode head=Merge(listNode,listNode2);
        while (head!=null){
            System.out.print(head.val);
            head=head.next;
        }

    }
}
