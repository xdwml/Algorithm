package Top100;

import org.junit.Test;
//链表两数相加
public class addTwoNumbers2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list=new ListNode(0);
        ListNode p=l1,q=l2,cur=list;
        int carry=0;
        while(p!=null || q!=null){
            int x=(p!=null)?p.val:0;//判断当前节点是否为空
            int y=(q!=null)?q.val:0;//判断当前节点是否为空
            int sum=carry+x+y;
            carry=sum/10;//进位
            cur.next=new ListNode(sum%10);//余数
            cur=cur.next;//将指针指向下一个节点
            if(p!=null){
                p=p.next;
            }
            if(q!=null){
                q=q.next;
            }
            if(carry>0){
                cur.next=new ListNode(carry);
            }
        }
        return list.next;
    }
    @Test
    public void Test(){
        ListNode listNode=new ListNode(3);
        listNode.next=new ListNode(4);
        listNode.next.next=new ListNode(2);
        ListNode listNode2=new ListNode(4);
        listNode2.next=new ListNode(6);
        listNode2.next.next=new ListNode(5);
        ListNode list=addTwoNumbers(listNode, listNode2);
        while (list!=null) {
            System.out.print(list.val+" ");
            list=list.next;
        }

    }
}
