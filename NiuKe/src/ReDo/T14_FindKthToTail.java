package ReDo;

import org.junit.Test;

import java.util.Stack;

public class T14_FindKthToTail {
    //牛客：倒数第k个数
    public ListNode FindKthToTail(ListNode listNode,int k){
        if(listNode==null || k<=0){
            return null;
        }
        ListNode fast=listNode;
        ListNode slow=listNode;
        int a=k;
        int count=0;
        //快指针先走k步
        while (a-->0 && fast!=null){
            count++;
            fast=fast.next;
        }
        //判断是否超出链表长度
        if(a>0 || count<k){
            return null;
        }
        //快慢指针同时走，直到快指针为空
        while (fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
    //力扣：倒数第k个数
    public ListNode FindKthToTail2(ListNode listNode,int k){
        if(listNode==null || k<=0){
            return null;
        }
        ListNode fast=listNode;
        ListNode slow=listNode;
        //快指针先走k步
        while (k-->0){
            fast=fast.next;
        }
        //快慢指针同时走，直到快指针为空
        while (fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
    //牛客:栈方法
    public ListNode FindKthToTail3(ListNode listNode,int k){
        if(listNode==null || k<=0){
            return null;
        }
        Stack<ListNode> stack=new Stack<>();
        ListNode node=listNode;
        stack.push(node);
        while (node!=null){
            stack.push(node);
            node=node.next;
        }
        while ( !stack.isEmpty() &&k-->0 ){
            stack.pop();
        }
        if(k>0){
            return null;
        }else {
            return stack.pop();
        }

    }
    @Test
    public void test(){
        ListNode listNode=new ListNode(1);
        listNode.next=new ListNode(2);
        listNode.next.next=new ListNode(3);
        listNode.next.next.next=new ListNode(4);
        listNode.next.next.next.next=new ListNode(5);

        System.out.println(FindKthToTail(listNode,6).val);
        System.out.println(FindKthToTail2(listNode,4).val);
    }
}
