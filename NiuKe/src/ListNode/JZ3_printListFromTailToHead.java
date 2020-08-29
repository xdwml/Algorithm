package ListNode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 输入一个链表，按链表从尾到头的顺序输出一个ArrayList
 */
public class JZ3_printListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        Stack<ListNode> stack=new Stack<>();
        ListNode head=listNode;
        while (head!=null){
            stack.push(head);
            head=head.next;
        }
        while (!stack.isEmpty()){
            arrayList.add(stack.pop().val);
        }
        return arrayList;
    }
    @Test
    public void test(){
        ListNode listNode=new ListNode(5);
        listNode.next=new ListNode(6);
        listNode.next.next=new ListNode(2);
        listNode.next.next.next=new ListNode(1);

        ArrayList<Integer> arrayList = printListFromTailToHead(listNode);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i)+" ");
        }


    }

}
