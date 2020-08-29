package ListNode;

import java.util.HashSet;

public class ZJ56_deleteDuplication {
    //1.将重复节点全部删除
    public static ListNode deleteDuplication(ListNode pHead){
        if(pHead==null){
            return null;
        }
        HashSet<Integer> set=new HashSet<>();
        ListNode head=new ListNode(0);
        head.next=pHead;
        ListNode nextnode=pHead;
        ListNode curnode=head;
        while (nextnode!=null){
            if(nextnode.next!=null&&nextnode.val==nextnode.next.val){
                while (nextnode.next!=null&&nextnode.val==nextnode.next.val){
                    nextnode=nextnode.next;
                }
                //nextnode=nextnode.next;//2.此处将重复节点删后还剩一个
                curnode.next=nextnode;
            }else {
                curnode=nextnode;
                nextnode=nextnode.next;
            }
        }
        return head.next;
    }
    public static void main(String[] args) {
        ListNode list=new ListNode(1);
        list.next=new ListNode(2);
        list.next.next=new ListNode(3);
        list.next.next.next=new ListNode(3);
        list.next.next.next.next=new ListNode(4);
        list.next.next.next.next.next=new ListNode(4);
        list.next.next.next.next.next.next=new ListNode(5);
        ListNode l=deleteDuplication(list);
        while (l!=null){
            System.out.print(l.val+" ");
            l=l.next;
        }

    }
}
