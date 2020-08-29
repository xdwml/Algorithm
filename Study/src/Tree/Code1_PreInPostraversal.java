package Tree;

import java.util.Stack;

public class Code1_PreInPostraversal {
    public static void main(String[] args) {

        Node head=new Node(5);
        head.left=new Node(3);
        head.right=new Node(8);
        head.left.left=new Node(2);
        head.left.right=new Node(4);
        head.left.left.left=new Node(1);
        head.right.left=new Node(7);
        head.right.right=new Node(10);
        head.right.right.left=new Node(9);
        head.right.right.right=new Node(11);
        head.right.left.left=new Node(6);
        System.out.println("==========================二叉树初始化============================");
        printTree(head);
        System.out.println("============递归版============");
        System.out.print("先序：");
        PreOrder(head);
        System.out.println();
        System.out.print("中序：");
        InOrder(head);
        System.out.println();
        System.out.print("后序：");
        PostOrder(head);
        System.out.println();
        System.out.println("============非递归版============");
        System.out.print("先序：");
        PreOrderUnRec(head);
        System.out.print("中序：");
        InOrderUnRec(head);
        System.out.print("后序：");
        PostOrderUnRec(head);
    }
    //定义二叉树结构
    public static class Node{
        public int value;
        public Node left;
        public Node right;
        public Node(int val) {
            this.value = val;
        }
    }
    /*********************打印二叉树****************************/
    public static void printTree(Node head) {
        System.out.println("Binary Tree:");
        printInOrder(head, 0, "H", 17);
        System.out.println();
    }

    public static void printInOrder(Node head, int height, String to, int len) {
        if (head == null) {
            return;
        }
        printInOrder(head.right, height + 1, "v", len);
        String val = to + head.value + to;
        int lenM = val.length();
        int lenL = (len - lenM) / 2;
        int lenR = len - lenM - lenL;
        val = getSpace(lenL) + val + getSpace(lenR);
        System.out.println(getSpace(height * len) + val);
        printInOrder(head.left, height + 1, "^", len);
    }

    public static String getSpace(int num) {
        String space = " ";
        StringBuffer buf = new StringBuffer("");
        for (int i = 0; i < num; i++) {
            buf.append(space);
        }
        return buf.toString();
    }
    /**************************递归遍历**************************/
    //先序遍历
    public static void PreOrder(Node head){
       if(head==null){
           return;
       }
       System.out.print(head.value+" ");
       PreOrder(head.left);
       PreOrder(head.right);
    }
    //中序遍历
    public static void InOrder(Node head){
        if(head==null){
            return;
        }
        InOrder(head.left);
        System.out.print(head.value+" ");
        InOrder(head.right);
    }
    //后序遍历
    public static void PostOrder(Node head){
        if(head==null){
            return;
        }
        PostOrder(head.left);
        PostOrder(head.right);
        System.out.print(head.value+" ");
    }
    /***********************非递归遍历***********************************/
    //先序遍历
    public static void PreOrderUnRec(Node head){
        if(head!=null){
            Stack<Node> stack=new Stack<Node>();
            stack.push(head);
            while (!stack.isEmpty()){
                head=stack.pop();
                System.out.print(head.value+" ");
                if(head.right!=null){
                    stack.push(head.right);
                }
                if(head.left!=null){
                    stack.push(head.left);
                }
            }
        }
        System.out.println();
    }
    //中序遍历
    public static void InOrderUnRec(Node head){
        if(head!=null){
            Stack<Node> stack=new Stack<Node>();
            while (!stack.isEmpty()||head!=null){
                if(head!=null){
                    stack.push(head);//压栈
                    head=head.left;
                }
                else{
                    head=stack.pop();//弹栈
                    System.out.print(head.value+" ");
                    head=head.right;
                }
            }
        }
        System.out.println();
    }
    //后续遍历1
    public static void PostOrderUnRec(Node head){
        if(head!=null){
            Stack<Node> stack1=new Stack<Node>();
            Stack<Node> stack2=new Stack<Node>();
            stack1.push(head);
            while (!stack1.isEmpty()){
                head=stack1.pop();//弹栈
                stack2.push(head);//压栈
                if(head.left!=null){
                    stack1.push(head.left);
                }
                if(head.right!=null){
                    stack1.push(head.right);
                }
            }
            while (!stack2.isEmpty()){
                System.out.print(stack2.pop().value+" ");
            }
        }
        System.out.println();
    }

}
