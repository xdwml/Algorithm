package ListNode;

public class mergeListNode {
    public static void main(String [] args){
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        ListNode head1=new ListNode(0);
        head1.next=new ListNode(1);
        head1.next.next=new ListNode(2);
        head1.next.next.next=new ListNode(7);
        head1.next.next.next.next=new ListNode(8);
        ListNode list=mergeListNode(head,head1);
        while (list!=null){
            System.out.print(list.val+"-->");
            list=list.next;
        }
    }

    public static ListNode mergeListNode(ListNode l1,ListNode l2){

        ListNode pre=new ListNode(-1);
        ListNode cur=pre;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                cur.next=l1;
                l1=l1.next;
            }else{
                cur.next=l2;
                l2=l2.next;
            }
            cur=cur.next;
        }
        if(l1==null){
            cur.next=l2;
        }
        if(l2==null){
            cur.next=l1;
        }
        return pre.next;
    }
}
