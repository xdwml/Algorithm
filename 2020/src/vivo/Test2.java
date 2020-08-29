package vivo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
//力扣-合并有序链表
public class Test2 {
    private static ArrayList<Integer> lines;
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public static void main(String[] args) {
        lines = new ArrayList<>();
        Scanner scanner = null;
        String s;
        try {
            scanner = new Scanner(System.in);
            while (scanner.hasNextLine()) {
                int a = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < a; i++) {
                    s = scanner.nextLine();
                    String[] str = s.split(" ");
                    for (int j = 0; j < str.length; j++) {
                        lines.add(Integer.parseInt(str[j]));
                    }
                }
                break;
            }
            Comparator<Integer> comparator = new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1-o2;
                }
            };
            lines.sort(comparator);
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        ListNode t=mergeNodes(null);
        while (t!=null){
            System.out.print(t.val+" ");
            t=t.next;
        }
        System.out.println();
    }
    public static ListNode merge() {
        ListNode head=new ListNode(lines.get(0));
        ListNode tmp=head;
        for (int i = 1; i < lines.size(); i++) {
            tmp.next=new ListNode(lines.get(i));
            tmp=tmp.next;
        }
        return head;
    }
    private static ListNode mergeNodes(ListNode head) {
        return merge();
    }
}
