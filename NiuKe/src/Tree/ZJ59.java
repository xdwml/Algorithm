package Tree;
import java.util.ArrayList;
import java.util.LinkedList;
//之字形打印二叉树
public class ZJ59 {
    public static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        LinkedList<TreeNode> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        boolean rev = true;//标志位
        q.add(pRoot);//加入链表
        while (!q.isEmpty()) {//判断链表是否为空
            int size = q.size();//
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                if (node == null) {
                    continue;
                }
                if (rev) {//
                    list.add(node.val);
                } else {
                    list.add(0, node.val);//在0位置插入，已有元素后移
                }
                q.add(node.left);
                q.add(node.right);
            }
            if (list.size() != 0) {
                res.add(list);
            }
            rev = !rev;//将反向输入
        }
        return res;
    }
    public static void main(String[] args) {
        TreeNode head = new TreeNode(5);
        head.left = new TreeNode(3);
        head.right = new TreeNode(8);
        head.left.left = new TreeNode(2);
        head.left.right = new TreeNode(4);
        head.left.left.left = new TreeNode(1);
        head.right.left = new TreeNode(7);
        head.right.left.left = new TreeNode(6);
        head.right.right = new TreeNode(10);
        head.right.right.left = new TreeNode(9);
        head.right.right.right = new TreeNode(11);
        ArrayList<ArrayList<Integer>> arrayList=Print(head);
        System.out.println(arrayList);
    }
}