package 面试题;

import org.junit.Test;

import java.util.Stack;

/**
 * 遍历二叉树：先序、中序、后序，递归与非递归法，深度遍历与广度遍历
 */
public class PreInPostPrintTree {
    /********************递归遍历***********************/
    //先序遍历：中左右
    public void preprintTree(TreeNode treeNode){
        if(treeNode==null){
            return;
        }
        System.out.print(treeNode.val);
        preprintTree(treeNode.left);
        preprintTree(treeNode.right);
    }
    //中序遍历：左中右
    public void inprintTree(TreeNode treeNode){
        if(treeNode==null){
            return;
        }
        inprintTree(treeNode.left);
        System.out.print(treeNode.val);
        inprintTree(treeNode.right);
    }
    //后序遍历：左右中
    public void postprintTree(TreeNode treeNode){
        if(treeNode==null){
            return;
        }
        postprintTree(treeNode.left);
        postprintTree(treeNode.right);
        System.out.print(treeNode.val);
    }
    /********************非递归遍历***********************/
    //非递归先序遍历：中左右
    public void preprintTreeNot(TreeNode treeNode){
        if(treeNode==null){
            return;
        }
        Stack<TreeNode> stack=new Stack<>();
        stack.push(treeNode);//压栈头结点
        while (!stack.empty()){
            TreeNode head=stack.pop();//弹出头结点
            System.out.print(head.val);//打印头结点
            if(head.right!=null){
                stack.add(head.right);//若该节点有右子树，先压右子树
            }
            if(head.left!=null){
                stack.add(head.left);//若该节点有左子树，再压左子树
            }
        }
    }
    //非递归中序遍历：左中右
    public void inprintTreeNot(TreeNode head){
        if(head==null){
            return;
        }
        Stack<TreeNode> stack=new Stack<>();
        while (!stack.empty() || head!=null) {
            if (head != null) {
                stack.push(head);//压栈头结点
                head = head.left;//存在左节点一直压左节点
            } else {
                head = stack.pop();//若节点为空，弹出一个
                System.out.print(head.val);//打印节点
                head = head.right;//寻找右子树
            }
        }
    }
    //非递归后序遍历：左右中
    public void postprintTreeNot(TreeNode head){
        if(head==null){
            return;
        }
        Stack<TreeNode> stack=new Stack<>();
        Stack<TreeNode> stack2=new Stack<>();
        stack.push(head);
        while (!stack.empty()) {
            head=stack.pop();//弹出头结点
            stack2.push(head);//压入第二个栈
            if(head.left!=null){
                stack.add(head.left);//若该节点有左子树，再压左子树
            }
            if(head.right!=null){
                stack.add(head.right);//若该节点有右子树，先压右子树
            }
        }
        while (!stack2.isEmpty()){
            System.out.print(stack2.pop().val);
        }
    }
    @Test
    public void test(){
        TreeNode treeNode=new TreeNode(1);
        treeNode.left=new TreeNode(2);
        treeNode.right=new TreeNode(3);
        treeNode.left.left=new TreeNode(4);
        treeNode.left.right=new TreeNode(5);
        treeNode.right.left=new TreeNode(6);
        treeNode.right.right=new TreeNode(7);
        System.out.println("***********************递归遍历*************************");
        System.out.println("递归先序遍历");
        preprintTree(treeNode);//先序遍历
        System.out.println();
        System.out.println("递归中序遍历");
        inprintTree(treeNode);//中序遍历
        System.out.println();
        System.out.println("递归后序遍历");
        postprintTree(treeNode);//后序遍历
        System.out.println();
        System.out.println("***********************非递归遍历*************************");
        System.out.println("非递归先序遍历");
        preprintTreeNot(treeNode);//先序遍历
        System.out.println();
        System.out.println("非递归中序遍历");
        inprintTreeNot(treeNode);//中序遍历
        System.out.println();
        System.out.println("非递归后序遍历");
        postprintTreeNot(treeNode);//中序遍历
    }
}
