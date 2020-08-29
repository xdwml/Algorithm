package Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//层序遍历二叉树
public class ZJ22 {
    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        ArrayList<TreeNode> queue=new ArrayList<>();
        if(root==null){
            return arrayList;
        }
        queue.add(root);
        for (int i=0;i<queue.size();i++){
            TreeNode node =queue.get(i);
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
            arrayList.add(node.val);
        }
        return arrayList;

    }
    /*public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null){
            return arrayList;
        }
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node =queue.poll();
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
            arrayList.add(node.val);
        }
        return arrayList;

    }*/
    public static void main(String[] args) {
        TreeNode head=new TreeNode(1);
        head.left=new TreeNode(2);
        head.right=new TreeNode(3);
        head.left.left=new TreeNode(4);
        head.left.right=new TreeNode(5);
        head.right.left=new TreeNode(6);
        head.right.right=new TreeNode(7);
        ArrayList<Integer> arrayList=PrintFromTopToBottom(head);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i)+" ");
        }
    }
}
