package ListNode;
//判断链表是否有交叉
public class interectionNode {
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(3);
        ListNode head1=new ListNode(0);
        head1.next=new ListNode(1);
        head1.next.next=new ListNode(2);
        head1.next.next.next=new ListNode(7);
        head1.next.next.next.next=new ListNode(8);
        //System.out.println(interection(head,head1));
    }
    /*public static boolean interection(ListNode l1,ListNode l2){
        if(isLoop(l1) && !isLoop(l2) || (!isLoop(l1) && isLoop(l2)){
            return false;
        }else if(isLoop(l1) && isLoop(l2)){
            return true;
        }else {
            return isLoop(l1,l2);
        }
    }*/
    public static boolean isLoop(ListNode l1,ListNode l2){
        ListNode p1=l1;
        ListNode p2=l2;
        while (p1.next!=null){
            p1=p1.next;
        }
        while (p2.next!=null){
            p2=p2.next;
        }
        return p1==p2;
    }
    public static boolean isLoop(ListNode list){
        if(list==null||list.next==null||list.next.next==null){
            return false;
        }
        ListNode slow=list;
        ListNode fast=list;
        while (fast!=slow){
            if(slow.next==null||fast.next.next==null){
                return false;
            }else {
                slow=slow.next;
                fast=fast.next.next;
            }
        }
        return true;
    }
}
