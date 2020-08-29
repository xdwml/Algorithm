package ListNode;

public class reverseListNode {
    public static void main(String [] args){
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        ListNode list=reverseListNode(head);
        while (list!=null){
            System.out.print(list.val+"-->");
            list=list.next;
        }
    }

    public static ListNode reverseListNode(ListNode head){
        ListNode pre=null;
        ListNode next=null;
        while(head!=null){
            next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
    }
}
