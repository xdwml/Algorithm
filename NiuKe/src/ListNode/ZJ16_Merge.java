package ListNode;
//输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
public class ZJ16_Merge {
    public static ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null ){
            return list2;
        }else if(list2==null ){
            return list1;
        }
        ListNode head=null;
        if(list1.val<list2.val){
            head=list1;
            head.next=Merge(list1.next,list2);
        }else{
            head=list2;
            head.next=Merge(list1,list2.next);
        }
        return head;
    }

    public static void main(String[] args) {

        ListNode list1=new ListNode(1);
        list1.next=new ListNode(3);
        list1.next.next=new ListNode(5);
        list1.next.next.next=new ListNode(6);

        ListNode list2=new ListNode(1);
        list2.next=new ListNode(2);
        list2.next.next=new ListNode(4);
        list2.next.next.next=new ListNode(7);

        ListNode head=Merge(list1,list2);
        while (head!=null){
            System.out.print(head.val+"-->");
            head=head.next;
        }

    }
}
