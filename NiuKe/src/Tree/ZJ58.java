package Tree;
//判断对称二叉树
public class ZJ58 {
    public static boolean isSymmetrical(TreeNode root) {
        if(root==null) return true;
        return isCommon(root.left,root.right);
    }
    public static boolean isCommon(TreeNode leftnode,TreeNode rightnode){
        if(leftnode==null && rightnode==null) return true;
        if(leftnode!=null&&rightnode!=null){

            return leftnode.val==rightnode.val&&isCommon(leftnode.left,rightnode.right)
                    &&isCommon(leftnode.right,rightnode.left);
        }
        return false;
    }
    public static void main(String[] args) {
        TreeNode head=new TreeNode(8);
        head.left=new TreeNode(7);
        head.right=new TreeNode(7);
        head.left.left=new TreeNode(5);
        head.left.right=new TreeNode(5);
        head.right.left=new TreeNode(2);
        head.right.right=new TreeNode(2);
        System.out.println(isSymmetrical(head));

    }
}
