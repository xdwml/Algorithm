package bytedance;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
//二叉树的叶子个数
public class Main1 {
    public static void main(String[] args) {
        /*TreeNode head=new TreeNode(8);
        head.left=new TreeNode(7);
        head.right=new TreeNode(6);
        head.left.left=new TreeNode(5);
        head.left.right=new TreeNode(4);
        head.right.left=new TreeNode(3);
        head.right.right=new TreeNode(2);*/
        //System.out.println(getLeafCount(head));
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] pre=new int[n];
        int[] in=new int[n];
        //sc.nextLine();
        for (int i = 0; i <n; i++) {
            pre[i]=sc.nextInt();
        }
        sc.nextLine();
        for (int i = 0; i <n; i++) {
            in[i]=sc.nextInt();
        }
        sc.nextLine();
        System.out.println(Arrays.toString(pre));
        System.out.println(Arrays.toString(in));
        TreeNode head =buildTree(pre,in);
        System.out.println(getLeafCount(head));
    }
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        int inorderIndex = 0;
        for (int i = 1; i < preorder.length; i++) {
            int preorderVal = preorder[i];
            TreeNode node = stack.peek();
            if (node.val != inorder[inorderIndex]) {
                node.left = new TreeNode(preorderVal);
                stack.push(node.left);
            } else {
                while (!stack.isEmpty() && stack.peek().val == inorder[inorderIndex]) {
                    node = stack.pop();
                    inorderIndex++;
                }
                node.right = new TreeNode(preorderVal);
                stack.push(node.right);
            }
        }
        return root;
    }
    public static int getLeafCount(TreeNode head) {
        if (head == null) {
            return 0;
        }
        if (head.left == null && head.right == null) {
            // 输出叶子节点
            //System.out.println("leaf nodes:" + head.val);
            return 1;
        }
        return getLeafCount(head.left) + getLeafCount(head.right);
    }
}
