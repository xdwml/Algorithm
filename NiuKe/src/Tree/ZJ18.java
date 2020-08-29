package Tree;
//操作给定的二叉树，将其变换为源二叉树的镜像。
public class ZJ18 {
    public static void Mirror(TreeNode root) {
        if(root==null){
            return;
        }
        if(root.left==null &&root.right==null){
            return;
        }
        TreeNode node=root.left;
        root.left=root.right;
        root.right=node;
        if(root.left!=null){
            Mirror(root.left);
        }
        if(root.right!=null){
            Mirror(root.right);
        }

    }

    public static void main(String[] args) {
        TreeNode head=new TreeNode(8);
        head.left=new TreeNode(7);
        head.right=new TreeNode(6);
        head.left.left=new TreeNode(5);
        head.left.right=new TreeNode(4);
        head.right.left=new TreeNode(3);
        head.right.right=new TreeNode(2);
        printTree(head);
        Mirror(head);
        printTree(head);

    }

    public static void printTree(TreeNode head) {
        System.out.println("Binary Tree:");
        printInOrder(head, 0, "H", 17);
        System.out.println();
    }

    public static void printInOrder(TreeNode head, int height, String to, int len) {
        if (head == null) {
            return;
        }
        printInOrder(head.right, height + 1, "v", len);
        String val = to + head.val + to;
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
}
