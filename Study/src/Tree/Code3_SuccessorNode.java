package Tree;

public class Code3_SuccessorNode {
    /**
     * 后继节点，中序遍历中的后一个节点
     * @param args
     */
    public static void main(String[] args) {
        Node head = new Node(6);
        head.parent = null;
        head.left = new Node(3);
        head.left.parent = head;
        head.left.left = new Node(1);
        head.left.left.parent = head.left;
        head.left.left.right = new Node(2);
        head.left.left.right.parent = head.left.left;
        head.left.right = new Node(4);
        head.left.right.parent = head.left;
        head.left.right.right = new Node(5);
        head.left.right.right.parent = head.left.right;
        head.right = new Node(9);
        head.right.parent = head;
        head.right.left = new Node(8);
        head.right.left.parent = head.right;
        head.right.left.left = new Node(7);
        head.right.left.left.parent = head.right.left;
        head.right.right = new Node(10);
        head.right.right.parent = head.right;

        Node test = head.left.left;//1
        System.out.println(test.value + " next: " + getSuccessorNode(test).value);


    }
    public static class Node {
        public int value;
        public Node left;
        public Node right;
        public Node parent;
        public Node(int data) {
            this.value = data;
        }
    }
    public static Node getSuccessorNode(Node node) {
        if(node==null){
            return node;
        }
        //如果有右子树，返回右子树中最左的节点
        if(node.right!=null){
            return getLeftMostNode(node.right);//返回右子树中最左的节点
        }
        //若无右子树，查找父节点，直到子节点是父节点的左子树时返回父节点
        else{
            Node parent=node.parent;
            //若父节点左子树为空，继续向上找父节点
            while(parent!=null && parent.left==node){
                node=parent;
                parent=node.parent;
           }
            return parent;
        }
       
    }
    //返回右子树中最左的节点
    public static Node getLeftMostNode(Node node){
        if(node == null){
            return node;
        }
        while (node.left!=null){
            node = node.left;
        }
        return node;
    }
}
