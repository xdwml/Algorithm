package Tree;
//判断二叉树的后继节点，即中序遍历的下一节点
public class ZJ57 {

    public TreeLinkNode GetNext(TreeLinkNode pNode){
        if(pNode==null) return null;
        //1.若有右子树，后继为该阶段右子树上最左的节点
        if(pNode.right!=null){
            TreeLinkNode pRight=pNode.right;
            if(pRight.left!=null){
                pRight=pRight.left;
            }
            return pRight;
        }
        //2.若无右子树，一直向上找父节点，直到该节点是父节点的左孩子，该父节点就是后继
        else{
            TreeLinkNode pNext=pNode.next;
            while (pNext!=null && pNext.left!=pNode){
                pNode=pNext;
                pNext=pNode.next;
            }
            return pNext;
        }
    }
}
