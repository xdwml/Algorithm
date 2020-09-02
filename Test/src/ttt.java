import org.junit.Test;

import java.util.Stack;

public class ttt {

    public void PrePrintTree(TreeNode head){
        if(head==null) return;
        Stack<TreeNode> stack=new Stack<>();
        stack.push(head);
        while (!stack.isEmpty()){
            head=stack.pop();
            System.out.print(head.val);
            if(head.right!=null){
                stack.push(head.right);
            }
            if(head.left!=null){
                stack.push(head.left);
            }
        }

    }
    public void InPrintTree(TreeNode head){
        if(head==null) return;
        Stack<TreeNode> stack=new Stack<>();
        while (!stack.isEmpty() || head!=null){
            if(head!=null){
                stack.push(head);
                head=head.left;
            }else {
                head=stack.pop();
                System.out.print(head.val);
                head=head.right;
            }
        }
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

        PrePrintTree(head);
        System.out.println();
        InPrintTree(head);

        StringBuffer stringBuffer=new StringBuffer();
        StringBuilder stringBuilder=new StringBuilder();
        Integer

    }
}
