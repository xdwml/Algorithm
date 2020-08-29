package Tree;

public class Code4_Serialize {
    /*
    二叉树的序列化和反序列化
     */
    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int data) {
            this.value = data;
        }
    }

    public static void main(String[] args) {
        Node head = null;
        printTree(head);

        head = new Node(1);
        head.left = new Node(2);
        head.right = new Node(3);
        head.left.left = new Node(4);
        head.right.right = new Node(5);
        printTree(head);

        String pre = serializeByPre(head);
        System.out.println("serialize tree by pre-order: " + pre);
        /*head = reconByPreString(pre);
        System.out.print("reconstruct tree by pre-order, ");
        printTree(head);*/
    }


    public static String serializeByPre(Node head){
        if(head==null){
            return "#!";
        }
        String res=head.value+"!";
        res+=serializeByPre(head.left);
        res+=serializeByPre(head.right);
        return res;
    }


    // 测试目的--打印二叉树
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
    /**打印二叉树***/
}
