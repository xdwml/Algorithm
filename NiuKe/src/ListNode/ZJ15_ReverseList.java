package ListNode;

/**
 * 反转链表
 */
public class ZJ15_ReverseList {
    public static ListNode ReverseList(ListNode head) {
        if(head==null ||head.next==null){
            return head;
        }
        ListNode pre=null;
        ListNode next=null;
        while (head!=null){
            next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode listNode=new ListNode(5);
        listNode.next=new ListNode(6);
        listNode.next.next=new ListNode(2);
        listNode.next.next.next=new ListNode(1);
        ListNode node=listNode;
        while (node!=null){
            System.out.print(node.val+"-->");
            node=node.next;
        }
        System.out.println();
        ListNode head = ReverseList(listNode);
        while (head!=null){
            System.out.print(head.val+"-->");
            head=head.next;
        }

    }
}
