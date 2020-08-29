package ListNode;
import org.junit.Test;

public class deleteDuplicates82 {
    //迭代法
    public ListNode deleteDuplicates(ListNode head) {
        ListNode pre=head;
        while(pre!=null && pre.next!=null){
            if(pre.val==pre.next.val){
                pre.next=pre.next.next;
            }else {
                pre=pre.next;
            }
        }
        return head;
    }
    //递归法
    /*public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        head.next = deleteDuplicates(head.next);
        return head.val == head.next.val ? head.next : head;
    }*/
    @Test
    public void Test(){
        ListNode listNode=new ListNode(1);
        listNode.next=new ListNode(1);
        listNode.next.next=new ListNode(2);
        listNode.next.next.next=new ListNode(3);
        listNode.next.next.next.next=new ListNode(3);
        ListNode list=deleteDuplicates(listNode);
        while (list!=null) {
            System.out.print(list.val+" ");
            list=list.next;
        }
        ListNode listNode1=new ListNode(1);
        listNode1.next=new ListNode(1);
        listNode1.next.next=new ListNode(2);

        ListNode list1=deleteDuplicates(listNode1);
        while (list1!=null) {
            System.out.print(list1.val+" ");
            list1=list1.next;
        }
    }
}
