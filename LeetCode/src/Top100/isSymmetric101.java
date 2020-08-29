package Top100;

import org.junit.Test;
//判断对称二叉树
public class isSymmetric101 {

    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return isCommon(root.left,root.right);
    }
    private boolean isCommon(TreeNode left, TreeNode right) {
        //情况1：如果两棵树都为空，返回真
        if(left==null&&right==null) return true;
        //情况2：如果两棵树有一颗树为空，返回假
        if(left==null||right==null) return false;
        //情况2：递归判断左右子树值是否相等
        return left.val==right.val && isCommon(left.left,right.right)
                &&isCommon(left.right,right.left);
    }

    /*public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return isCommon(root.left,root.right);
    }

    private boolean isCommon(TreeNode left, TreeNode right) {
        if(left==null&&right==null) return true;
        if(left!=null&&right!=null){//如果子树不为空
            return left.val==right.val //判断值是否相等
                    &&isCommon(left.left,right.right)
                    &&isCommon(left.right,right.left);
        }
        return false;//其他情况均为false，包括左右不等情况和左右有一个空的情况
    }*/
    @Test
    public void test(){
        TreeNode head=new TreeNode(8);
        head.left=new TreeNode(7);
        head.right=new TreeNode(7);
        head.left.left=new TreeNode(5);
        head.left.right=new TreeNode(5);
        head.right.left=new TreeNode(2);
        head.right.right=new TreeNode(2);
        System.out.println(isSymmetric(head));
    }
}
