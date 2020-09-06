package ReDo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class T22_printFromTopToBottom {
    public ArrayList<Integer> printFromTopToBottom(TreeNode root){
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null) return list;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node=queue.poll();
            list.add(node.val);
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }
        return list;
    }
    @Test
    public void test(){
        TreeNode head=new TreeNode(1);
        head.left=new TreeNode(2);
        head.right=new TreeNode(3);
        head.left.left=new TreeNode(4);
        head.left.right=new TreeNode(5);
        head.right.left=new TreeNode(6);
        head.right.right=new TreeNode(7);
        ArrayList<Integer> list=printFromTopToBottom(head);
        System.out.println(list);
    }
}
