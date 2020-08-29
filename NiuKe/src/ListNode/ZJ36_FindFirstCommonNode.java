package ListNode;

import org.junit.Test;

import java.util.Stack;

//两个链表的第一个公共节点
public class ZJ36_FindFirstCommonNode {
    //方法1:双指针法
    public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1==null||pHead2==null){
            return null;
        }
        ListNode p1=pHead1;
        ListNode p2=pHead2;
        while (p1!=p2) {
            p1=p1==null?pHead2:p1.next;
            p2=p2==null?pHead1:p2.next;
        }
        return p1;
    }
    public static void main(String[] args) {
        ListNode list1=new ListNode(1);
        list1.next=new ListNode(2);
        list1.next.next=new ListNode(3);
        list1.next.next.next=new ListNode(6);
        list1.next.next.next.next=new ListNode(7);
        ListNode list2=new ListNode(4);
        list2.next=new ListNode(5);
        list2.next.next=new ListNode(6);
        list2.next.next.next=new ListNode(7);

        System.out.print(FindFirstCommonNode(list1,list2));
    }
}
