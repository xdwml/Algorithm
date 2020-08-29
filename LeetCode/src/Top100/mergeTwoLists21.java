package Top100;
//合并两个有序链表
public class mergeTwoLists21 {
    //方法1：递归
    /*public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode list=null;

        if(l1.val<=l2.val){
            list=l1;
            list.next=mergeTwoLists(l1.next,l2);
        }else {
            list=l2;
            list.next=mergeTwoLists(l1,l2.next);
        }
        return list;
    }*/
    //方法2：暴力解法
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode list=new ListNode(-1);
        ListNode pre=list;
        while (l1!=null&&l2!=null){
            if(l1.val<=l2.val){
                pre.next=l1;
                l1=l1.next;
            }else {
                pre.next=l2;
                l2=l2.next;
            }
            pre=pre.next;
        }
        //合并后做最多还有一个没有合并完
        /**/
        //方法1
        //pre.next=l1==null?l2:l1;
        /***/
        //方法2,以下两个只能有一个可以执行
        if(l1!=null){
            pre.next=l1;
        }
        if(l2!=null){
            pre.next=l2;
        }
        /****/
        return list.next;
    }
}
