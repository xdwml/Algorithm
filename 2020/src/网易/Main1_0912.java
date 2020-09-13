package 网易;
import org.junit.Test;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Main1_0912 {
    class TreeNode {
        int val = 0;
        public TreeNode left = null;
        public TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    public int printFromTopToBottom(TreeNode root){
        if(root==null) return 0;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int count=0;
        while (!queue.isEmpty()){
            TreeNode node=queue.poll();
            if(node.left!=null && node.right!=null
                    && node.left.right==null && node.left.left==null
                    && node.right.left==null && node.right.left==null){
                count++;
            }
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }
        return count;
    }
    @Test
    public void test(){
        /*TreeNode head=new TreeNode(1);
        head.left=new TreeNode(2);
        head.right=new TreeNode(3);
        head.left.left=new TreeNode(4);
        head.left.right=new TreeNode(5);
        head.right.left=new TreeNode(6);
        head.right.right=new TreeNode(7);
        System.out.println(printFromTopToBottom(head));*/
        TreeNode head2=new TreeNode(1);
        head2.left=new TreeNode(2);
        head2.right=new TreeNode(3);
        head2.left.left=new TreeNode(4);
        head2.left.right=new TreeNode(5);
        head2.right.right=new TreeNode(6);
        head2.right.right.left=new TreeNode(7);
        head2.right.right.right=new TreeNode(8);
        head2.right.right.right.left=new TreeNode(9);
        head2.right.right.right.right=new TreeNode(10);
        System.out.println(printFromTopToBottom(head2));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for (int i = 0; i <n ; i++) {
            String str=sc.nextLine();
            String[] split = str.split(" ");

        }
    }
}
