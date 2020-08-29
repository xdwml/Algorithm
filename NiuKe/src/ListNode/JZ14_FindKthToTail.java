package ListNode;

import org.junit.Test;

import java.util.Stack;

/**
 * 输入一个链表，输出该链表中倒数第k个结点
 */
public class JZ14_FindKthToTail {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null || k<=0){
            return null;
        }

        Stack<ListNode> stack=new Stack<>();
        while (head!=null){
            stack.push(head);
            head=head.next;
            if(stack.size()==k){
                return stack.pop();
            }
        }
        if (stack.size()<k){
            return null;
        }
        int i=1;
        ListNode listNode=null;
        while (i<=k && !stack.isEmpty()){
            listNode=stack.pop();
            i++;
        }
        return listNode;
    }
    @Test
    public void test(){
        ListNode listNode=new ListNode(5);
        listNode.next=new ListNode(6);
        listNode.next.next=new ListNode(2);
        listNode.next.next.next=new ListNode(1);

        System.out.println(FindKthToTail(listNode,3).val);


    }
}
