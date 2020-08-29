package ListNode;

import org.junit.Test;

import java.util.HashSet;

//141.环形链表
public class hasCycle6 {
    //快慢指针法
    public boolean hasCycle(ListNode head){
        if(head==null){
            return false;
        }
        ListNode slow=head;
        ListNode fast=head;
        while (slow!=null && fast!=null && fast.next!=null){
            if(slow==fast){
                return true;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return false;
    }
    //哈希表法
    public boolean hasCycle2(ListNode head){
        HashSet<ListNode> set=new HashSet<>();
        while (head!=null){
            if(set.contains(head)){
                return true;
            }else {
                set.add(head);
            }
            head=head.next;
        }
        return false;
    }

    @Test
    public void test(){
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=head;

        System.out.println(hasCycle(head));
        System.out.println(hasCycle2(head));
    }
}
